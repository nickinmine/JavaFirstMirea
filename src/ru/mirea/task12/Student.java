package ru.mirea.task12;
import java.util.Arrays;
import java.util.Scanner;

public class Student implements Comparable<Student> {
    private final int id;
    private final float gpa;

    public Student(int id, float gpa) {
        this.id = id;
        this.gpa = gpa;
    }

    public float getGpa() { return gpa; }

    @Override
    public int compareTo(Student student) { return Integer.compare(this.id, student.id); }

    @Override
    public String toString() { return "{" + this.id + ", " + this.gpa + "}"; }

    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; ++i) {
            Student key = students[i];
            int j = i - 1;
            for (; j >= 0 && students[j].compareTo(key) > 0; --j) {
                students[j + 1] = students[j];
            }
            students[j + 1] = key;
        }
    }

    public static void mergeSort(Student[] first, Student[] second, Student[] merged) {
        Arrays.sort(first);
        Arrays.sort(second);
        int left = 0, right = 0, i = 0;
        for (; i < merged.length && left < first.length && right < second.length; ++i) {
            merged[i] = first[left].compareTo(second[right]) > 0 ? second[right++] : first[left++];
        }
        if (left == first.length) {
            for (; right < second.length; ++right) {
                merged[i++] = second[right];
            }
        }
        if (right == second.length) {
            for (; left < first.length; ++left) {
                merged[i++] = first[left];
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество элементов: ");
        int size = scanner.nextInt();
        Student[] idNumber = new Student[size];
        for (int i = 0; i < size; i++) {
            System.out.print("ID элемента " + i + ": ");
            int id = scanner.nextInt();
            System.out.print("gpa элемента " + i + ": ");
            float gpa = scanner.nextFloat();
            idNumber[i] = new Student(id, gpa);
        }
        System.out.println("\nИсходный массив:\n" + Arrays.toString(idNumber));
        insertionSort(idNumber);
        System.out.println("Сортировка вставками по айди:\n" + Arrays.toString(idNumber));
        Arrays.sort(idNumber, new SortingStudentsByGPA());
        System.out.println("Сортировка quicksort по среднему баллу:\n" + Arrays.toString(idNumber));

        Student[] arr1 = new Student[5];
        Student[] arr2 = new Student[5];
        Student[] mergedArr = new Student[10];
        arr1[0] = new Student(2, 4.6f);
        arr1[1] = new Student(4, 4.9f);
        arr1[2] = new Student(13, 3.2f);
        arr1[3] = new Student(11, 3.8f);
        arr1[4] = new Student(33, 5);
        arr2[0] = new Student(1, 4);
        arr2[1] = new Student(3, 2.9f);
        arr2[2] = new Student(10, 3.1f);
        arr2[3] = new Student(19, 3);
        arr2[4] = new Student(21, 4.1f);
        mergeSort(arr1, arr2, mergedArr);
        System.out.println("\nСписок:\n" + Arrays.toString(mergedArr));
    }
}
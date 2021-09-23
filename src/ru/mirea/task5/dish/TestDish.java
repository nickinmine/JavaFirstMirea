package ru.mirea.task5.dish;
import java.util.Scanner;
public class TestDish {
    public int size;
    public String material;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cup cup1 = new Cup();
        cup1.setSize(scanner.nextInt());
        cup1.setMaterial(scanner.nextLine());
        FlatPlate plate1 = new FlatPlate();
        plate1.setSize(scanner.nextInt());
        plate1.setMaterial(scanner.nextLine());
        SoupPlate plate2 = new SoupPlate();
        plate2.setSize(scanner.nextInt());
        plate2.setMaterial(scanner.nextLine());
        System.out.println(cup1.getSize() + cup1.getMaterial());
        System.out.println(plate1.toString());
        System.out.println(plate2.toString());
    }
}

package ru.mirea.task19;

public class RecursiveException {
    public static void main(String[] args) throws Exception {
        try {
            exceptionFunc();
        }
        catch (StackOverflowError e) {
            System.out.println("\nИсключение " + e + " перехвачено в main()");
        }
    }

    static public void exceptionFunc() {
        try {
            throw new Exception();
        }
        catch (Exception e) {
            System.out.print("Исключение " + e);
            System.out.println(" перехвачено в методе exceptionFunc()");
            exceptionFunc();
        }
    }
}
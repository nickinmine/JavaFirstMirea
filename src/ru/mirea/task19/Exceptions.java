package ru.mirea.task19;

public class Exceptions {
    public static void main(String[] args) throws Exception {
        try {
            exceptionFunc();
        }
        catch (Exception e) {
            System.out.print("Исключение " + e);
            System.out.println(" перехвачено в методе main()");
        }
    }

    static public void exceptionFunc() {
        try {
            throw new Exception();
        }
        catch (Exception e) {
            System.out.print("Исключение " + e);
            System.out.println(" перехвачено в методе exceptionFunc()");
            throw new NegativeArraySizeException();
        }
    }
}
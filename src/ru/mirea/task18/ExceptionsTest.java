package ru.mirea.task18;

public class ExceptionsTest {
    public static void main(String[] args) throws Exception {
        try {
            int a = 0; // if (a != 0) throw new StackOverflowError
            int b = 20 / a; // if (a == 0) catch ArithmeticException
            throw new StackOverflowError();
        }
        catch (ArithmeticException | StackOverflowError e) {
            System.out.println("Обработано исключение " + e);
        }
        finally {
            System.out.println("Все исключения обработаны");
        }
        ExceptionsTest a = new ExceptionsTest();
        System.out.println("Выведено исключение " + a.ExceptionFunc());
        System.out.println("Продолжение работы программы");

    }

    public Exception ExceptionFunc() { return new ArithmeticException(); }
}
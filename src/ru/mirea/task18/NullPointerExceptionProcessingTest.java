package ru.mirea.task18;

public class NullPointerExceptionProcessingTest {
    public static void main(String[] args) throws Exception {
        BankProducts product = null;
        try {
            assert product != null;
            System.out.println(product.getNum());
            System.out.println("Этот текст уже не будет выведен");
        }
        catch (NullPointerException exception) {
            System.out.println("Обработано исключение " + exception);
        }
        finally {
            System.out.println("Этот текст будет выведен");
        }
    }
}
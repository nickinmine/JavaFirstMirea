package ru.mirea.task18;

public class NullPointerExceptionNoProcessingTest {
    public static void main(String[] args) throws Exception {
        BankProducts product = null;
        if (product == null) throw new Exception("NullPointer");
        System.out.println("Этот текст уже не будет выведен");
    }
}
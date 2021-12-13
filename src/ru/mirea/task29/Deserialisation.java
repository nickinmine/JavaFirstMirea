package ru.mirea.task29;
import java.io.*;
import ru.mirea.task20.BankProducts;

public class Deserialisation {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("save.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Customers customers = (Customers) objectInputStream.readObject();
        System.out.println(customers);
    }
}

package ru.mirea.task29;
import ru.mirea.task20.BankProducts;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialisation {
    public static void main(String[] args) throws IOException {
        BankProducts[] person1 = new BankProducts[3];
        person1[0] = BankProducts.Account;
        person1[1] = BankProducts.Card;
        person1[2] = BankProducts.Deposit;
        BankProducts[] person2 = new BankProducts[2];
        person2[0] = BankProducts.Credit;
        person2[1] = BankProducts.Insurance;
        Customers customers = new Customers(person1, person2);
        FileOutputStream outputStream = new FileOutputStream("save.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(customers);
        objectOutputStream.close();
    }
}

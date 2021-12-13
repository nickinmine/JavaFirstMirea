package ru.mirea.task29;
import ru.mirea.task20.BankProducts;
import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;

public class Customers implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private BankProducts[] personData1, personData2;

    public Customers(BankProducts[] personData1, BankProducts[] personData2) {
        this.personData1 = personData1;
        this.personData2 = personData2;
    }

    public BankProducts[] getPersonData1() { return personData1; }

    public BankProducts[] getPersonData2() { return personData2; }

    public void setPersonData1(BankProducts[] personData1) {
        this.personData1 = personData1;
    }

    public void setPersonData2(BankProducts[] personData2) {
        this.personData2 = personData2;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "person1=" + Arrays.toString(personData1) +
                "person2=" + Arrays.toString(personData2) +
                "}";
    }
}

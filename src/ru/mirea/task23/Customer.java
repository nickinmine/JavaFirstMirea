package ru.mirea.task23;
import java.util.Objects;

public class Customer {
    private String personName, openDate;

    Customer() {
        this.personName = "";
        this.openDate = "";
    }

    Customer(String personName, String openDate) {
        this.personName = personName;
        this.openDate = openDate;
    }

    public void setOpenDate(String openDate) { this.openDate = openDate; }

    public void setPersonName(String personName) { this.personName = personName; }

    public String getOpenDate() { return this.openDate; }

    public String getPersonName() { return this.personName; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(personName, customer.personName) && Objects.equals(openDate, customer.openDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personName, openDate);
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer("Vitalii Khvostov", "29.11.2019");
        Customer customer3 = new Customer("Valeriya Khvostova", "25.11.2018");
        Customer customer4 = new Customer();
        Customer customer5 = new Customer("Valeriya Khvostova", "25.11.2018");

        System.out.println(customer1.equals(customer4));
        System.out.println(customer3.equals(customer5));
        System.out.println(customer2.equals(customer4));
        System.out.println(customer5.equals(customer2));
        System.out.println();
        System.out.println(customer1.hashCode() == customer2.hashCode());
        System.out.println(customer1.hashCode() == customer4.hashCode());
        System.out.println(customer5.hashCode() == customer3.hashCode());
    }
}

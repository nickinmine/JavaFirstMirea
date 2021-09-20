package ru.mirea.task4.author;
import java.lang.*;
public class Author {
    private String name, email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        System.out.print(toString());
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return getName() + " (" + getGender() + ") at " + getEmail();
    }
}
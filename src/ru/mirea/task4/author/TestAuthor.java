package ru.mirea.task4.author;

import java.util.Locale;
import java.util.Scanner;
import java.lang.*;
public class TestAuthor {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine(), email = obj.nextLine(), gender1 = obj.nextLine();;
        char gender = gender1.toUpperCase().charAt(0);
        if (gender != 'M' & gender != 'F')
            gender = 'U';
        //System.out.println(gender);
        Author a1 = new Author(name, email, gender);

    }

}
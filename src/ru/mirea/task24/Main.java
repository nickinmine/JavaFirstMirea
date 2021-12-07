package ru.mirea.task24;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckEmail chkem = new CheckEmail();
        while(true) {
            System.out.print("Введите адрес электронной почты: ");
            String email = scanner.nextLine();
            if (chkem.checkEmail(email)) {
                System.out.println("Адрес электронной почты введён корректно!");
                break;
            }
            System.out.println("Вы ввели некорректный адрес электронной почты, попробуйте ещё раз.");
        }
        CheckPhone chkph = new CheckPhone();
        while(true) {
            System.out.print("Введите номер телефона: ");
            String phone = scanner.nextLine();
            if (chkph.checkPhone(phone)) {
                System.out.println("Номер телефона введён корректно!");
                break;
            }
            System.out.println("Вы ввели некорректный номер телефона, попробуйте ещё раз.");
        }
    }
}

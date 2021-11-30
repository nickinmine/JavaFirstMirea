package ru.mirea.task26;
import java.util.Scanner;

public class CustomerStrategy {
    protected float sum;
    protected float percents;

    public void addPercents() {
        sum += (sum * (percents / 12));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Credit credit1 = new Credit(500000, 1.27f);
        System.out.println("Ваша задолженность по кредиту: " + credit1.sum);
        credit1.addPercents();
        System.out.println("Ваша задолженность по кредиту через месяц: " + credit1.sum);

        System.out.print("Введите сумму депозита: ");
        Deposit deposit1 = new Deposit(scanner.nextInt(), 0.47f);
        deposit1.addPercents();
        System.out.println("Ваша сумма депозита через месяц: " + deposit1.sum);

        Account account1 = new Account();
        account1.addPercents();
    }
}
package ru.mirea.task10.var7;

public class Multiplier {
    public static void main(String[] args) {
        int x = 726;
        double sqrt = Math.sqrt(x);
        int currentValue = x;
        int multiplier = 2;
        while (currentValue > 1 && multiplier <= sqrt)
        {
            if (currentValue % multiplier == 0)
            {
                System.out.print(multiplier + " ");
                currentValue /= multiplier;
            }
            else if (multiplier == 2)
            {
                multiplier++;
            }
            else
            {
                multiplier += 2;
            }
        }
        if (currentValue != 1)
        {
            System.out.print(currentValue);
        }
    }
}

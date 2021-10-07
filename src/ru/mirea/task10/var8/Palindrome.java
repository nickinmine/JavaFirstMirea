package ru.mirea.task10.var8;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        if (isStringPalindrome(word) == true)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean isStringPalindrome(String word) {
        if (word == null) {
            return false;
        } else if (word.isEmpty() || word.length() == 1) {
            return true;
        }
        int len = word.length() - 1;
        return word.charAt(0) == word.charAt(len) //
                && isStringPalindrome(word.substring(1, len));
    }
}

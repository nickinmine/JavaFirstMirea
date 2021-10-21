package ru.mirea.task15;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("file.txt");
        String text = scanner.nextLine();
        try {
            file.createNewFile();
            FileWriter writer1 = new FileWriter(file);
            writer1.write(text + "\n");
            writer1.flush();
            writer1.close();
            FileReader reader = new FileReader(file);
            System.out.println("File name: " + file);
            char [] a = new char[(int)file.length()];
            reader.read(a);
            for(char c : a)
                System.out.print(c);
            reader.close();
            file.createNewFile();
            FileWriter writer2 = new FileWriter(file);
            String text1 = scanner.nextLine();
            String text2 = scanner.nextLine();
            writer2.write(text1 + "\n" + text2);
            writer2.flush();
            writer2.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
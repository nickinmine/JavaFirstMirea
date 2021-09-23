package ru.mirea.task5.furniture;

public class TestFurniture {
    public static void main(String[] args) {
        Table f1 = new Table();
        f1.setSize(200);
        f1.setMaterial("wood");
        Wardrobe f2 = new Wardrobe();
        f2.setSize(500);
        f2.setMaterial("wood");
        Shelf f3 = new Shelf();
        f3.setSize(60);
        f3.setMaterial("plastic");
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
    }
}
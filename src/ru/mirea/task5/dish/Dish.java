package ru.mirea.task5.dish;

public abstract class Dish {
    private int size;
    private String material;

    public Dish() {
        size = 0;
        material = "";
    }

    public Dish(int size, String material) {
        this.size = size;
        this.material = material;
    }

    public void setMaterial(String material) { this.material = material; }

    public void setSize(int size) { this.size = size; }

    public int getSize() { return size; }

    public String getMaterial() { return material; }

    public String toString() { return "size: " + size + ", material: " + material; }
}
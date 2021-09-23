package ru.mirea.task5.furniture;

public abstract class Furniture {
    private int size;
    private String material;

    public Furniture() {
        size = 0;
        material = "";
    }

    public void setMaterial(String material) { this.material = material; }

    public void setSize(int size) { this.size = size; }

    public int getSize() { return size; }

    public String getMaterial() { return material; }

    public String toString() { return "size: " + size + ", material: " + material; }
}

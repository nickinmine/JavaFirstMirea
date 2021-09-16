package ru.mirea.task3.book;
import java.lang.*;
public class Book {
    private String name;
    private int pages;
    private float price;

    public Book() {
        this.name = "";
        this.pages = 0;
        this.price = 0;
    }

    public Book(String name) {
        this.name = name;
        this.pages = 0;
        this.price = 0;
    }

    public Book(int pages) {
        this.name = "";
        this.pages = pages;
        this.price = 0;
    }

    public Book(float price) {
        this.name = "";
        this.pages = 0;
        this.price = price;
    }

    public Book(String name, int pages, float price) {
        this.name = name;
        this.pages = pages;
        this.price = price;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public void SetPages(int pages) {
        this.pages = pages;
    }

    public void SetPrice(float price) {
        this.price = price;
    }

}

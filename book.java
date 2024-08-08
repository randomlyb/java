package com.msb.test01;

import java.io.Serializable;

/**

 */
/*
io流保留数据到硬盘
 */
public final class book implements Serializable {
    private int id;
    private String name;
    private String author;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    //构造器

    public book(int id, String name, String author, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        book b=new book(id, name, author, price);
    }

}

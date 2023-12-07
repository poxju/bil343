package com.edu.bil343.undefined;

public class Book{ //superclass olabilir dusuncesiyle protected yaziliyor
    protected String author;
    protected String title;
    protected int pages;

    public Book(){
        author = "unknown";
        title = "unknown";
        pages = 0;
    }
    public Book(String author, String title, int pages){
        this.author = author;
        this.title = title;
        this.pages = pages;
    }
    public String toString(){
        return "Author: " + author + "\nTitle: " + title + "\nPages: " + pages;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
}
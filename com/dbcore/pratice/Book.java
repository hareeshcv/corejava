package com.dbcore.pratice;

public class Book {
    private int id;
    private String title;
    private String author;

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }

    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
}

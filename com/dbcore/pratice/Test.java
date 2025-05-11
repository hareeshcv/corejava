package com.dbcore.pratice;

public class Test {
    public static void main(String args[]){
        Book b = new Book();
        b.setId(1);
        b.setTitle("What Life Make it for you");
        b.setAuthor("preethy shyon");

        System.out.println(b.getId() + " " + b.getTitle() + " " + b.getAuthor());
    }
}

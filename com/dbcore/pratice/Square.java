package com.dbcore.pratice;

public class Square {
    private int side;
    public Square(int side){
        this.side=side;
    }
    public int calculateArea(){
        if(side<=0){
            return -1;
        }
        return side*side;
    }
    public int calulatePerimeter(){
        if(side<=0){
            return -1;
        }
        return 4*side;
    }
    public static void main(String args[]){
        Square s = new Square(12);
        System.out.println("Area=" + s.calculateArea());
        System.out.println("Perimeter=" + s.calulatePerimeter());

        Square s1 = new Square(0);
        System.out.println("Area=" + s1.calculateArea());
        System.out.println("Perimeter=" + s1.calulatePerimeter());
    }
}

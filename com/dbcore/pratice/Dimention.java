package com.dbcore.pratice;

public class Dimention {
    private int feet;
    private int inches;

    public Dimention(int inches){

        if(inches < 0){
            this.feet =-1;
            this.inches = -1;
        }
        else{
            this.feet=inches/12;
            this.inches=inches%12;
        }
    }

    public int getFeet(){
        return feet;
    }

    public int getInches(){
        return inches;
    }
}
class Demo{
    public static void main(String args[]){
        Dimention dim = new Dimention(25);
        System.out.println(dim.getFeet());
        System.out.println(dim.getInches());
    }
}

package com.dbcore.pratice;

public class Animal {

    String name;
    public static void main(String args[]){
        Animal cat =new Animal();
        Animal dog = new Animal();

        cat.name = "Puppy";
        cat.eating(); // calling method
        dog.name="Tommy";
        dog.barking();
    }
    public void eating(){ //implementing action (methods)
        System.out.println(name + " Eating food...");
    }

    public void barking(){
        System.out.println(name + " barking...");
    }
}

//al actions are methods
//all states are variables
//instances(objects) in above cat, dog
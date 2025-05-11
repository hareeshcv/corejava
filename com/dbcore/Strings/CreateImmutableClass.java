package com.dbcore.Strings;
final class Employee {
    final String adharNumber;

    public Employee(String adharNumber) {
        this.adharNumber = adharNumber;
    }
    public String getAdharNumber(){
        return adharNumber;
    }
}

public class CreateImmutableClass{

    public static void main(String args[]){
    Employee emp = new Employee("987654321");
    System.out.println("AdharNumbern = " + emp.getAdharNumber());
    }
}

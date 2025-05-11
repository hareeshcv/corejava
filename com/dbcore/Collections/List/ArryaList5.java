package com.dbcore.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

class ArrayList5{
    public static void main(String args[]){
        //Creating user-defined class objects
        Students s1=new Students(101,"Sonoo",22);
        Students s2=new Students(102,"Ravi",21);
        Students s3=new Students(103,"Hanumat",25);
        //creating arraylist
        ArrayList<Students> al=new ArrayList<Students>();
        al.add(s1);//adding Student class object
        al.add(s2);
        al.add(s3);
        //Getting Iterator
        Iterator itr=al.iterator();
        //traversing elements of ArrayList object
        while(itr.hasNext()){
            Students st=(Students)itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
          //  System.out.println(itr.next());
        }
    }
}
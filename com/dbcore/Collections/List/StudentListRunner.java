package com.dbcore.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingOrder implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
public class StudentListRunner {
    public static void main (String args[]){
        List<Student> students = List.of(new Student(1,"Hareesh"),
                new Student(113,"Ramesh"),
                new Student(3,"Roshan"));
        ArrayList<Student> stdlist = new ArrayList<>(students);
        System.out.println(stdlist);
        Collections.sort(stdlist);
        System.out.println("DESC" + stdlist);

       // Collections.sort(stdlist, new AscendingOrder());
        stdlist.sort(new AscendingOrder());
        System.out.println("ASC" + stdlist);
    }
}

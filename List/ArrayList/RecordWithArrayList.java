// Program to implement Record with ArrayList

package com.classes;

import java.util.*;

public class RecordWithArrayList{
    public static void main(String args[]){
        ArrayList<Employee> al = new ArrayList<>();

        al.add(new Employee(222,"Virat Kohli",50000.23));
        al.add(new Employee(333,"Rohit Sharma",70000.45));
        al.add(new Employee(111,"MS Dhoni",90000.07));

        al.forEach(System.out::println);
    }
}

record Employee(Integer empId, String empName, Double empSalary){

}

/*
Employee[empId=222, empName=Virat Kohli, empSalary=50000.23]
Employee[empId=333, empName=Rohit Sharma, empSalary=70000.45]
Employee[empId=111, empName=MS Dhoni, empSalary=90000.07]
*/
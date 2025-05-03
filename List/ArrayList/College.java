// Program to create College Proffesors Record using List
 
package com.classes;

import java.util.*;

public class College{
    public static void main(String args[]){
        Department dept = new Department("Computer Science");
        dept.addProfessor(new Professor(111,"Virat Kohli",55000.32));
        dept.addProfessor(new Professor(222,"Salman Khan",85000.12));
        dept.addProfessor(new Professor(111,"Vishal Pagere",5000.02));

        List<Professor> listOfProfessors = dept.getProfessors();

        System.out.println("Department of "+dept.getDepartment());
        System.out.println("List of Professors as follows.");
        listOfProfessors.forEach(System.out::println);
    }
}

class Department{

    private String department;
    private List<Professor> professors;

    public Department(String department){
        this.department = department;
        this.professors = new ArrayList<Professor>(); //Composition -> Tight Coupling
    }

    public void addProfessor(Professor prof){
        this.professors.add(prof);
    }

    public String getDepartment(){
        return this.department;
    }

    public List<Professor> getProfessors(){
        return this.professors; 
    }

}

record Professor(Integer profId, String name, Double salary){

}

/*
Department of Computer Science
List of Professors as follows.
Professor[profId=111, name=Virat Kohli, salary=55000.32]
Professor[profId=222, name=Salman Khan, salary=85000.12]
Professor[profId=111, name=Vishal Pagere, salary=5000.02]
*/
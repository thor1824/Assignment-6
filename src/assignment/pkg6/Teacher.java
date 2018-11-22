/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thor1
 */
public class Teacher extends Person
{
    private List<String> subjects;
    private String initials;
    private double salary;
    
    public Teacher(int id, String name, String email, String initials) 
    {
        super(id, name, email);
        this.initials = initials;
        subjects = new ArrayList<>();
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void addSubject(String subject)
    {
        subjects.add(subject);
    } 

    @Override
    public String toString() {
        return super.getId() + " " + super.getName() + " " + super.getEmail() + " " + initials + " " + subjects.get(0);
    }
    
    
    
}

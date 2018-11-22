/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author thor1
 */
public class Test 
{
    private List<Person> persons;
    /*Person person1 = new Person(100, "Hans Nielsen", "hni@easv.dk");
    Person person2 = new Person(101, "Niels hansen", "nha@easv.dk");
    Person person3 = new Person(102, "Ib Boesen", "hni@easv.dk");*/
    Teacher teach1 = new Teacher(201, "John'O John", "joj@easv.dk", "JOJ");
    Teacher teach2 = new Teacher(201, "Pete'O Pete", "pop@easv.dk", "POP");
    Student stud = new Student(105, "Bob John", "BJ@easv.dk", "cs");
    ManagePersons mPerson = new ManagePersons();
    
    
    public void print()
    {
        persons = new ArrayList<>();
        System.out.println("id");
        /*persons.add(person1);
        persons.add(person2);
        persons.add(person3); */
        persons .add(teach1);
        persons.add(teach2);
        persons.add(stud);
        teach1.addSubject("Math");
        teach2.addSubject("Job");
        stud.addGrade("math", 12);
        stud.addGrade("BOB", 7);
        for (Person person : persons) 
        {
            System.out.format(person.toString());
        }
    }
    
}

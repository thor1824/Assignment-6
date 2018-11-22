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
public class ManagePersons {

    private List<Person> persons;

    //public getPerson(int id){}
    //public add
    public ManagePersons() {

    }

    /**
     * henter en person på baggrund af deres id
     *
     * @param id
     * @return
     */
    public Person getPerson(int id) {
        for (Person person : persons) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    /**
     * tilføje en person og tjekker om der eksistere en person med samme id og
     * over skriver derefter den
     *
     * @param p
     */
    public void addPerson(Person p) {
        boolean noIdentical = true;
        for (Person person : persons) {
            if (person.getId() == p.getId()) {
                noIdentical = false;
            }
        }
        if (!noIdentical) {
            for (Person person : persons) {
                if (person.getId() == p.getId()) {
                    person = p;
                }
            }
        } else {
            persons.add(p);
        }
    }

    /**
     * Fjerner en person med givet ID
     *
     * @param id
     */
    public void removePersons(int id) {
        for (Person person : persons) {
            if (id == person.getId()) {
                persons.remove(person);
            }
        }
    }

    /**
     * giver en List med alle person
     *
     * @return
     */
    public List<Person> getAllPersons() {
        List<Person> listOfAllPersons = new ArrayList<>();

        for (Person person : persons) {
            if (person.getClass() == Person.class) {
                listOfAllPersons.add(person);
            }
        }

        return listOfAllPersons;

    }

    /**
     * giver en liste over alle personer som er studenter
     *
     * @return
     */
    public List<Student> getAllStudents() {
        List<Student> listOfAllStudents = new ArrayList<>();

        for (Person person : persons) {
            if (person.getClass() == Student.class) {
                listOfAllStudents.add((Student) person);
            }
        }

        return listOfAllStudents;

    }

    /**
     * giver en liste over alle personer der er Lærer
     *
     * @return
     */
    public List<Teacher> getAllTeachers() {
        List<Teacher> listOfAllTeachers = new ArrayList<>();

        for (Person person : persons) {
            if (person.getClass() == Teacher.class) {
                listOfAllTeachers.add((Teacher) person);
            }
        }

        return listOfAllTeachers;
    }

}

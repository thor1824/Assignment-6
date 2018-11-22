/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg6;

/**
 *
 * @author thor1
 */
public abstract class Person {

    private int id;
    private String name;
    private String email;

    /**
     * Constructs a person
     * @param id
     * @param name 
     */
    public Person(int id, String name) {
        this(id, name, "");
    }

    
    /**
     * Constructs a person
     * @param id
     * @param name
     * @param email 
     */
    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    /**
     * gets the ID
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * sets the name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * sets the email
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * gets the name
     * @return 
     */
    public String getName() {
        return name;
    }
    /**
     * gets the email
     * @return 
     */
    public String getEmail() {
        return email;
    }

    public String toString() {
        String haps = id + " " + name + " " + email;
        return haps;
    }
}

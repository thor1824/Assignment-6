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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
//     Test test = new Test();
//     test.print();// TODO code application logic here
        
        String[] bob = new String[3];
        bob[0] = "BOB"; 
        bob[0] = "John";
        bob[0] = "CuntOB";
        
        MainMenu menu = new MainMenu("Options", bob);
        menu.run();
    }
    
}

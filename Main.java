/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author budimir
 */
public class Main {
    
    public static void main (String[] args) {
        
        
        Student a = new Student ();
        a.setFirstName("Budimir");
        a.setLastName("Martinovic");
        a.setYearOfBirth(4111984);
        
        a.showInfo();
        
        Student b = new Student ();
        b.setFirstName("Matija");
        b.setLastName("Losic");
        b.setYearOfBirth(1571992);
        
        b.showInfo();
        
        Student c = new Student ();
        c.setFirstName("Nenad");
        c.setLastName("Maksic");
        c.setYearOfBirth(5101997);
        
        c.showInfo();
    }
    
}

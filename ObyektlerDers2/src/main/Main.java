/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;



/**
 *
 * @author ASUS
 */
public class Main {





    public static void main(String[] args) {
        User u= new User();
        u.name="NAHID";
        
        Student s=new Student();
        s.name="XEYAL";
        
        u.student=s;
        
        System.out.println(u.student.name);
    }
   
}

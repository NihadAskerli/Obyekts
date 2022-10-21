/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.obyektders2;

/**
 *
 * @author ASUS
 */
public class User {
private String name;// encapsualtion birbasa mudaxile olunmur ancaq set ve get yolu ile
//    public String name;
    public String surname;
    public int age;
    public Student student;
public static String companyname;
public static void foo(){
}
public void setName(String name){
    if(name.isEmpty()){
        System.out.println("ici bos");
        return;
    }
    this.name=name;
}
public String getName(){
    return this.name;
}
//public void foo2(){
//    User.companyname="Nihad";
//}


}

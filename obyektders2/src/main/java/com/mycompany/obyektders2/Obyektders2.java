/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.obyektders2;

/**
 *
 * @author ASUS
 */
public class Obyektders2 {

    public static void main(String[] args) {
//        User.companyname = "niko";
//        System.out.println(User.companyname);
//        User u = new User();// u burada referencedi yeni yaddasda bir barkodun deyeridir mes 111
//        u.name = "askerli";
//        u =new User(); // bu ise mes 112
//        System.out.println(u.name);
//         yeni obyektde menimseldiyine gore null olur
// -----------------------------------       
//        eger u ya null versek u.name eror verecek cunki u deyilen sey yoxdur 
// ama u.companyname eror vermir cunki u sadece user tipini teyin edir 
//        System.out.println(u.name);
//        System.out.println(User.companyname);
//        User u2= new User();
//        u2.name="riko";
//        u2.companyname="rako";
//        System.out.println(u2.name);
//        System.out.println(User.companyname);
//        User u = new User();
//        System.out.println(u.name);
////        burada mainin obyektini yaradib staticsiz changi cagira bilerik sadece elave yer tuturuq
//        change(u);
////        yeni change methodu u referance di yeni obyektin tutdugu yerin kodudur onu deyisir 
//        System.out.println(u.name);
//String y="niko";
//        System.out.println(y);
//topla(y,y);
//        System.out.println(y);
//        int[] alma = {9};
////        birinci 9 sora 3 cixir
//        System.out.println(alma[0]);
//        changeArr(alma);
//        System.out.println(alma[0]);
//User u= new User();// burda referencde olaraq 111 gonderir
//User u2=change(u);// burda ise reference olaraq da yene 111 gonderir niye user obyektinin referencesidir
//        System.out.println(u.name);
//        System.out.println(u2.name);
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
////            men dediyim args kodlama 
//        }
//User u=new User();
//u.name="nihad";
//Student s=new Student();
//s.name="niko";
//u.student=s;
//        System.out.println(u.student.name);
//        bu ise obyekt icinde obyekt anlayisi
User u=new User();
u.setName("");
        System.out.println(u.getName());

    }

    public static User change(User n) {
//        burada u n cevrilir yeni n
//        n.name = "niko";
        return n;
    }

    public static void topla(String a, String b) {
//        for (int i = 0; i < a.length(); i++) {
//            System.out.println(a);
//        }

    }

    public static void changeArr(int[] arr) {
        arr[0] = 3;
    }
}

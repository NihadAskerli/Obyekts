/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.obyekt;

/**
 *
 * @author ASUS
 */
public class esas {
    public static obyekt u = new obyekt();
// main en birirnci yarandigi ucun staticlerde burda aftamatik birinci yarandigi ucun taniyir onu ;
    public static void main(String[] args) {
        obyekt.umumi="salam";
//        System.out.println(obyekt.umumi);
        obyekt u = new obyekt();
//bu ne edir yeni yer ayirir klasin obyekti ucun ve ancaq static olmayanlari cagira bilirik;
        u.name = "nihad";
        obyekt u2 = new obyekt();
        u2.name = "niko";
        deyis.deyisilir();
        System.out.println(u.name);
          System.out.println(u2.name);
            System.out.println(obyekt.umumi);
          
    }

}

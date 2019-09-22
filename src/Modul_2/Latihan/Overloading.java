/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_2.Latihan;

/**
 *
 * @author Lenovo
 */
public class Overloading {

    public void tampil() {
        System.out.println("I love Java");
    }

    public void tampil(int i) {
        System.out.println("Method dengan 1 parameter = " + i);
    }

    public void tampil(int i, int j) {
        System.out.println("Method dengan 2 parameter = " + i + " & " + j);
    }
    
    public void tampil(String str){
        System.out.println(str);
    }
    
    public static void main(String[] args) {
        Overloading objek = new Overloading();
        objek.tampil();
        objek.tampil(8);
        objek.tampil(6, 7);
        objek.tampil("Hello World");
    }
}

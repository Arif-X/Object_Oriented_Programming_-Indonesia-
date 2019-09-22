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
public class Enkasulapsi_Main {

    public static void main(String[] args) {
        Enkasulapsi ob = new Enkasulapsi();
        ob.setAlas(10);
        ob.setTinggi(20);
        System.out.println("Alas Segitiga : " + ob.getAlas());
        System.out.println("Tinggi Segitiga : " + ob.getTinggi());
        ob.setLuasSegitiga(ob.getAlas(), ob.getTinggi());
        System.out.println("Luas Segitiga : " + ob.getLuasSegitiga());
    }
}

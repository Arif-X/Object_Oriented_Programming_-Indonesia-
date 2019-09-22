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
public class Enkasulapsi {

    private int alas, tinggi;
    private double luasSegitiga;

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void setLuasSegitiga(int alas, int tinggi) {
        luasSegitiga = (double) 0.5 * alas * tinggi;
    }

    public int getAlas() {
        return alas;
    }
    
    public int getTinggi(){
        return tinggi;
    }
    
    public double getLuasSegitiga(){
        return luasSegitiga;
    }
}

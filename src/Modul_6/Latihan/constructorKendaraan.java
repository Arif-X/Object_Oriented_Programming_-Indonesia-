/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_6.Latihan;

/**
 *
 * @author Lenovo
 */
public class constructorKendaraan {

    private String merk;
    private static String pemilik;

    protected constructorKendaraan() {
        merk = null;
    }

    protected constructorKendaraan(String merk) {
        this.merk = merk;
    }

    protected void setMerk(String merk) {
        this.merk = merk;
        merk = null;
    }

    protected String getMerk() {
        return merk;
    }

    protected static void setPemilik(String pemilik) {
        constructorKendaraan.pemilik = pemilik;
    }

    protected static String getPemilik() {
        return constructorKendaraan.pemilik;
    }

    protected void tampil(String a) {
        System.out.println(a);
        a = null;
    }
    
    protected void hapus(){
        merk = null;
        pemilik = null;
    }
}

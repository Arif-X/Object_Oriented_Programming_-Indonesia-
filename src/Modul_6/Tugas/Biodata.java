/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_6.Tugas;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Biodata {
    private static long nim;
    private String nama;
    private static String alamat;
    private static String isiLagi;

    protected Biodata() {
        nama = null;
    }

    protected Biodata(String nama) {
        this.nama = nama;
    }

    protected void setNama(String nama) {
        this.nama = nama;
        nama = null;
    }

    protected String getNama() {
        return nama;
    }

    protected static void setAlamat(String alamat) {
        Biodata.alamat = alamat;
    }

    protected static String getAlamat() {
        return Biodata.alamat;
    }
    
    protected static void setNim(long nim) {
        Biodata.nim = nim;
    }

    protected static long getNim() {
        return Biodata.nim;
    }

    protected void tampil(String a) {
        System.out.println(a);
        a = null;
    }
    
    protected void tampil(long a){
        System.out.println(a);
    }
    
    protected void hapus(){
        nama = null;
        alamat = null;
    }
}

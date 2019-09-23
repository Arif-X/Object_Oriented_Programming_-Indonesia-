/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_5.Latihan;

/**
 *
 * @author Arif-X
 */
public class Kendaraan {

    private String merk, warna;
    protected String namaClass = "Kendaraan";

    protected void setMerk(String merk) {
        this.merk = merk;
    }

    protected String getMerk() {
        return merk;
    }

    protected void setWarna(String warna) {
        this.warna = warna;
    }

    protected String getWarna() {
        return warna;
    }

    protected void tampil(String a) {
        System.out.println(a);
        a = null;
    }

    protected void hapus() {
        merk = null;
        warna = null;
        namaClass = null;
    }

    protected String keterangan() {
        return (" Ini adalah class " + namaClass);
    }
}

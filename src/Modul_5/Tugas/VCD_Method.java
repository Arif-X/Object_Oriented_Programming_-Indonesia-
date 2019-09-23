/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_5.Tugas;

/**
 *
 * @author Arif-X
 */
public class VCD_Method {

    private String judul, aktor, sutradara, publisher, kategori;
    protected String namaClass = "VCD Film";

    protected void setJudul(String judul) {
        this.judul = judul;
    }

    protected String getJudul() {
        return judul;
    }
    
    protected void setAktor(String aktor) {
        this.aktor = aktor;
    }

    protected String getAktor() {
        return aktor;
    }

    protected void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    protected String getSutradara() {
        return sutradara;
    }

    protected void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    protected String getPublisher() {
        return publisher;
    }

    protected void setKategori(String kategori) {
        if ("SU".equals(kategori)) {
            kategori = "Semua Umur";
        } else if ("D".equals(kategori)) {
            kategori = "Dewasa";
        } else if ("R".equals(kategori)) {
            kategori = "Remaja";
        } else if ("A".equals(kategori)) {
            kategori = "Anak-Anak";
        } else {
            kategori = "Tidak Diketahui";
        }
        this.kategori = kategori;
    }

    protected String getKategori() {
        return kategori;
    }

    protected void tampil(String a) {
        System.out.println(a);
        a = null;
    }

    protected void hapus() {
        judul = null;
        sutradara = null;
        publisher = null;
        kategori = null;
        namaClass = null;
    }

    protected String keterangan() {
        return (" Ini adalah class " + namaClass);
    }
}

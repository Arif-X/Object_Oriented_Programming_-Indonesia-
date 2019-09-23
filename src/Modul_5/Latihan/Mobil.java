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
public class Mobil extends Kendaraan {

    private long harga;
    protected String namaClass = "Mobil";

    protected void setHarga(String harga) {
        this.harga = Long.parseLong(harga);
        harga = null;
    }

    protected long getHarga() {
        return harga;
    }

    protected String keterangan() {
        return (namaClass + " : Ini adalah class " + namaClass);
    }

    public String keteranganKendaraan() {
        return super.namaClass + " : " + super.keterangan();
    }

    protected void hapus() {
        harga = 0;
        super.hapus();
    }
}

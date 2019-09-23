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
public class VCD extends VCD_Method {

    private int stok;
    protected String namaClass = "VCD";

    protected void setStok(String stok) {
        this.stok = Integer.parseInt(stok);
        stok = null;
    }

    protected long getStok() {
        return stok;
    }

    protected String keterangan() {
        return (namaClass + " : Ini adalah class " + namaClass);
    }

    public String keteranganKendaraan() {
        return super.namaClass + " : " + super.keterangan();
    }

    protected void hapus() {
        stok = 0;
        super.hapus();
    }
}

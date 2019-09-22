/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_4.Tugas;

/**
 *
 * @author Lenovo
 */
public class Main_Tambah {

    public static void main(String[] args) {
        Array_Tambah ob = new Array_Tambah();
        double data[][] = {
            {1, 2},
            {3, 5},
            {6, 7},};
        ob.tampil("Data Matrik 1");
        ob.setData(data);
        ob.tampil(ob.getData());
        double dataTambah[][] = {
            {8, 9},
            {10, 11},
            {12, 13},};
        ob.setPertambahanSkalar(data, dataTambah);
        ob.tampil("=========================");
        ob.tampil("Data Matrik 2");
        ob.setDataTambah(dataTambah);
        ob.tampil(ob.getDataTambah());
        ob.tampil("=========================");
        ob.tampil("Hasil Matrik 1 + Matrik 2 ");
        ob.tampil(ob.getPertambahanSkalar());
        ob.tampil("=========================");
        double pengkali = 0.5;
        ob.tampil("Hasil Kali " + pengkali + " dengan penjumlahan Matrik");
        ob.setPerkalianSkalar(data, pengkali);
        ob.tampilDouble(ob.getPerkalianSkalar());
    }
}

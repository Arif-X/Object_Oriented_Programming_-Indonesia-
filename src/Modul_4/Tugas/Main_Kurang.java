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
public class Main_Kurang {
    public static void main(String[] args) {
        Array_Kurang ob = new Array_Kurang();
        double data[][] = {
            {1, 2},
            {3, 5},
            {6, 7},};
        ob.tampil("Data Matrik 1");
        ob.setData(data);
        ob.tampil(ob.getData());
        double dataKurang[][] = {
            {8, 9},
            {10, 11},
            {12, 13},};
        ob.setPenguranganSkalar(data, dataKurang);
        ob.tampil("=========================");
        ob.tampil("Data Matrik 2");
        ob.setDataKurang(dataKurang);
        ob.tampil(ob.getDataKurang());
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

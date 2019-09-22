/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_4.Latihan;

/**
 *
 * @author Lenovo
 */
public class Main {

    public static void main(String[] args) {
        Array ob = new Array();
        String[][] Mhs = {
            {"NIM", "NAMA"},
            {"12345676", "NAMA1"},
            {"12345677", "NAMA2"},
            {"12345678", "NAMA3"},
            {"12345679", "NAMA4"},};
        ob.tampil("Data Mahasiswa");
        ob.setMahasiswa(Mhs);
        ob.tampil(ob.getMahasiswa());
        ob.tampil("=========================");

        int data[][] = {
            {1, 2},
            {3, 4},
            {4, 6},};
        ob.tampil("Data Angka");
        ob.setData(data);
        ob.tampil(ob.getData());
        ob.tampil("=========================");
        int pengali = 2;
        ob.tampil("Data Matrix X * " + pengali + " : ");
        ob.setPerkalianSkalar(data, pengali);
        ob.tampil(ob.getPerkalianSkalar());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_4.Latihan;

/**
 *
 * @author Arif-X
 */
public class Array {

    private String[][] Mahasiswa;
    private int[][] data, hasil;

    public void setMahasiswa(String[][] Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
        Mahasiswa = null;
    }

    public String[][] getMahasiswa() {
        return Mahasiswa;
    }

    public void setData(int data[][]) {
        this.data = data;
    }

    public int[][] getData() {
        return data;
    }

    public void setHasil(int[][] hasil) {
        this.hasil = hasil;
    }

    public int[][] getHasil() {
        return hasil;
    }

    public void setPerkalianSkalar(int[][] data, int a) {
        hasil = data;
        int i, j;
        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i].length; j++) {
                hasil[i][j] = a * data[i][j];
            }
        }
        data = null;
    }

    public int[][] getPerkalianSkalar() {
        return hasil;
    }

    public void tampil(String a) {
        System.out.println(a);
        a = null;
    }

    public void tampil(int[][] data) {
        hasil = data;
        int i, j;
        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        data = null;
    }

    public void tampil(String[][] data) {
        int i, j;
        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        data = null;
    }

    public void hapus(int data[][]) {
        Mahasiswa = null;
        data = null;
        hasil = null;
    }
}

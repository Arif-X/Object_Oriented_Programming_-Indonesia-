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
public class Array_Kurang {

    private double[][] data, dataKurang, hasil, hasilTambah;

    public void setData(double data[][]) {
        this.data = data;
    }

    public double[][] getData() {
        return data;
    }

    public void setDataKurang(double dataKurang[][]) {
        this.dataKurang = dataKurang;
    }

    public double[][] getDataKurang() {
        return dataKurang;
    }

    public void setHasil(double[][] hasil) {
        this.hasil = hasil;
    }

    public double[][] getHasil() {
        return hasil;
    }

    public void setPerkalianSkalar(double[][] data, double a) {
        hasil = data;
        int i, j;
        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i].length; j++) {
                hasil[i][j] = a * data[i][j];
            }
        }
        data = null;
    }

    public void setPenguranganSkalar(double[][] data, double dataKurang[][]) {
        hasilTambah = data;
        int i, j;
        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i].length; j++) {
                hasil[i][j] = (int) data[i][j] - (int) dataKurang[i][j];
            }
        }
        data = null;
    }

    public double[][] getPertambahanSkalar() {
        return hasilTambah;
    }

    public double[][] getPerkalianSkalar() {
        return hasil;
    }

    public void tampil(String a) {
        System.out.println(a);
        a = null;
    }

    public void tampil(double[][] data) {
        hasil = data;
        int i, j;
        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i].length; j++) {
                System.out.print((int) data[i][j] + " ");
            }
            System.out.println();
        }
        data = null;
    }

    public void tampilDouble(double[][] data) {
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
}

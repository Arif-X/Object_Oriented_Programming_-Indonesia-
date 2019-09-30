/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_6.Tugas;

import javax.swing.JOptionPane;

/**
 *
 * @author Arif-X
 */
public class Main {

    public static void main(String[] args) {
        String inputNIM = JOptionPane.showInputDialog("NIM");
        long nim = Long.parseLong(inputNIM);
        String nama = JOptionPane.showInputDialog("Nama");
        String alamat = JOptionPane.showInputDialog("Alamat");
        String jurusan = JOptionPane.showInputDialog("Jurusan");
        String isiLagi = JOptionPane.showInputDialog("Apakah Anda ingin "
                + "memasukkan data lagi?(Y)Ya;(T)Tidak");

        Biodata.setNim(nim);
        Biodata.setAlamat(alamat);
        System.out.println("NIM \t\t: " + Biodata.getNim());

        Biodata ob = new Biodata(nama);
        ob.tampil("Nama \t\t: " + ob.getNama());
        ob.tampil("Alamat \t\t: " + ob.getAlamat());

        Jurusan ob1 = new Jurusan(nama, jurusan);
        ob1.tampil("Jurusan \t: " + ob1.getJurusan());

        while (true) {
            if ("Y".equals(isiLagi)) {
                String inputNIMUlang = JOptionPane.showInputDialog("NIM");
                long nimUlang = Long.parseLong(inputNIMUlang);
                String namaUlang = JOptionPane.showInputDialog("Nama");
                String alamatUlang = JOptionPane.showInputDialog("Alamat");
                String jurusanUlang = JOptionPane.showInputDialog("Jurusan");
                isiLagi = JOptionPane.showInputDialog("Apakah Anda ingin "
                        + "memasukkan data lagi?(Y)Ya;(T)Tidak");
                Biodata.setNim(nimUlang);
                Biodata.setAlamat(alamatUlang);
                System.out.println("NIM \t\t: " + Biodata.getNim());

                Biodata obb = new Biodata(namaUlang);
                obb.tampil("Nama \t\t: " + obb.getNama());
                obb.tampil("Alamat \t\t: " + obb.getAlamat());

                Jurusan obb1 = new Jurusan(nama, jurusanUlang);
                obb1.tampil("Jurusan \t: " + obb1.getJurusan());
            } else if ("T".equals(isiLagi)) {
                System.exit(0);
            }
        }
    }
}

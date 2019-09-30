/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_6.Latihan;

/**
 *
 * @author Lenovo
 */
public class mainConstructorMotor {

    public static void main(String[] args) {
        String pemilik = "Ahmad Afif";
        String merk = "Honda";
        String warna = "Merah";
        // cara akses static variable dan static method dapat
        // dengan memanggil class (constructorKendaraan) secara langsung
        constructorKendaraan.setPemilik(pemilik);
        System.out.println("Pemilik Kendaraan : " + constructorKendaraan.getPemilik());
        System.out.println("======================================");

        // variable merk menjadi parameter constructor pada saat
        // instansiasi/membuat objek baru (ob)
        constructorKendaraan ob = new constructorKendaraan(merk);
        ob.tampil("Merk Kendaraan : " + ob.getMerk());
        // cara akses static variable dan static method dapat juga dengan
        // objek (ob) pada method getPemilik()
        ob.tampil("Pemilik Kendaraan : " + ob.getPemilik());
        System.out.println("=====================================");

        // instansiasi/membuat objek baru (ob2) tanpa parameter
        constructorKendaraan ob2 = new constructorKendaraan();
        // bandingkan akses untuk menampilkan nilai pada instant variable (merk)
        // dan static variable (pemilik) melalui method getter setelah membuat
        // instant variable (merk) nilainya akan hilang,
        // sedangkan static variable (pemilik) nilainya tidak hilang/berubah
        ob2.tampil("Merk Kendaraan (Instant Variable) : " + ob.getMerk());
        ob2.tampil("Pemilik Kendaraan (Instant Variable) : " + ob.getPemilik());
        System.out.println("=====================================");

        // variable merk dan warna menjadi parameter constructor pada saat
        // instansiasi/membuat obek baru (ob3)
        constructorMotor ob3 = new constructorMotor(merk, warna);
        ob3.tampil("Merk Motor : " + ob3.getMerk());
        ob3.tampil("Warna Motor : " + ob3.getWarna());
        ob3.tampil("Pemilik Kendaraan : " + ob3.getPemilik());

        pemilik = null;
        merk = null;
        warna = null;
        ob.hapus();
        ob = null;
        ob2 = null;
        ob3 = null;
    }
}

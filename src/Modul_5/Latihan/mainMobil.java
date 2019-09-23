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
import javax.swing.*;

public class mainMobil extends Mobil {

    public static void main(String[] args) {
        mainMobil ob = new mainMobil();
        String merk, warna, harga;

        merk = JOptionPane.showInputDialog("Merk Mobil : ");
        ob.setMerk(merk);
        ob.tampil("Merk Mobil : " + ob.getMerk());

        warna = JOptionPane.showInputDialog("Warna Mobil : ");
        ob.setWarna(warna);
        ob.tampil("Warna Mobil : " + ob.getWarna());

        harga = JOptionPane.showInputDialog("Harga Mobil : ");
        ob.setHarga(harga);
        ob.tampil("Harga Mobil : " + ob.getHarga());

        ob.hapus();
        merk = null;
        warna = null;
        harga = null;
        ob = null;
        
        System.exit(0);
    }
}

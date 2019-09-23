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
import javax.swing.*;

public class VCD_Main extends VCD {

    public static void main(String[] args) {

        String judul, aktor, sutradara, publisher, kategori, stok;
        String strJumlahCD = JOptionPane.showInputDialog("Masukan Jumlah CD!");
        int intJumlahCD = Integer.parseInt(strJumlahCD);

        VCD_Main ob = new VCD_Main();

        for (int i = 0; i < intJumlahCD; i++) {
            judul = JOptionPane.showInputDialog("Judul : Judul Film.");
            ob.setJudul(judul);
            ob.tampil("Judul \t\t: " + ob.getJudul());

            aktor = JOptionPane.showInputDialog("Aktor : Nama-Nama Aktor "
                    + "di Dalam Film Tersebut.");
            ob.setAktor(aktor);
            ob.tampil("Aktor \t\t: " + ob.getAktor());
            
            sutradara = JOptionPane.showInputDialog("Sutradara : Nama Sutradara "
                    + "Film Tersebut.");
            ob.setSutradara(sutradara);
            ob.tampil("Sutradara \t: " + ob.getSutradara());

            publisher = JOptionPane.showInputDialog("Publisher : Yang Memproduksi "
                    + "Film Tersebut.");
            ob.setPublisher(publisher);
            ob.tampil("Publisher \t: " + ob.getPublisher());

            kategori = JOptionPane.showInputDialog("Kategori : \nSU = Semua Umur,\n "
                    + "D = Dewasa\n "
                    + "R = Remaja\n "
                    + "A = Anak-anak \n"
                    + "*Pilih Antara SU/D/R/A!");
            ob.setKategori(kategori);
            ob.tampil("Kategori \t: " + ob.getKategori());

            stok = JOptionPane.showInputDialog("Stok : Jumlah Stok VCD Film "
                    + "Tersebut.");
            ob.setStok(stok);
            ob.tampil("Stok \t\t: " + ob.getStok());

            ob.tampil("");
        }

        ob.hapus();
        judul = null;
        sutradara = null;
        publisher = null;
        kategori = null;
        stok = null;

        System.exit(0);
    }
}

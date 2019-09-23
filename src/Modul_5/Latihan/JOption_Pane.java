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

public class JOption_Pane {

    public static void main(String[] args) {
        String nama, kota;
        nama = JOptionPane.showInputDialog("Nama Anda : ");
        kota = JOptionPane.showInputDialog("Kota Asal : ");
        System.out.println("Selamat Datang " + nama + " dari " + kota);
        System.exit(0);
    }
}

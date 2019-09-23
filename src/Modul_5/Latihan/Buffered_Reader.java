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
import java.io.*;

public class Buffered_Reader {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nama, kota;
        System.out.print("Nama Anda : ");
        nama = br.readLine();
        System.out.print("Kota Asal : ");
        kota = br.readLine();
        System.out.println("Selamat Datang " + nama + " dari " + kota);
    }
}

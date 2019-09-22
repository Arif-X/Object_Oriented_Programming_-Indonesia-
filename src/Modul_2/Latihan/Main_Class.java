/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_2.Latihan;

/**
 *
 * @author Lenovo
 */
public class Main_Class {

    public static void main(String[] args) {
        Class ob = new Class();
        ob.setMerkMotor("Suzuki");
        System.out.println("Motor ini bermerk " + ob.getMerkMotor());
        System.out.println("Motor ini berharga "+ ob.Harga(110000000));
    }
}

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
public class constructorMotor extends constructorKendaraan{
    private String warna;
    protected constructorMotor(String merk, String warna){
        super(merk);
        this.warna = warna;
        merk = null;
        warna = null;
    }
    protected String getWarna(){
        return warna;
    }
    
    protected void hapus(){
        warna = null;
        super.hapus();
    }
}

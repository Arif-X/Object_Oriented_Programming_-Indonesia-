/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_6.Tugas;

/**
 *
 * @author Lenovo
 */
public class Jurusan extends Biodata{
    private String jurusan;
    protected Jurusan(String nama, String jurusan){
        super(nama);
        if ("61".equals(jurusan)) {
            jurusan = "Matematika";
        } else if ("62".equals(jurusan)) {
            jurusan = "Biologi";
        } else if ("63".equals(jurusan)) {
            jurusan = "Kimia";
        } else if ("64".equals(jurusan)) {
            jurusan = "Fisika";
        } else if ("65".equals(jurusan)) {
            jurusan = "Teknik Informatika";
        } else if ("66".equals(jurusan)) {
            jurusan = "Teknik Arsitektur";
        } else {
            jurusan = "Tidak Diketahui";
        }
        this.jurusan = jurusan;
        jurusan = null;
        nama = null;
    }
    protected String getJurusan(){
        return jurusan;
    }
    
    protected void hapus(){
        super.hapus();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118041.latihan31.objectoriented.perkenalanmahasiswa;

/**
 *
 * @author 
 * NAMA     : Eki salman sya'bani
 * KELAS    : IF-1
 * NIM      : 10118041
 * Deskripsi Program : Program ini untuk membuat subclass yang berisi variabel.
 */
public class Mahasiswa {
    public String nim;
    public String nama;


    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void perkenalkanDiri(){
        System.out.println("Hallo Everyone");
        System.out.println("My NIM is "+nim);
        System.out.println("My Name is "+nama+"\n");
    }
    
}

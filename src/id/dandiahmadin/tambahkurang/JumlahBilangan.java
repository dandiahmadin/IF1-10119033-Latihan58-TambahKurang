/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.tambahkurang;

/**
 *
 * @author 
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi class JumlahBilangan yang merupakan subclass dari class Bilangan (superclass)
 */

public class JumlahBilangan extends Bilangan {
    public void tampilHasilJumlah() {
        System.out.println("Hasil Penjumlahan = " + (getX() + getY()));
    }
}

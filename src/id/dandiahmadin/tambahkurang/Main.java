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
 * Deskripsi Program : Program ini berisi menghitung penjumlahan dan selisih bilangan dengan pendekatan 
 * object oriented dan penerapan konsep pewarisan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JumlahBilangan tambah = new JumlahBilangan();
        tambah.tampilHasilJumlah();
        
        SelisihBilangan selisih = new SelisihBilangan();
        selisih.tampilSelisih();
    }
    
}

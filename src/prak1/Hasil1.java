/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak1;


public class Hasil1 {
    public static void main (String[]args){
        pelajar p = new pelajar ("01", "cahyo", 90, 80, 70);
        p.dataPelajar();
        System.out.println("nilai akhir : " + p.nilaiAkhir());
        p.kelulusan();
    }
}

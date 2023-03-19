/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NITRO 5
 */
public class person {
    private String nama;
    private int umur;
    
       public person(String n, int a){
        this.nama  = n;
        this.umur =a;
}
    public void dataDiri(){
        System.out.println("Hallo.... Aku " + nama);
        System.out.println("Aku" + umur +"tahun");
    
         }
}

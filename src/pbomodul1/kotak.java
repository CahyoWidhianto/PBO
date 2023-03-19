/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbomodul1;

/**
 *
 * @author NITRO 5
 */
public class kotak {
    private double panjang; //atribut
    private double lebar; //atribut
    private double tinggi; //atribut
    
    public kotak (double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        
    }
    public void tampildatakotak()
    {
        System.out.println("panjang : " + panjang);
        System.out.println("lebar : " + lebar);
        System.out.println("tinggi : " + tinggi);
    }
    public double hitungvolume()
    {
        return panjang * lebar * tinggi;
    }

    void tampidatakotak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



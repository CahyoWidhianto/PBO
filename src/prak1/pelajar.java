/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak1;

public class pelajar {
    private String nim;
    private String nama;
    private int ujian1;
    private int ujian2;
    private  int tugas;
    public int nilaiAkhir;
   
    public pelajar (String nim, String nama, int ujian1,int ujian2, int tugas)
    {
        this.nim = nim;
        this.nama = nama;
        this.ujian1 = ujian1;
        this.ujian2 =ujian2;
        this.tugas = tugas;
        this.nilaiAkhir = nilaiAkhir;
    }
    public void dataPelajar()
    {
        System.out.println("nim :" + nim);
        System.out.println("nama :" + nama);
        System.out.println("nilai ujian 1 :" + ujian1);
        System.out.println("nilai ujian 2 :" + ujian2);
        System.out.println("nilai tugas :" + tugas);

    }
    public double nilaiAkhir()
    {
        return (ujian1 * 35/100) + (ujian2 *40/100) + (tugas * 25/100);
    }
    public void  kelulusan ()
    {
        if ( nilaiAkhir() > 60 && nilaiAkhir() <100 ){
            System.out.println("lulus");
        }     
        else {
            System.out.println("tidak lulus");
        }
    }
}


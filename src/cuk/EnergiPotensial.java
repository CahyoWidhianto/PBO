
package cuk;

import java.util.Arrays;
import java.util.Scanner;


public class EnergiPotensial {
    // ini variable/ atribut
    private double massa[] = new double[5];
    private double gravitasi, kAwal, kAkhir,ep0,ep1;
    // constructor
    public EnergiPotensial(double gravitasi, double kAwal, double kAkhir) {
        this.gravitasi = gravitasi;
        this.kAwal = kAwal;
        this.kAkhir = kAkhir;
    }
    // fungsi/ methode
    public double[] getMassa() {
        return massa;
    }

    public void setMassa(double m1,double m2, double m3, double m4, double m5) {
        massa[0] = m1;
        massa[1] = m2;
        massa[2] = m3;
        massa[3] = m4;
        massa[4] = m5;
    }

    public double getGravitasi() {
        return gravitasi;
    }

    public void setGravitasi(double gravitasi) {
        this.gravitasi = gravitasi;
    }

    public double getkAwal() {
        return kAwal;
    }

    public void setkAwal(double kAwal) {
        this.kAwal = kAwal;
    }

    public double getkAkhir() {
        return kAkhir;
    }

    public void setkAkhir(double kAkhir) {
        this.kAkhir = kAkhir;
    }
   
    public void tampilkanMassa(){
        System.out.println(Arrays.toString(massa));
    }
    
    public double ep0(int i){
        return massa[i] * getGravitasi() * getkAwal();
    }
    public double ep1(int i){
        return massa[i] *getGravitasi() * getkAkhir();
    }
//    public double menghitungNIlaiWork(){
//        Scanner scan = new Scanner(System.in);
//        System.out.print("masukan indeks massa : ");
//        int temp = scan.nextInt();
//        return (massa[temp] * getGravitasi() * getkAkhir()) - (massa[temp] * getGravitasi() * getkAwal());
//    }
//    public double menghitungNilaiWorkAll(){
//        double jumlah = 0;
//        for (int i = 0; i < massa.length; i++) {
//            jumlah = jumlah + (massa[i] * getGravitasi() * getkAkhir()) - (massa[i] * getGravitasi() * getkAwal());
//            
//        }
//        return jumlah;
//    }
//    public double jumlahWork(int i){
//        double jumlah = 0;
//        return jumlah = jumlah + (massa[i] * getGravitasi() * getkAkhir()) - (massa[i] * getGravitasi() * getkAwal());
//    }
//    public double ratarataWork(){
//        return menghitungNilaiWorkAll() / massa.length;
//    }
//    public double nilaiMaxWork(){
//        double max = 0;
//        for (int i = 0; i < massa.length; i++) {
//            double work  = (massa[i] * getGravitasi() * getkAkhir()) - (massa[i] * getGravitasi() * getkAwal());
//            max = work; 
//            if(work > max){
//                max = work;
//            }
//        }
//        return max;
//    }
}

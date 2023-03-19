
package Polimorfisme;


public class Lingkaran extends bangunDatar_1827{
    private double jari_jari;

    public Lingkaran(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    @Override
    public double Keliling() {
        return 2 * (Math.PI * jari_jari);
    }

    @Override
    public double Luas() {
    return Math.PI * Math.pow(jari_jari, 2);
    }
    
//    public void TampilLingkaran(){
//        System.out.println("Keliling Lingkaran : " + Keliling());
//        System.out.println("Luas Lingkaran : " + Luas());
// }
//        
    }
    
    


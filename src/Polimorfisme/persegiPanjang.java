
package Polimorfisme;

public class persegiPanjang extends bangunDatar_1827 {
    private double panjang, lebar;

    public persegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double Keliling(){
        return 2 * (panjang + lebar);
    } 

    @Override
    public double Luas() {
        return panjang * lebar;
    }
    /*public void TampilPersegiPanjang(){
        System.out.println("keliling persegi panjnag : " + Keliling());
        System.out.println("Luas persegi panjnag : " + Luas());
    }
        */
        
    }


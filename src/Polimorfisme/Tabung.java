
package Polimorfisme;

public class Tabung extends bangunRuang_1827{
    private double jarijari,tinggi;

    public Tabung(double jarijari, double tinggi) {
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2*Math.PI* jarijari * (jarijari + tinggi);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(jarijari, 2) * tinggi;
    }
 
    
    
}

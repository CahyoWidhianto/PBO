
package Polimorfisme;

public class Bola extends bangunRuang_1827{
    private double jarijari;

    public Bola(double jarijari) {
        this.jarijari = jarijari;
    }

    @Override
    public double luasPermukaan() {
        return 4 * Math.PI * Math.pow(jarijari, 2);
    }

    @Override
    public double volume() {
       return 4/3 * Math.PI * Math.pow(jarijari, 3);
    }
    
    
}

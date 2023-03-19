
package Polimorfisme;


public class mainBangunRuang {
    public void hitung (bangunRuang_1827 bangunRuang){
        bangunRuang.luasPermukaan();
        bangunRuang.volume();
        bangunRuang.tampil();
    }
    public static void main(String[] args) {
        System.out.println("Bola");
        mainBangunRuang i = new mainBangunRuang();
        i.hitung(new Bola(7));
        
        System.out.println("Tabung");
        mainBangunRuang j = new mainBangunRuang();
        j.hitung(new Tabung(7, 3));
    }
}

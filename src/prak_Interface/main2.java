
package prak_Interface;

public class main2 {
    public static void main(String[] args) {
        Kucing k = new Kucing("ciko", 4);
        k.displayAll();
        System.out.println("ambil nama kucingnya : " + k.getNamaKucing());
        System.out.println("");
        System.out.println("==========================");
        System.out.println("");
        k.setNamaKucing(" Meriko ");
        k.displayAll();
        System.out.println("");
        System.out.println("==========================");
        System.out.println("");
        mobil m = new mobil("BMW", 4);
        m.displayMobil();
        
}
}

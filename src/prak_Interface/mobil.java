
package prak_Interface;


public class mobil implements bergerak{
    private String merekMobl;
    private int jumlahRoda;

    public mobil(String merekMobl, int jumlahRoda) {
        this.merekMobl = merekMobl;
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void berjalan() {
        System.out.println("mobil bergerak degan" + jumlahRoda);
    }
    
    public void displayMobil(){
        System.out.println("Merek mobil " + merekMobl);
        berjalan();
    }
}

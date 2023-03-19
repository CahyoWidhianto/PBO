
package coba;

public class kucing extends hewan implements bergerak{
    private String namaKucing;

    public kucing(String namaKucing, int jumlah_kaki) {
        super(jumlah_kaki);
        this.namaKucing = namaKucing;
    }

    

    public String getNamaKucing() {
        return namaKucing;
    }

    public void setNamaKucing(String namaKucing) {
        this.namaKucing = namaKucing;
    }

    @Override
    protected void makan() {
        System.out.println("kucing" + getNamaKucing() + " makan ikan");
    }

    @Override
    protected void bernafas() {
        System.out.println( getNamaKucing());
    }

    @Override
    public void setNamaKucing() {
    }

    @Override
    public void berjalan() {
        System.out.println("kucing" + getNamaKucing() +"berjalan dengan " + jumlah_kaki);
    }
    
     public void displayAll(){
         System.out.println("Nama Kucing " + getNamaKucing());
         bernafas();
         berjalan();
         makan();
    }  
    
    
}

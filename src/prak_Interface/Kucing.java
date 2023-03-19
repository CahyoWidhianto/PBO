
package prak_Interface;

public  class Kucing extends Hewan implements bergerak{
        
    private String namaKucing;

    public Kucing(String namaKucing, int jumlah_kaki) {
        super(jumlah_kaki);
        this.namaKucing = namaKucing;
    }
    
    public String getNamaKucing() {
        return namaKucing;
    }
    @Override
    public void setNamaKucing() {
        
    }
     public void setNamaKucing(String namaKucing) {
        this.namaKucing=namaKucing;
    }
    public void makan(){
        System.out.println("Kucing " + getNamaKucing() + " makan ikan");
    }
    public void bernafas(){
        System.out.println("Kucing " + getNamaKucing() + " bernafas dengan paru-paru");
    }
    public void berjalan(){
        System.out.println("Kucing " + getNamaKucing() + " berjalan dengan " + jumlah_kaki);
    }
    public void displayAll(){
        System.out.println("Nama Kucing "+ getNamaKucing());
        bernafas();
        berjalan();
        makan();
    }
}

//    @Override
//    protected void makan() {
//       System.out.println("Kucing " + getNamaKucing() + " makan ikan");
//    }
//
//    @Override
//    protected void bernafas() {
//        System.out.println("Kucing " + getNamaKucing() + " bernafas dengan paru-paru");
//    }
//
//    @Override
//    public String getNamaKucing() {
//         return namaKucing;
//    }
//
//    //public void setNamaKucing(String namaKucing) {
//        //this.namaKucing=namaKucing;
//    //}
//
//    @Override
//    public void setNamaKucing() {
//      
//    }
//
//    @Override
//    public void berjalan() {
//        System.out.println("Kucing " + getNamaKucing() + " berjalan dengan " + jumlah_kaki);
//    }
//    public void displayAll(){
//        System.out.println("Nama Kucing "+ getNamaKucing());
//        bernafas();
//        berjalan();
//        makan();
//    }  
//
//    
//}
   

    

 

    


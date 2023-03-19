
package komposisi;


public class Kubus {
    private persegi persegi;
    private String warna;
    

    public Kubus() {
       this.persegi = new persegi();
       persegi.setSisi(5);
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public double hitungLuasPermukaan(){
        return 6*persegi.getSisi();
    }
    
    public double hitungVolume(){
        return persegi.getSisi()*persegi.getSisi()*persegi.getSisi();
    }
    public String toString(){
        return    persegi + "\nKUBUS" +"\nLuas Permukaan : " + 
                hitungLuasPermukaan()+ "\nVolume : " + hitungVolume();
    }
    
    
    
    
}

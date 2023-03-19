
package Agregasi;


public class tabung {
    private double tinggi;
    private String warna;
    private lingkaran lingkaran;

    public tabung(double tinggi, String warna, lingkaran lingkaran) {
        this.tinggi = tinggi;
        this.warna = warna;
        this.lingkaran = lingkaran;
    }

    public lingkaran getLingkaran() {
        return lingkaran;
    }

    public void setLingkaran(lingkaran lingkaran) {
        this.lingkaran = lingkaran;
    }
    
    public double hitungLuasPermukaan(){
        return lingkaran.hitungKeliling()*tinggi;
    }
    
    public double hitungVolume(){
        return lingkaran.hitungLus()*tinggi;
    }
    
    public String toString(){
        return  "tabung \n" + lingkaran + "\ntinggi : " + tinggi + "\nwarna : " +
                warna + "\nLuas permukaan tabung : " + hitungLuasPermukaan() + "\nVolime tabung: "
                + hitungVolume();
    }
 }

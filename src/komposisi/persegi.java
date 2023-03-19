
package komposisi;


public class persegi {
    private double sisi;

    public persegi() {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public double hitungKeliling(){
        return 4*sisi;
    }
    
    public double hitungLuas(){
        return Math.pow(sisi, 2);
    }
    
    public String toString(){
        return  "\nSisi : " + sisi + "\nKeliling Persegi : " + 
                hitungKeliling()+ "\nLuas Persegi : " + hitungLuas();
        
    }
}

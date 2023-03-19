
package Agregasi;


public class lingkaran {
    private double jarijari;

    public lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public double hitungKeliling(){
        return 2*(Math.PI*jarijari);
    }
    
    public double hitungLus(){
        return Math.PI * Math.pow(jarijari, 2);
    }

   public String toString(){
       return "lingkaran\n" + "jari-jari : " +jarijari + "\nKeliling lingkaran : "+ 
               hitungKeliling() + "\nLuas lingkaran : "+ hitungLus();
   }
    
}

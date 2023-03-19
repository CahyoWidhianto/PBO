
package prak2;



public class EnergiPotensial {
    
    private  double[] massa = new double [5];
    private double gravitasi = 10;
    private double Kawal;
    private double KAkhir;
    
    
    public EnergiPotensial (double gravitasi, double Kawal,double KAkhir){
       this.gravitasi = gravitasi;
       this.Kawal = Kawal;
       this.KAkhir = KAkhir;  
    }
    
    public double Ep0(int m){
    return   ( massa[m] * gravitasi * Kawal );
    }
    
    public double Ep1(int m){
        return ( massa[m] * gravitasi * KAkhir);
        
    }
    
    public void tampilmassa (double massa[]){
        this.massa = massa;
   }
        
    public double W(){
        return this.Ep1(0) - this.Ep0(0);
    }
    
   
}
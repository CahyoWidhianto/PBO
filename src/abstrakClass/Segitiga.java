
package abstrakClass;

public class Segitiga extends Sheep{
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi, String Color) {
        super(Color);
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungLuas() {
        return 0.5*alas*tinggi;
    }
    public double hitungKeliling()
    {
        return alas+tinggi+(Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2)));
    }
    
}

       
   


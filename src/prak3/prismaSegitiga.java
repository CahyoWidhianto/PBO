
package prak3;


public class prismaSegitiga extends bangunRuang{
    private double alas, tinggiSegitiga;

    public prismaSegitiga(double alas, double tinggiSegitiga, String warna, int tinggiBangunRuang) {
        super(warna, tinggiBangunRuang);
        this.alas = alas;
        this.tinggiSegitiga = tinggiSegitiga;
    }
    
    public void setAlas(int alas){
         this.alas = alas;
    }
    public double getTinggiPrisma(){
        return tinggiBangunRuang;
    }
    
    @Override
    public double hitungVolume(){
        return ((alas * tinggiSegitiga)/2)* tinggiBangunRuang;
    }
    
    public double luasAlas(){
        return  0.5*alas*tinggiSegitiga;
    }
    public double kelilingAlas(){
        return alas+tinggiSegitiga+(Math.sqrt(Math.pow(alas,2)+Math.pow(tinggiSegitiga,2)));
    }
    @Override
    public double hitungLuas(){
        return hitungVolume() / tinggiBangunRuang;
    }
    public double hitungLuasPermukaan(){
       return  (double) ((2 * luasAlas()) + (kelilingAlas() * tinggiBangunRuang));
    }
    public void tampilkanSemuaDataPrisma(){
        System.out.println("warna : " + warna);
        System.out.println("alas : " + alas);
        System.out.println("tinggi segitiga : " + tinggiSegitiga);
        System.out.println("tinggi prisma : " + tinggiBangunRuang);
        System.out.println("luas prisma : " + hitungLuas());
        System.out.println("volume prisma : " + hitungVolume());
        System.out.println("luas permukaan prisma : " + hitungLuasPermukaan());
        
        
    }
}

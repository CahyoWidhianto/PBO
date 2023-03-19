
package prak3;

public class balok extends bangunRuang{
    private double panjang, lebar;

    public balok(double panjang, double lebar, String warna, int tinggiBangunRuang) {
        super(warna, tinggiBangunRuang);
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public void settTinggiBalok(int tinggiBangunRuang){
        this.tinggiBangunRuang = tinggiBangunRuang;
    }
    public double gettTinggiBalok(){
        return tinggiBangunRuang;
    }
    
    
    @Override
    public double hitungLuas(){
        return 2 * (panjang*lebar + panjang*tinggiBangunRuang + lebar*tinggiBangunRuang);
    }
    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggiBangunRuang;
    }
    public double hitungLuasPermukaan(){
        return hitungVolume() / tinggiBangunRuang;
    }
    public void tampilSemuaDataBalok(){
        System.out.println("panjang : " + panjang);
        System.out.println("lebar : " + lebar);
        System.out.println("luas : " + hitungLuas());
        System.out.println("volume : " + hitungVolume());
        System.out.println("luas permukaan : " + hitungLuasPermukaan());
        System.out.println("tinggi bangun ruang : " + tinggiBangunRuang);
    }

    
    
}

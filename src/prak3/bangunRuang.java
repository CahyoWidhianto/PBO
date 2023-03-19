
package prak3;


public abstract class bangunRuang {
    String warna;
    double tinggiBangunRuang;

    public bangunRuang(String warna, int tinggiBangunRuang) {
        this.warna = warna;
        this.tinggiBangunRuang = tinggiBangunRuang;
    }
    
    public abstract double hitungLuas();
    public abstract double hitungVolume();
    
    protected void info(){
        System.out.println("warna : " + warna);
        System.out.println("tinggi bangun ruang : " + tinggiBangunRuang);
    }

    public double getTinggiBangunRuang() {
        return tinggiBangunRuang;
    }

}

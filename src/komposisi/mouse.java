
package komposisi;


public class mouse {
    private String merk, warna;

    public mouse(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }
   
    public String toString(){
        return "merk : "  + merk +" \nwarna : " +warna;
    }
}

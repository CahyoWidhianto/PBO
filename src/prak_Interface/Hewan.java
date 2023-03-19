
package prak_Interface;


public abstract class Hewan implements Peliharaan{
    protected int jumlah_kaki;

    public Hewan(int jumlah_kaki) {
        this.jumlah_kaki = jumlah_kaki;
    }
    
   protected abstract void makan();
   protected abstract void bernafas();
    }


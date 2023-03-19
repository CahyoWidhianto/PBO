
package coba;


public abstract class hewan  implements peliharaan{
     protected int jumlah_kaki;

    public hewan(int jumlah_kaki) {
        this.jumlah_kaki = jumlah_kaki;
    }
    
   protected abstract void makan();
   protected abstract void bernafas();
}

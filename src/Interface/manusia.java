
package Interface;


public class manusia implements gerak {
    private String nama, alamat;

    public manusia(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    @Override
    public void gerakmaju() {
           System.out.println("majuuuu");
    }
    public void gerakmundur() {
        System.out.println("mundurrrr");  
    }

    @Override
    public void gerakmudur() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

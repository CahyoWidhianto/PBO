
package Interface;


public class mobil implements gerak{
    private String plat, merk;

    public mobil(String plat, String merk) {
        this.plat = plat;
        this.merk = merk;
    }
     @Override
    public void gerakmaju() {
           System.out.println("gass");
    }
    public void gerakmundur() {
        System.out.println("rem");  
    }

    @Override
    public void gerakmudur() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
}

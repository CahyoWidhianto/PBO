
package TTS;


public class Gitar extends alatMusik{
    private String bentuk;
    private int jumlahSenar;

    public Gitar(String bentuk, int jumlahSenar, String warna, String tahunBuat) {
        super(warna, tahunBuat);
        this.bentuk = bentuk;
        this.jumlahSenar = jumlahSenar;
    }
    public void infoGitar() {
        System.out.println("bentuk : " +bentuk);
        System.out.println("Jumlah Senar : " + jumlahSenar);
        info();
    }

    @Override
    public void bunyi() {
        System.out.println("bunyi");
        System.out.println("jrengggg jrengggg");
    }
    
    public void dipetik(){
        System.out.println("diptik");
        System.out.println("tingggg tinggggg");
    }

    
    
    
    
}

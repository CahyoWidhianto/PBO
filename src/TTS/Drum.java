
package TTS;


public class Drum extends alatMusik{
    private int jumlahPedal;
    private String jenis;

    public Drum(int jumlahPedal, String jenis, String warna, String tahunBuat) {
        super(warna, tahunBuat);
        this.jumlahPedal = jumlahPedal;
        this.jenis = jenis;
    }
    public void infoDrum() {
        System.out.println("pedal : " +jumlahPedal);
        System.out.println("Jenis : " + jenis);
        info();
    }

    @Override
    public void bunyi() {
        System.out.println("bunyi");
        System.out.println("dukk cess dukk cesss");
    }
    public void dipukul(){
        System.out.println("dipukul");
        System.out.println("demm demmm demmmm");
    }

   
    
    
    
}

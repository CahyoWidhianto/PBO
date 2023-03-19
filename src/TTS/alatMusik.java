
package TTS;

public abstract class alatMusik {
    private String warna, tahunBuat;

    public alatMusik(String warna, String tahunBuat) {
        this.warna = warna;
        this.tahunBuat = tahunBuat;
    }
    public abstract void bunyi();
    public  void  info(){
        System.out.println("warna : " + warna);
        System.out.println("Tahun Buat : " + tahunBuat);
    }
    
}

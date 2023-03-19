
package cuk;


public class EnergiPotensialMain {
    public static void main(String[] args) {
        EnergiPotensial ep = new EnergiPotensial(10, 20, 5);
        ep.setMassa(8, 12, 20, 24, 28);
        System.out.print("massa : ");
        ep.tampilkanMassa();
        System.out.println("gravitasi : " + ep.getGravitasi());
        System.out.println("Ketinggi Awal : " + ep.getkAwal());
        System.out.println("Ketinggian Akhir : " + ep.getkAkhir());
        System.out.println("ep0 dari massa ke-2 : " + ep.ep0(1));
        System.out.println("ep1 dari massa ke-2 : " + ep.ep1(1));
        System.out.println("===================================");
        
        
        
//        System.out.println("niali W : " + ep.menghitungNIlaiWork());
//        System.out.println("===================================");
//        System.out.println("jumlah nilai work massa ke-1" + ep.jumlahWork(0));
//        System.out.println("jumlah nilai work massa ke-2" + ep.jumlahWork(1));
//        System.out.println("jumlah nilai work massa ke-3" + ep.jumlahWork(2));
//        System.out.println("jumlah nilai work massa ke-4" + ep.jumlahWork(3));
//        System.out.println("jumlah nilai work massa ke-5" + ep.jumlahWork(4));
//        System.out.println("====================================");
//        System.out.println("jumlah work total : " + ep.menghitungNilaiWorkAll());
//        System.out.println("====================================");
//        System.out.println("Rata-rata Work " + ep.ratarataWork());
//        System.out.println("=====================================");
//        System.out.println("nilai max Work : " + ep.nilaiMaxWork());
    
}
}

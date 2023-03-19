
package prak3;


public class main {
    public static void main(String[] args) {
        //main balok
        balok b = new balok(12, 4, "biru", 5);
        System.out.println("*********INI BALOK**********");
        System.out.println("volume balok : " + b.hitungVolume());
        System.out.println("=========================");
        System.out.println("luas balok : " + b.hitungLuas());
        System.out.println("==========================");
        System.out.println("luas permukaan balok : " + b.hitungLuasPermukaan());
        System.out.println("===========================");
        b.tampilSemuaDataBalok();
        System.out.println("============================");
        b.settTinggiBalok(15);
        b.tampilSemuaDataBalok();
        //main prisma
        prismaSegitiga p = new prismaSegitiga(8, 12, "hijau", 22);
        System.out.println("******INI PRISMA**********");
        System.out.println("volume prisma : " + p.hitungVolume());
        System.out.println("=============================");
        System.out.println("luas prisma : " +p.hitungLuas());
        System.out.println("==============================");
        System.out.println("luas permukaan prisma : " + p.hitungLuasPermukaan());
        System.out.println("=============================");
        p.tampilkanSemuaDataPrisma();
        System.out.println("==============================");
        p.setAlas(7);
        p.tampilkanSemuaDataPrisma();
        
        
        
        
    }
}
  
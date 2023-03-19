
package abstrakClass;


public class mainAbstrak {
    public static void main(String[] args) {
        Segitiga s = new Segitiga(4, 3, "red");
        System.out.println("luas segitiga : " + s.hitungLuas());
        System.out.println("keliling segitiga : " + s.hitungKeliling());
        System.out.println("ini warna " + s.getcolor());
        
        persegi p = new persegi(3, "merah");
        System.out.println("luas persegi :" + p.hitungLuas());
        System.out.println("keliling persegi : " + p.hitungKeliling());
        System.out.println("warna persegi adalah " + p.getcolor());
    }
}

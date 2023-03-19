
package nested;


public class main2 {
    public static void main(String[] args) {
        System.out.println("sebelum di edit");
        System.out.println("");
        Dosen D = new Dosen("Bobi");
        Dosen.Alamat A = D.new Alamat("hahaha", "hihihi");
        A.diplay();
        System.out.println("===========================");
        System.out.println("setelah di edit");
        System.out.println("");
        A.setKecamatan("hihihi");
        A.setProvinsi("hahaha");
        A.diplay();
    }
}

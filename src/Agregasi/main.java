
package Agregasi;


public class main {
    public static void main(String[] args) {
       //objek lingkaran
        lingkaran l= new lingkaran(7);
        System.out.println(l);
        System.out.println("****************");
        System.out.println("================");
        //objek tabung
        tabung t= new tabung(10, "hijau", l);
        System.out.println(t);
       
    }
}

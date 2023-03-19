
package Agregasi;

public class mainMahasiswa {
    public static void main(String[] args) {
        mahasiswa m = new mahasiswa("2042101827", "Cahyo Widhianto");
        mataKuliah mk= new mataKuliah("0001", "PBO");
        jurusan j = new jurusan("421018", "Informatika", m, mk);
        System.out.println(j.toString());
        
    }
   
}
    
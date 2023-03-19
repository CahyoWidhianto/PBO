
package Agregasi;

public class mahasiswa {
    private String nim, nama;

    public mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
    
    public String toString(){
        return "\nNIM : " + nim + "\nNama : " + nama;
    }
}

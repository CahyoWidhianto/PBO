
package Agregasi;

public class mataKuliah {
    private String kd_mataKuliah, nama_mataKuliah;

    public mataKuliah(String kd_mataKuliah, String nama_mataKuliah) {
        this.kd_mataKuliah = kd_mataKuliah;
        this.nama_mataKuliah = nama_mataKuliah;
    }
    
    public String toString(){
        return "\nKode Mata Kuliah : " + kd_mataKuliah + "\nNama Mata Kuliah : " 
                + nama_mataKuliah;
    }
}


package Agregasi;


public class jurusan {
    private String kd_jurusan, nama_jurusan;
    private mahasiswa mahasiswa;
    private mataKuliah mataKuliah;

    public jurusan(String kd_jurusan, String nama_jurusan, mahasiswa mahasiswa, mataKuliah mataKuliah) {
        this.kd_jurusan = kd_jurusan;
        this.nama_jurusan = nama_jurusan;
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
    }
    
    public String toString(){
        return mahasiswa.toString() + mataKuliah.toString()+ "\nkd_jurusan : " +
                kd_jurusan + "\nNama_jurusan : " + nama_jurusan;
    }
}

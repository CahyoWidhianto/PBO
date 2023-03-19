
package nested;


public class Dosen {
    private String nama;
    private String alamat;

    public Dosen(String nama) {
        this.nama = nama;
    }

    public String getalamat() {
        return alamat;
    }
    
    public class Alamat{
        private String kecamatan, provinsi;

        public Alamat(String kecamatan, String provinsi) {
            this.kecamatan = kecamatan;
            this.provinsi = provinsi;
        }
        public String getalamat(){
            return Dosen.this.getalamat();
        }

        public String getKecamatan() {
            return kecamatan;
        }

        public void setKecamatan(String kecamatan) {
            this.kecamatan = kecamatan;
        }

        public String getProvinsi() {
            return provinsi;
        }

        public void setProvinsi(String provinsi) {
            this.provinsi = provinsi;
        }
        
        public void diplay(){
            System.out.println("Nama Dosen : " + nama);
            System.out.println("Alamat Dosen");
            System.out.println("Kecamatan : " + kecamatan);
            System.out.println("Provinsi : " + provinsi);
        }
        
        
        
    }
    
}

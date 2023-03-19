package depedensi;

public class main {

    public static void main(String[] args) {
        //objek matkul
        MataKuliah mk1 = new MataKuliah("PBO");
        MataKuliah mk2 = new MataKuliah("Kewarganegaraan");
        MataKuliah mk3 = new MataKuliah("Jarkom");
        MataKuliah mk4 = new MataKuliah("PWEB");
        MataKuliah mk5 = new MataKuliah("Agama");
        MataKuliah mk6 = new MataKuliah("ASD");
        MataKuliah mk7 = new MataKuliah("Logika");
        MataKuliah mk8 = new MataKuliah("Assambler");
        MataKuliah mk9 = new MataKuliah("Filsafat");
        MataKuliah mk10 = new MataKuliah("Matematika");
        MataKuliah mk11 = new MataKuliah("Matdis");
        MataKuliah mk12 = new MataKuliah("Pengantar TI");
        
        
        // objek dosen
        
//        Dosen d1= new Dosen("widhi");
//        d1.tambahMataKuliah(mk12);
//        d1.tambahMataKuliah(mk1);
//        d1.tambahMataKuliah(mk4);
//        d1.tambahMataKuliah(mk11);
//        d1.tambahMataKuliah(mk8);
//        d1.printInfo();
        
        
        Dosen d9 = new Dosen("anto");
        d9.tambahMataKuliah(mk3);
        d9.tambahMataKuliah(mk4);
        d9.tambahMataKuliah(mk5);
        d9.tambahMataKuliah(mk6);
        d9.tambahMataKuliah(mk7);
        d9.tambahMataKuliah(mk8);
        d9.tambahMataKuliah(mk2);
        d9.tambahMataKuliah(mk9);
        d9.printInfo();
        
                
  }
}
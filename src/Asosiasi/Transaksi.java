
package Asosiasi;


public class Transaksi {
   public static void main(String[] args) 
  {
    
      Pembeli pem1 = new Pembeli("P001", "haha");
      Pembeli pem2 = new Pembeli("P002", "hihi");

      Obat obat1 = new Obat("O1", "A", 50);
      Obat obat2 = new Obat("O2", "B", 223);
      Obat obat3 = new Obat("O3", "C", 2);
      Obat obat4 = new Obat("O4", "D", 1);
      Obat obat5 = new Obat("O5", "E", 10);
      Obat obat6 = new Obat("O6", "F", 45);
      Obat obat7 = new Obat("O7", "G", 14);
      Obat obat8 = new Obat("O8", "H", 5);
      Obat obat9 = new Obat("O9", "I", 11);


      obat1.printObat();  
      obat2.printObat();
      obat3.printObat();
      obat4.printObat();
      obat5.printObat();
      obat6.printObat();
      obat7.printObat();
      obat8.printObat();
      obat9.printObat();

      System.out.println("==============================================================================");

      pem1.tambahObat(obat1);
      pem1.tambahObat(obat2);
      pem1.tambahObat(obat3);
      pem1.tambahObat(obat4);
      pem1.tambahObat(obat7);

      pem2.tambahObat(obat7);
      pem2.tambahObat(obat4);
      pem2.tambahObat(obat1);

      pem1.printDataPembeli();
      pem2.printDataPembeli();

      System.out.println("===============================================================================");
      obat1.printObat();  
      obat2.printObat();
      obat3.printObat();
      obat4.printObat();
      obat5.printObat();
      obat6.printObat();
      obat7.printObat();
      obat8.printObat();
      obat9.printObat();

  }
}
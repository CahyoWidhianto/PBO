
package Asosiasi;


import java.util.ArrayList;

public class Pembeli
{
  private String idPembeli;
  private String namaPembeli;
  ArrayList<String> daftarObat = new ArrayList<String>();


  public Pembeli(String idPembeli, String namaPembeli)
  {
    this.idPembeli = idPembeli;
    this.namaPembeli = namaPembeli;
  }

  public void tambahObat(Obat obat)
  {
    
    if(obat.getStok() > 0)
    {
      daftarObat.add(obat.getNamaObat());
    }
    obat.kurangStok();
    
  }

  public void printDataPembeli()
  {
    System.out.println("id_Pembeli :" + idPembeli);
    System.out.println("Nama Pembeli : " + namaPembeli);
    System.out.println("List obat : ");
    for(int i = 0; i < daftarObat.size(); i++)
    {
      System.out.print(daftarObat.get(i) + " ");
      
     }
     System.out.println();
  
  }

  

}

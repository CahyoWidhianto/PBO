
package Asosiasi;

public class Obat
{
  private String kodeObat;
  private String namaObat;
  private int stok;

  public Obat(String kodeObat, String namaObat, int stok)
  {
    this.kodeObat = kodeObat;
    this.namaObat = namaObat;
    this.stok = stok;
  }

 
  public String getNamaObat()
  {
    return namaObat;
  }

 
  public void kurangStok()
  {
    stok--;
  }

  public void printObat()
  {
      System.out.println("kode Obat : " + kodeObat);
    if(stok > 0)
    {
       System.out.println("Nama : " + namaObat + ", stok : " + stok);
    }
    else
    {
      System.out.println("Obat " + namaObat + " habis");
    }
   
  }

  public int getStok()
  {
    return stok;
  }

  
}

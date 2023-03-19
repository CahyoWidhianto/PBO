
package depedensi;


public class Dosen
  {
    private String nama;
    private int jumlah = 5;
    int totalSkrng = 0;
    String arr[] = new String[jumlah];
   

    public Dosen(String nama)
    {
      this.nama = nama;
    }

    public void tambahMataKuliah(MataKuliah matkul)
    {
       
       if(totalSkrng < jumlah)
       {
         arr[totalSkrng] = matkul.getNamaMataKuliah();
         totalSkrng++;
       }
       else{
           System.out.println("melebihi kapasitas");
       }
      
    }

    public void printInfo()
    {
      System.out.println("Nama  : " + nama);
      System.out.println("Matkul : \n" );
      for(int i = 0; i < jumlah; i++)
        {
          System.out.println(arr[i]);
        }
      
      
    }
}

    
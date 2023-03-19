
package Polimorfisme;


public class mainBangunDatar_1827 {
    
    public void Hitung(bangunDatar_1827 bangunDatar){
        bangunDatar.Keliling();
        bangunDatar.Luas();
        bangunDatar.Tampil();
    }
    public static void main(String[] args) {
       
   
        //objek ligkaran 
        System.out.println("persegi panjang");
        mainBangunDatar_1827 x = new mainBangunDatar_1827();
        x.Hitung(new persegiPanjang(2, 3));
      
        System.out.println("lingkaran");
        //objek persegi 
        mainBangunDatar_1827 l = new mainBangunDatar_1827();
        l.Hitung(new Lingkaran(21));
        
    }
    
}

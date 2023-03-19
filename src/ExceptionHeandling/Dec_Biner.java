package ExceptionHeandling;

import java.util.Scanner;

public class Dec_Biner {

    int num;

    void dptkanNilai() {

        System.out.println("Konversi Bilangan Desimal Ke Biner");
        System.out.println("===================================");
        Scanner scan = new Scanner(System.in);

        System.out.print("\nMasukkan Bilangan Desimal :");
        num = scan.nextInt();
    }
    public void cek(){
        if(num < 0 ){
            System.out.println("tidak boleh minus");
        }
        else if(num > 100){
            System.out.println("100 aja ya");
        }
        else if(num ==0){
            System.out.println("tidak boleh 0");
        }
    }

    void konversi() {
        String binary = Integer.toBinaryString(num);
        System.out.println("Bilangan binernya adalah : " + binary);
    }
}




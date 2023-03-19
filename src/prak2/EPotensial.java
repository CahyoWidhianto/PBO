
package prak2;

import java.util.Arrays;


public class EPotensial {
        public static void main (String[]args){
     EnergiPotensial ep; 
        ep = new EnergiPotensial(10, 20, 5);
        double [] m = { 8, 12, 20, 24, 28};
        ep.tampilmassa(m);
        System.out.println("massa = " + Arrays.toString(m));
        System.out.println("hasil ep0 : " + ep.Ep0(1));
        System.out.println("hasil ep1 : " + ep.Ep1(1));
        System.out.println("hasil W : " + ep.W());
       
         
    }
        
        
    
}

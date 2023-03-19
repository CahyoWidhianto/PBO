
package nested;


public class Main {
    public static void main(String[] args) {
        Lingkaran L = new Lingkaran(7);
        Lingkaran.kerucut K = L.new kerucut(5);
        K.show();
        
    }
    
}

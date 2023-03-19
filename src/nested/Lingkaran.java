
package nested;


public class Lingkaran {
    private double r;

    public Lingkaran(double r) {
        this.r = r;
    }
    private double getr(){
        return r;
    }
    
    public class kerucut{
        private double t;
        
        public kerucut(double t){
            this.t =t;
        }
        public double gett(){
            return t;
        }
        public double getR(){
            return Lingkaran.this.getr();
        }
        public double K_lingkaran(){
            return 2*(Math.PI*r);
        }
        public double L_lingkaran(){
            return Math.PI * Math.pow(r, 2);
        }
        public double V_kerucut(){
            return 1/3* L_lingkaran()*t;
        }
        public double s(){
            return Math.sqrt(Math.pow(r,2)+ Math.pow(t,2));
        }
        public double L_alas_kerucut(){
            return Math.PI*r*(r + s());
        }
        
        public void show(){
            System.out.println("Lingkaran");
            System.out.println("jari jari : " + r);
            System.out.println("keliling lingkaran : " + K_lingkaran());
            System.out.println("luas lingkaran : " + L_lingkaran());
            System.out.println("========================");
            System.out.println("Kerucut");
            System.out.println("tinggi : " + t);
            System.out.println("volume kerucut : " + V_kerucut());
            System.out.println("luas alas kerucut : " + L_alas_kerucut() );
        }
        
    }
}

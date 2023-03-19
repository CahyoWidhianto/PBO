
package inheritancetask;


public class circel {
    private double r;
    private String color;
    public circel (double r, String color){
        this.r = r;
        this.color = color;
    }
        protected double getarea()
        {
            return 0.5 * 3.14 * this.r;
        } 
        protected String getColor()
        {
            return color;
        }
    }
    


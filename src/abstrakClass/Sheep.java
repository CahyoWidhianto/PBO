
package abstrakClass;


public abstract class Sheep {
    private String color;

    public Sheep(String color) {
        this.color = color;
    }
    
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
    
    public String getcolor(){
        return color;
    }
}

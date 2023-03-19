
package abstrakClass;

public class persegi extends  Sheep{
    private double sisi;

    public persegi(double sisi, String color) {
        super(color);
        this.sisi = sisi;
    }
    @Override
    public double hitungLuas(){
        return sisi * sisi;
    }
    public double hitungKeliling(){
        return sisi * 4;
    }
  
}

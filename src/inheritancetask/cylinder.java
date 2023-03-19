
package inheritancetask;


public class cylinder extends circel{
    private double height;
    
    public cylinder (double height, double r, String color)
    {
        super(r,color);
        this.height = height;
    }
    private double getAreacylinder()
    {
        return super.getarea() * height;
    }
    public void showdatacylider()
    {
        System.out.println("warna cylinder : " + super.getColor());
        System.out.println("Luas cylinder : " + getAreacylinder());
        System.out.println("Luas Lingkaran : " + getarea());
    }
}

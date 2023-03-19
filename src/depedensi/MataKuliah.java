
package depedensi;


public class MataKuliah {
    private String namaMataKuliah;

    public MataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }


    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    
    public void printMataKuliah(){
        System.out.println("mata kuliah : "+namaMataKuliah);
    }
}

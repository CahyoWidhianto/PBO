
package prak_Interface;


public class komputer implements keyboard, mouseBaru{
    public String merek_komputer;

    public komputer(String merek_komputer) {
        this.merek_komputer = merek_komputer;
    }
    
    void displayMerekKomputer(){
        System.out.println("Merek Komputer " + merek_komputer);
    }
    
    void displayMerekMouse(){
        System.out.println("merek mouse " + merek_mouse);
    }
        
    @Override
    public void tekan_Enter() {
        System.out.println("keyboard : Tekan Enter");
    }

    @Override
    public void tekan_Delete() {
        System.out.println("keyboard : Tekan Delete");
    }

    @Override
    public void double_klik() {
        System.out.println("mouse : Double klik");
    }

    @Override
    public void skrol() {
        System.out.println("mouse : Skrol bawah");
    }

    @Override
    public void klikKirir() {
        System.out.println("mouse : klik kiri");
    }

    @Override
    public void klikKanan() {
        System.out.println("mouse : klik kanan");
    }
    
    public void displayAll(){
        displayMerekMouse();
        displayMerekKomputer();
        klikKanan();
        klikKirir();
        double_klik();
        skrol();
        tekan_Enter();
        tekan_Delete();
    }
}

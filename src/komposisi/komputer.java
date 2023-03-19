
package komposisi;
public class komputer {
    private mouse mouse;
    private keyboard keyboard;
    private String merk, tipe;

    public komputer(String merk, String tipe) {
        this.merk = merk;
        this.tipe = tipe;
        this.mouse = new mouse("Joyseus", "Hitam");
        this.keyboard =  new keyboard("Rexsus");    
    }

    public void addKomponen(mouse mouse, keyboard keyboard ){
        mouse = mouse;
        keyboard = keyboard;
    }
    
    public String toString(){
        return "komputer\n " + "\nMerk : " + merk + "\nTipe : " + tipe +
                "\nmouse\n" + mouse.toString() +
                "\nKeyboard\n" + keyboard.toString();
    }
    
    
}

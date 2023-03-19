
package TTS;


public class main {
    public static void main(String[] args) {
        Gitar g= new Gitar("tele", 6, "coklat", "1960-3-23");
        g.bunyi();
        g.dipetik();
        g.infoGitar();
        System.out.println("===========");
        Drum d = new Drum(2, "elektrik", "hitam", "2013");
        d.bunyi();
        d.dipukul();
        d.infoDrum();
                
    }
}

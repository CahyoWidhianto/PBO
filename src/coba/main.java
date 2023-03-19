
package coba;

import prak_Interface.Kucing;

public class main {
    public static void main(String[] args) {
        Kucing k = new Kucing("ciko", 4);
        k.displayAll();
        System.out.println("nama : " + k.getNamaKucing());
}
}

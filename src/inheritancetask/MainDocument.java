
package inheritancetask;


public class MainDocument {
    public static void main(String[] args) {
        Book b = new Book("cahyo", "23-09-2021","hhhh");
        b.showDataBook();
        System.out.println("======================");
        Email e = new Email("hallo", "gatau", "cahyo", "23-09-2021");
        e.showDataEmail();
        System.out.println("=======================");
        e.setSubject("Tugas PBO");
        e.showDataEmail();

    }
}

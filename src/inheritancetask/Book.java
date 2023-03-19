
package inheritancetask;


public class Book extends Document{
    private String title;
    
    public Book(String authors, String date, String title){
        super(authors, date);
        this.title = title;
    }
    public void showDataBook(){
        showData();
        System.out.println("title : " + title);;
    }
    
}

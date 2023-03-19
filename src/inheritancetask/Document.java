
package inheritancetask;


public class Document {
    protected String authors, date;
    
    public Document(){
        
    }
    
    public Document(String authors, String date){
        this.authors = authors;
        this.date = date;
    }
    
    protected void showData(){
        System.out.println(" Authors : " + authors);
        System.out.println(" Date : " + date);
    }
}

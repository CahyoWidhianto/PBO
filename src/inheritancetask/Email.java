
package inheritancetask;

public class Email extends Document{
    private String Subject, to;

    public Email(String Subject, String to, String authors, String date) {
        super(authors, date);
        this.Subject = Subject;
        this.to = to;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getSubject() {
        return Subject;
    }
    
    public void showDataEmail(){
        showData();
        System.out.println("Subject : " + Subject );
        System.out.println("TO : " + to);
    }
}

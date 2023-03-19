
package generik;

import java.util.ArrayList;

//public class Queue<T> {
//    private ArrayList<T> value;
//    
//    public Queue(){
//        value= new ArrayList<T>();
//    }
//    public void enqueue(T val){
//        value.add(val);
//}
//    public T dequeue(){
//        T temp;
//        temp=value.get(0);
//        value.remove(0);
//        return temp;
//    }
//    
//     public int sizeofQueue()
//    {
//        return Value.size();
//    }
//     
//    public void printqueue()
//    {
//        for(int i=0;i<Value.size();i++)
//        {
//            System.out.println("value ke-"+i+"="+Value.get(i));
//        }
//    
//}




public class Queue<T> {
    private ArrayList<T> Value;
    public Queue() {
        Value= new ArrayList<T>();
    }
    public void enqueue(T val) {
       Value.add(val);
    }
    public T dequeue() {
        T temp;
        temp=Value.get(0);
        Value.remove(0);
        return temp;
    }
    public int sizeofQueue()
    {
        return Value.size();
    }
    public void printqueue()
    {
        for(int i=0;i<Value.size();i++)
        {
            System.out.println("value ke-"+i+"="+Value.get(i));
        }
    }
    
}

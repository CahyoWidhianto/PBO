
package generik;

import java.util.ArrayList;

public class generik {
    public static void enqueuefrist(Queue Q,String Val)
    {
        ArrayList temp = new ArrayList();
        int i;
      for(i = 0; i <= Q.sizeofQueue() + 1 ; i++)
        {
          temp.add(Q.dequeue());
        }

      System.out.println(temp);
      Q.enqueue(Val);
      System.out.println(Q.sizeofQueue());
      for(i = temp.size() - 1 ; i >= 0; i--)
        {
          Q.enqueue(temp.get(i));
        }
      
    }
    
    
    public static void deleteLast(Queue Q)
        {
            ArrayList temp= new ArrayList();
            int i;
            for(i=0;i<Q.sizeofQueue();i++)
            {
                temp.add(Q.dequeue());
            }
            Q.dequeue();
            for(i=0;i<temp.size();i++)
            {
                Q.enqueue(temp.get(i));
            }
        }
    public static void main(String[] args) {
        Queue<String> Q = new Queue();
        Q.enqueue("10 oeaoe");
        Q.enqueue("12 oaoe");
        Q.enqueue("13 okya");
        Q.printqueue();
        deleteLast(Q);
        System.out.println("size:"+Q.sizeofQueue());
        Q.printqueue();
        
         enqueuefrist(Q, "HI");
         Q.printqueue();
// System.out.println("deque 1:"+Q.dequeue());
       // System.out.println("deque 2:"+Q.dequeue());
// TODO code application logic here
    }
}

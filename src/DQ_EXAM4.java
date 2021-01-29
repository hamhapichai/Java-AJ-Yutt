// Java program to demonstrate the 
// iteration of elements in deque 
  
import java.util.*; 
public class DQ_EXAM4 { 
    public static void main(String[] args) 
    { 
        // Initializing an deque 
        Deque<String> dq 
            = new ArrayDeque<String>(); 
  
        // add() method to insert 
        dq.add("For"); 
        dq.addFirst("Geeks"); 
        dq.addLast("Geeks"); 
        dq.add("is so good"); 
  
        for (Iterator itr = dq.iterator(); 
             itr.hasNext();) { 
            System.out.print(itr.next() + " "); 
        } 
  
        System.out.println(); 
  
        for (Iterator itr = dq.descendingIterator(); 
             itr.hasNext();) { 
            System.out.print(itr.next() + " "); 
        } 
    } 
} 
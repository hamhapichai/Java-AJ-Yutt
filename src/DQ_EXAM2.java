// Java program to demonstrate the 
// addition of elements in deque 
  
import java.util.*; 
public class DQ_EXAM2 { 
    public static void main(String[] args) 
    { 
        // Initializing an deque 
        Deque<String> dq 
            = new ArrayDeque<String>(); 
  
        // add() method to insert 
        dq.add("For"); 
        dq.addFirst("Geeks"); 
        dq.addLast("Geeks"); 
  
        System.out.println(dq); 
    } 
} 
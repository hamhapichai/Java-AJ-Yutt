import java.util.*; 
public class DQ_EXAM3 { 
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
  
        System.out.println(dq.pop()); 
  
        System.out.println(dq.poll()); 
  
        System.out.println(dq.pollFirst()); 
  
        System.out.println(dq.pollLast()); 
    } 
} 
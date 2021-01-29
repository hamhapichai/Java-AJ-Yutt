package Exmplcode;
import java.util.Scanner;
public class linklist999 {
    static Scanner key=new Scanner(System.in);
    static Node h=null,t=null,n=null;
    static class Node{ 
        int data;
        Node link;
        public Node(int x) {
            this.data=x;
            this.link=null;
        }

        private Node() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    public static void input() {
        int x=0;
        while(x!=999) {   
            System.out.print("NUM :");x=key.nextInt();
        if(x==999){
            break;
                }else{
                  n=new Node();
                  n.data=x;
                  }
            if(h==null){
                break;
                   }else{
                    t.link=n;
                    t=n;
                    }
        }
    }
    public static void main(String[] args){
      input();

      
    }
}
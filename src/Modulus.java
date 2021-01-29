import java.util.Random; 
public class Modulus {
  public static void main(String[]args){
       Random rand = new Random(); 
       int rand_int1=0, x,head=0,tail=0;
       for(int i=1;i<=20;i++){
          rand_int1= rand.nextInt(10); 
          x=rand_int1%2;
          System.out.println("Round["+i+"]="+rand_int1+"Modulution="+x);  
          if(x==1)head+=1;
          else tail+=1;
     } 
          System.out.println("Summary head ="+head+"tail="+tail);
   }
}

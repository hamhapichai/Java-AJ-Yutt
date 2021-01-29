 public class TypeCasting {
   public static void main(String[]args){
     int x=30;
     double price=25000.00;
     System.out.println("x="+x+"price="+price);
     x=(int)price;
     price=x;
     System.out.println("x="+x+"price="+price);
   }
}

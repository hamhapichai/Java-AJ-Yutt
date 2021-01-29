public class StringCompare {
 public static void main(String args[]){
  String str1 ="abcd";
  String str2 ="abcd";
  if (str1==str2) System.out.println("Eqauls");
  else
     System.out.println("Not Eqauls");
  if (str1.compareTo(str2)==0) System.out.println("Eqauls");
  else
     System.out.println("Not Eqauls");
  
    System.out.println(str1.compareTo(str2));
 }  
}

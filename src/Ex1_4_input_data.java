import java.util.Scanner; // เรียกใช้ไลบรารี คลาส Scanner เพื่อใช้ป้อนข้อมูลทางแป้นพิมพ์
public class Ex1_4_input_data {
    public static void main(String[]args){
      Scanner Key = new Scanner(System.in); //สร้างตัวฮ็อปแจคใช้รับข้อมูล ชื่อ Key
      String name;
      int age;
      double salaly;
      float tax;
      System.out.println("ENTER DATA");
      System.out.print("NAME ;");name = key.next();
      System.out.print("AGE ;");age = key.nextInt();
      System.out.print("SALARY ;");salary = key.nextDouble();
      tax = (float)(salary * 3.5/100); //แปลงตัวเลขชนิด double ให้เป็น float (Conversion)
      System.out.printf("%sYou are %d years old Your salary are %.2f Tax = %.2f",name,age,salary,tax );
    }
} 
      

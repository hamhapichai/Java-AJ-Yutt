import java.util.Scanner; // เรียกใช้ไลบรารี คลาส Scanner เพื่อใช้ป้อนข้อมูลทางแป้นพิมพ์
public class Ex1_3_sum_mton {
    public static void main(String[] args){
      Scanner Key = new Scanner(System.in); //สร้างตัวฮ็อปแจคใช้รับข้อมูล ชื่อ Key
      int m=0,n=0,count=1,sum=0;
      System.out.print("Enter m ="); m = key.nextint(); // รูปแบบการรับข้อมูล integer m
      System.out.print("Enter n ="); n = key.nextint(); // รูปแบบการรับข้อมูล integer n
      do{
        sum=sum+m;
        System.out.printf("Round %d m = %d sum = %d",count,m,sum);
        m++;
        count++;
      }while(m<=n);
      System.out.printf("Summary of m - n = %d",sum);
    }
}

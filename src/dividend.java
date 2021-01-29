import java.util.Scanner;
public class dividend {
    static String code[] = new String[20];
    static String name[] = new String[20];
    static double sales[] = new double[20];
    static double dividend[] = new double[20];
    static int loop, n;
    static Scanner key = new Scanner(System.in);

public static void input() {
    System.out.print("รหัสพนักงานขาย : ");code[loop]=key.next();
    System.out.print("ชื่อพนักงานขาย : ");name[loop]=key.next();
    System.out.print("ยอดขาย : ");sales[loop]=key.nextDouble();
    if ((sales[loop]>=100)&&(sales[loop]<=10000)) dividend[loop]=sales[loop]*2/100;
    else if((sales[loop]>=10001)&&(sales[loop]<=50000)) dividend[loop]=sales[loop]*2.5/100;
    else if((sales[loop]>=50001)&&(sales[loop]<=100000)) dividend[loop]=sales[loop]*3/100;
    else if((sales[loop]>=100001)&&(sales[loop]<=500000)) dividend[loop]=sales[loop]*3.5/100;
    else dividend[loop]=sales[loop]*4/100;
}
public static void output(){
    String txt_sales = String.valueOf(sales[loop]);
    int name_len = name[loop].length();
    int sales_len = txt_sales.length();
    for (int i=1; i<=20-sales_len; i++){
        name[loop]=name[loop].concat(" ");
    }
    for (int i=1; i<= 20-sales_len; i++){
        txt_sales=txt_sales.concat(" ");
    }
    System.out.println(code[loop]+" "+name[loop]+txt_sales+dividend[loop]);
}
public static void main(String[] agrs){
    System.out.print("ต้องการคำนวณเงินปันผบของพนักงานกี่คน");n=key.nextInt();
    for (loop=1; loop<=n; loop++){
        input();
    }
    System.out.println("\t\t\tรายงานเงินปันผลของพนักงานขาย");
    System.out.println("======================================================================");
    System.out.println("รหัสพนักงาน           ชื่อพนักงาน              ยอดขาย                  เงินปันผล");
    System.out.println("======================================================================");
    for (loop=1; loop<=n; loop++){
        output();
    }
    System.out.println("======================================================================");
}
}
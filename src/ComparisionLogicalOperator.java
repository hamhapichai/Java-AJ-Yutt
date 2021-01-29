import java.text.DecimalFormat;
public class ComparisionLogicalOperator {
    public static void main(String[]args){
        int age=25;
        double salary=23000.00,net=0,loan=0.00;
        char sex='f';
        String lastname="P",credit="";
        DecimalFormat Datashow = new DecimalFormat("#.##0.00:(#.##0.00)");
        net = 6800.00;
        if(lastname=="Chin")loan = salary*100;
        else
          if((age>=20)&&(net>=(salary*0.3))) {loan= salary*30;credit="30%"}
         else
            if((age>=20)&&(net>=(salary*0.2))) {loan= salary*20;credit="20%"}
            else
               if((age>=20)&&(net<(salary*0.1))) {loan= salary*10;credit="10%"}
        System.out.println("Your credit is"+credit+"Loan="+Datashow.format(loan));
    }
}

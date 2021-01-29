public class Ex1_2_sum1to100 {
   public static void main(String[] args){
     int n=100,sum=0;
     for(int i=1;i<=n;i++){
        sum=sum +i;
        System.out.printf("Round %d Sum =%d\n",i,sum);
     }
   }
}

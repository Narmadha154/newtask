package logic;
import java.util.Scanner;
public class MeasureWater{
  public static int gcd(int a,int b){
     if(b==0){
       return a;
     }
     return gcd(b,a%b);
   }
   public static int pour(int fromCap,int toCap,int d){
     int from=fromCap;
     int to=0;
     int step=1;
     while(from!=d&&to!=d){
       int temp=Math.min(from,toCap-to);
       to+=temp;
       from-=temp;
       step++;
       if(from==d||to==d){
          break;
       }
       if(from==0){
          from=fromCap;
          step++;
       }
       if(to==toCap){
         to=0;
         step++;
       }
    }
     return step;
   }
  public static int minSteps(int m,int n,int d){
     if(m>n){
        int t=m;
        m=n;
        n=t;
     }
     if(d>n){
        return -1;
     }
     if((d%(gcd(n,m)))!=0){
         return -1;
     }
     return Math.min(pour(n,m,d),pour(m,n,d));
   }
  public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the capacity of jug 1:");
     int m=sc.nextInt();
     System.out.println("Enter the capacity of jug 2:");
     int n=sc.nextInt();
     System.out.println("Enter the litres of water to be measured:");
     int d=sc.nextInt();
     System.out.println("Minimum no of operations required:"+minSteps(m,n,d));
   }
 }
     

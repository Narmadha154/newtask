
package logic;
import java.util.Scanner;
public class OddNum{
  public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the starting range:");
     int startRange=sc.nextInt();
     System.out.println("Enter the ending range:");
     int endRange=sc.nextInt();
     int [] arr=new int[endRange-startRange];
     int j=0;
     for(int i=startRange;i<endRange;i++){
        if(i%2!=0){
           arr[j]=i;
           j++;
        }
     }
     System.out.println("Odd numbers in the given range:");
     for(int i=0;i<arr.length;i++){
      if(arr[i]!=0){
       System.out.println(arr[i]);
      }
     }
   }
 }

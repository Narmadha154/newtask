package logic;
import java.util.Scanner;
public class Leader{
public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of an array:");
      int length=sc.nextInt();
      System.out.println("Enter the elements of an array:");
      int [] arr=new int[length];
      for(int i=0;i<length;i++){
         arr[i]=sc.nextInt();
      }
      int [] leader=new int[20];
      int k=0,count=0;
      for(int i=0;i<length;i++){
         for(int j=i+1;j<length;j++){
           if(arr[i]>arr[j]){
               count++;
               if(count==(length-i-1)){
                  leader[k++]=arr[i];
               }
            }
         }
         count=0;
      }
      System.out.println("*");
      for(int i=0;i<k;i++){
        System.out.println(leader[i]);
      }
   }
}
                  
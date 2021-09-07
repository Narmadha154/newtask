package logic;
import java.util.Scanner;
public class Occurence{
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of an array:");
      int length=sc.nextInt();
      System.out.println("Enter the elements of an array:");
      int [] arr=new int[length];
      for(int i=0;i<length;i++){
         arr[i]=sc.nextInt();
      }
      int temp=0;
      for(int i=1;i<length;i++){
        for(int j=0;j<length-i;j++){
           if(arr[j]>arr[j+1]){
             temp=arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=temp;
           }
        }
      }
      int count=1;
      for(int i=0;i<length;i++){
         while(i<length-1&&(arr[i]==arr[i+1])){
             count++;
             i++;
         }
         System.out.println(arr[i]+"-"+count);
         count=1;
     }
   }
}
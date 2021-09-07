package logic;
import java.util.Scanner;
public class ZeroOne{
public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of an array1:");
      int length=sc.nextInt();
      System.out.println("Enter the elements of an array1:");
      int [] arr=new int[length];
      for(int i=0;i<length;i++){
         arr[i]=sc.nextInt();
      }
      int i=0,j=length-1;
      while(i<j){
        while(arr[i]==0&&i<j){
            i++;
        }
        while(arr[j]==1&&i<j){
            j--;
        }
        if(i<j){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
        }
     }
     System.out.println("*");
     for(i=0;i<length;i++){
          System.out.print(arr[i]+"\t");
     }
 }
}
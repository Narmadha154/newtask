package logic;
import java.util.Scanner;
public class LocalMin{
  public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of an array:");
      int length=sc.nextInt();
      System.out.println("Enter the elements of an array:");
      int [] arr=new int[length];
      for(int i=0;i<length;i++){
         arr[i]=sc.nextInt();
      }
      System.out.println("Local minima:");
      for(int i=0;i<length;i++){
          if(i==0){
             if(arr[i]<=arr[i+1]){
                System.out.println(arr[i]);
             }
          }
          else if(i==length-1){
              if(arr[i]<=arr[i-1]){
                System.out.println(arr[i]);
             }
          }
          else{
             if(arr[i]<=arr[i-1]&&arr[i]<=arr[i+1]){
                System.out.println(arr[i]);
             }
          }
      }
   }
}                
 
package logic;
import java.util.Scanner;
public class Index{
   public static int findIndex(int [] arr,int length,int number){
      int index=0;
      for(int i=0;i<length;i++){
          if(arr[i]==number){
             index=i;
          }
      }
    return index;
   }
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of an array:");
      int length=sc.nextInt();
      System.out.println("Enter the elements of an array:");
      int [] arr=new int[length];
      for(int i=0;i<length;i++){
         arr[i]=sc.nextInt();
      }
      System.out.println("Enter the number:");
      int number=sc.nextInt();
      int index=findIndex(arr,length,number);
       System.out.println("index is:"+index);
    }
  }
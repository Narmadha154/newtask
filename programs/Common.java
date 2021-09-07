package logic;
import java.util.Scanner;
public class Common{
public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of an array1:");
      int length1=sc.nextInt();
      System.out.println("Enter the elements of an array1:");
      int [] arr1=new int[length1];
      for(int i=0;i<length1;i++){
         arr1[i]=sc.nextInt();
      }
      System.out.println("Enter the length of an array2:");
      int length2=sc.nextInt();
      System.out.println("Enter the elements of an array2:");
      int [] arr2=new int[length2];
      for(int i=0;i<length2;i++){
         arr2[i]=sc.nextInt();
      }
      for(int i=0;i<length1;i++){
         for(int j=0;j<length2;j++){
            if(arr1[i]==arr2[j]){
                 System.out.println("common element:"+arr1[i]);
            }
         }
      }
   }
 }
      
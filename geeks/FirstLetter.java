
package logic;
import java.util.Scanner;
public class FirstLetter{
   public static String first(String [] arr){
      String newStr="";
      for(int i=0;i<arr.length;i++){
         int j=0;
         newStr+=arr[i].charAt(j);
     }
     return newStr;
   }
   public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string:");
     String str=sc.nextLine();
     String [] arr=str.split(" ");
     String newStr=first(arr);
     System.out.println(newStr);
   }
 }

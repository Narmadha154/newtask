
package logic;
import java.util.Scanner;
public class PossibleWords{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the string of integers:");
    String strOfInt=sc.next();
     int number=0;
    for(int i=0;i<strOfInt.length();i++){
      System.out.print((char)(((strOfInt.charAt(i)-48)-1)+'A'));
    }
    System.out.println();
    int i=0;
    while(i<strOfInt.length()-1){
      int count=2;
      while(count!=0&&i<strOfInt.length()&&strOfInt.charAt(i)>='0'&&strOfInt.charAt(i)<='9'){
        number=number*10+(strOfInt.charAt(i)-48);
        i++;
        count--;
        if(count==0){
         System.out.print((char)((number-1)+'A')); 
         for(int j=i;j<strOfInt.length();j++){
          System.out.print((char)(((strOfInt.charAt(j)-48)-1)+'A')); 
         }
        }
       }
    System.out.println();
    number=0;
    i--;
   }
  }
}

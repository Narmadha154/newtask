
package logic;
import java.util.Scanner;
public class StringIp{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int number=sc.nextInt();
    char [] arr=new char[20];
    int i=1;
    int count=0;
    int quotient=0;
    if(number>0&&number<=26){
       System.out.println((char)((number-1)+'A'));
    } 
    else if(number>26&&number<=999){
       System.out.println("A"+(char)(((number%26)-1)+'A'));
    }
    else{
      System.out.println("A"+(char)(((number%26)-1)+'A')+(char)(((number%26)-1)+'A'));
       /*arr[0]='A';
       quotient=number/10;
       count++;
       while(quotient>=10&&i==count){
          arr[i]=(char)(((number%26)-1)+'A');
          System.out.println(arr[i]);
          i++;
          quotient=number/10;
          count++;
          System.out.println(count);
       }
     }
    for(int j=0;j<arr.length;j++){
      // if(arr[i]){
         System.out.print(arr[j]);
      // }
      // else{
      // }*/
    }
  }
 }
          


package logic;
import java.util.Scanner;
public class NumInWords{
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number:");
      int num=sc.nextInt();
      String [] oneDigit={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
      String [] twoDigit={"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
      String [] multipleOfTens={"Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
      String [] powerOfTens={"hundred","thousand"};

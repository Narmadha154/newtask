
package logic;
import java.util.Scanner;
public class NumInWords{
   public String convertNumToWords(int number){
      String words=" ";
      String [] unitsArray={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Eleven","Twelve",
      "Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
      String [] tensArray={"Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
     // String [] powerOfTens={"hundred","thousand"};
     int newNum=0;
      if(number==0){
        return "zero";
      }
     /* if(number<0){
         String newStr=" "+number;
         newStr=newStr.substring(1);
         newNum=Integer.parseInt(newStr);
         return "minus"+ convertNumToWords(newNum);
      }*/
     if((number/1000000)>0){
       words+=convertNumToWords(number/1000000)+" million";
       number=number%1000000;
     }
      if((number/1000)>0){
       words+=convertNumToWords(number/1000)+" thousand";
       number=number%1000;
     }
      if((number/100)>0){
       words+=convertNumToWords(number/100)+" hundred";
       number=number%100;
     }
     if(number>0){
        if(number<20){
          words+=" "+unitsArray[number-1];
         }
         else{
           words+=" "+tensArray[(number/10)-1];
           if((number%10)>0){
             words+=" "+unitsArray[(number%10)-1];
            }
          }
       }
       return words;
   }
   public static void main(String [] args){
      NumInWords obj=new NumInWords();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number from 0 t0 999:");
      int num=sc.nextInt();
      String finalStr=obj.convertNumToWords(num);
      System.out.println("Number in words:"+ finalStr);
   }
 }
      
      

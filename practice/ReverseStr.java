

package logic;
import java.util.Scanner;
public class ReverseStr{
   public String reverseString(String [] strArr,int len,String newStr){
     newStr=newStr+strArr[len-1];
     len--;
     if(len!=0){
       newStr=newStr+" ";
       newStr=reverseString(strArr,len,newStr);
     }
     return newStr;
   }
   public static void main(String [] args){
    ReverseStr obj=new ReverseStr();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string:");
    String str=sc.nextLine();
    String [] arr=str.split(" ");
    int length=arr.length;
    String newString=" ";
    String newStr=obj.reverseString(arr,length,newString);
    System.out.println("reversed string:"+newStr);
    }
  }

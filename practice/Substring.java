package logic;
import java.util.Scanner;
public class Substring{
   public int findSubString(char [] string,char [] subString,int size,int subSize){
    int output=0;
     int p=0;
     int newSize=size-subSize-1;
     for(int i=0;i<newSize;i++){
       int k=i;
       for(int j=0;j<subSize;j++){
         if(string[k]==subString[j]){
            p++;
            if(p==(subSize-1)){
               output=i;
       }
      }
      k++;
     }
      if(output==0){
        output=-1;
      }
     }
     return output;
    }
   public static void main(String [] args){
     Substring obj=new Substring();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string");
     String str=sc.next();
     char [] ch=str.toCharArray();
     System.out.println("Enter the substring:");
     String subStr=sc.next();
     char [] subCh=subStr.toCharArray();
     int length1=str.length();
     int length2=subStr.length();
     int output=obj.findSubString(ch,subCh,length1,length2);
     System.out.println(output);
   }
  }
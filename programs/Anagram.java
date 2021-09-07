package logic;
import java.util.Scanner;
public class Anagram{
   public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string 1:");
     String str1=sc.next();
     System.out.println("Enter the string 2:");
     String str2=sc.next();
     char [] s1=str1.toCharArray();
     char [] s2=str2.toCharArray();
      boolean val=false;
     if(str1.length()!=str2.length()){
           System.out.println("not anagram");
     }
     else{
       char temp1,temp2;
       for(int i=1;i<str1.length();i++){
         for(int j=0;j<str1.length()-i;j++){
             if(s1[j]>s1[j+1]){
                 temp1=s1[j];
                 s1[j]=s1[j+1]; 
                 s1[j+1]=temp1;
             }
          }
      }
        for(int i=0;i<str1.length();i++){
       System.out.println("#"+s1[i]);
       }
       for(int i=1;i<str1.length();i++){
         for(int j=0;j<str1.length()-i;j++){
             if(s2[j]>s2[j+1]){
                 temp2=s2[j];
                 s2[j]=s2[j+1]; 
                 s2[j+1]=temp2;
             }
          }
      }
       for(int i=0;i<str1.length();i++){
       System.out.println("#"+s2[i]);
       }
     
      for(int i=0;i<str1.length();i++){
          if(s1[i]!=s2[i]){
              val=false;
          }
          else{
             val=true;
          }
      }
}
       if(val){
            System.out.println("anagram");
        }
        else{
           System.out.println("not anagram");
        }
  }
}
 
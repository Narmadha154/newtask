
import java.util.Scanner;
public class Pattern{
   public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of rows:");
     int row=sc.nextInt();
     System.out.println("Enter the word you want to print:");
     String word=sc.next();
     for(int i=0;i<word.length();i++){
       int j=row-1-i;
       for(int k=0;k<word.length();k++){
          if(k==i||k==j){
            System.out.print(word.charAt(k));
          }
          else{
            System.out.print(" ");
           }
      }
       System.out.println(" ");
    }
   }
  }

package logic;
import java.util.Scanner;
public class Permutation{
  public static void permute(String str,int start,int end){
     if(start==end-1){
       System.out.println(str);
     }
   else{
     for(int i=start;i<end;i++){
      str=swap(str,start,i);
      System.out.println("sss"+start+""+i);
      System.out.println("*"+str);
      permute(str,start+1,end);
      str=swap(str,start,i);
      System.out.println("nnn"+start+""+i);
      System.out.println("#"+str);
    }
  } 
}
  public static String swap(String str,int i,int j){
     char [] arr=str.toCharArray();
     char temp;
     temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
     return String.valueOf(arr);
  }
  public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string:");
      String str=sc.next();
      int n=str.length();
      permute(str,0,n);
  }
}

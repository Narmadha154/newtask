package logic;
import java.util.Scanner;
public class Freq{
  static int m=26;
  public static int getId(char ch){
    return (ch-'a');
  }
  public static boolean allSame(int [] freq,int n){
    int same=0;
    int i;
    for(i=0;i<n;i++){
      if(freq[i]>0){
          same=freq[i];
          break;
      }
    }
    for(int j=i+1;j<n;j++){
       if(freq[j]>0&&freq[j]!=same){
           return false;
        }   
    }
    return true;
 }
  public static boolean sameCharFreq(String str){
    int l=str.length();
    int [] freq=new int[m];
    for(int i=0;i<l;i++){
       freq[getId(str.charAt(i))]++;
    }
    if(allSame(freq,m)){
       return true;
    }
    for(char c='a';c<='z';c++){
       int i=getId(c);
       if(freq[i]>0){
          freq[i]--;
          if(allSame(freq,m)){
            return true;
          }
          freq[i]++;
       }
    }
    return false;
  }   
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string:");
    String str=sc.nextLine();
    if(sameCharFreq(str)){
       System.out.println("1");
    }
    else{
      System.out.println("0");
    }
  }  
 }   

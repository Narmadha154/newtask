
package logic;
import java.util.Scanner;
  public class RemoveParanthesis{
    public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string:");
      String str=sc.next();
      char [] arr=new char[50];
      char [] newArr=new char[50];
       int j=str.length()-1;
       for(int i=0;i<=j-1;i++){
          if(j==(str.length()/2)){
             j--;
           }
          if(i!=j){
            if(str.charAt(i)=='('){ 
              arr[i]=str.charAt(i);
            }
            if(str.charAt(j)==')'){
              newArr[i]=str.charAt(j);
            }
            if(str.charAt(i)>96&&str.charAt(i)<123||str.charAt(j)>96&&str.charAt(j)<123){
               arr[i]=str.charAt(i);
               newArr[i]=str.charAt(j);
           }
           j--;
          }
           else if(i==j){
             arr[i]=str.charAt(i);
          }
       }
      System.out.println("array");
      for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]);
     }
      System.out.println("new array");
      for(int i=0;i<newArr.length;i++){
         System.out.print(newArr[i]);    
      }
      int size=arr.length+newArr.length;
      int k=0;
      int count=0;
      char [] remArr=new char[size];
      for(int i=0;i<arr.length;i++){
         remArr[k]=arr[i];
         k++;
         count++;
      }
      for(int i=newArr.length-1;i>=0;i--){
         remArr[count]=newArr[i];
         count++;
      }
      System.out.println("balanced array");
      for(int i=0;i<remArr.length;i++){
         System.out.print(remArr[i]);
     }
   }
 }

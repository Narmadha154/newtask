package logic;
import java.util.*;
  public class OddDes{
    static Scanner sc=new Scanner(System.in);
    public int getIntegerInput(){
      int number;
      try{
       number=sc.nextInt();
      }
      catch(InputMismatchException e){      
        System.out.println("Invalid Input..Enter a integer");
        sc.next();
        number=getIntegerInput();
     }
     return number;
    }
    public static void main(String [] args){
      //Scanner sc=new Scanner(System.in);
      OddDes obj=new OddDes();
      System.out.println("Enter the size:");
      int size=obj.getIntegerInput();
      int [] arr=new int[size];
      System.out.println("Enter the numbers:");
      for(int i=0;i<size;i++){
         arr[i]=obj.getIntegerInput();
      }
      System.out.println("Array:");
      for(int i=0;i<size;i++){
         System.out.println(arr[i]);
      }
      int n=size/2;
      int j=0;
      int k=0;
      int [] oddArr=new int[n+1];
      int [] evenArr=new int[n];
      for(int i=0;i<size;i++){
         if(i%2==0){
             oddArr[j]=arr[i];
             j++;
         }
         else{
             evenArr[k]=arr[i];
             k++;
         }
      }
      System.out.println("odd Array:");
      for(int i=0;i<n+1;i++){
         System.out.println(oddArr[i]);
      }
      System.out.println("even Array:");
      for(int i=0;i<n;i++){
         System.out.println(evenArr[i]);
      }
      int temp=0;
      for(int i=1;i<n+1;i++){
        for(int m=0;m<n+1-i;m++){
         if(oddArr[m]<oddArr[m+1]){
            temp=oddArr[m];
            oddArr[m]=oddArr[m+1];
            oddArr[m+1]=temp;
         }
        }
      }
      System.out.println("odd Array:");
      for(int i=0;i<n+1;i++){
         System.out.println(oddArr[i]);
      }
      for(int i=1;i<n;i++){
        for(int m=0;m<n-i;m++){
         if(evenArr[m]>evenArr[m+1]){
            temp=evenArr[m];
            evenArr[m]=evenArr[m+1];
            evenArr[m+1]=temp;
         }
        }
      }
      System.out.println("even Array:");
      for(int i=0;i<n;i++){
         System.out.println(evenArr[i]);
      }
      int p=0;
      int q=0;
      int [] newArr=new int[size];
      for(int i=0;i<size;i++){
         if(i%2==0){
           newArr[i]=oddArr[p];
           p++;
         }
         else {
           newArr[i]=evenArr[q];
           q++;
         }
      }
     System.out.println("final Array:");
      for(int i=0;i<size;i++){
         System.out.println(newArr[i]);
      }
    }
   }
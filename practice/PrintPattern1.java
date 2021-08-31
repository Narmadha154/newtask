
package logic;
import java.util.Scanner;
public class PrintPattern1{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int number=sc.nextInt();
    int col=number+1;
    int arr [][]=new int[number][col];
    arr[0][0]=1;
    int count1=0,count2=0;
     for(int i=0;i<number-1;i++){
     int j=0;
      if(j<col){
         if(arr[i][j]==1||arr[i][j]==2&&j<col){
           count1++;
           j++;
         }
         /*if(arr[i][j]==2&&j<col){
           count2++;
           j++;
         }*/
      //  for(int j=0;j<number+1;j++){
       if(i!=4&&j!=5){
          arr[i+1][j]=count1;
          arr[i+1][j+1]=arr[i][j];
        }
        }
     }
     System.out.println("pattern");
     for(int i=0;i<number;i++){
       for(int j=0;j<col;j++){
         if(arr[i][j]!=0){
           System.out.print(arr[i][j]);
         }
         else{
          System.out.print(" ");
        }
        //System.out.println();
       }
      // System.out.println();
     }
   }
  }
           

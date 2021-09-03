
package logic;
import java.util.Scanner;
public class RotateMatrix{
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no.of rows:");
      int row=sc.nextInt();
      System.out.println("Enter the no.of columns:");
      int col=sc.nextInt();
      int [][] mat=new int[row][col];
      System.out.println("Enter the matrix elements:");
      for(int i=0;i<row;i++){
         for(int j=0;j<col;j++){
            mat[i][j]=sc.nextInt();
         }
      }
      int temp=0,temp1=0;
      int i=0;
      int j=col-1;
      temp=mat[i][j];
        for(j=col-2;j>=0;j--){
         if(j!=0){
           mat[i][j+1]=mat[i][j];
          }
          else{
            mat[i][j+1]=mat[i][j];
          }
        }
        i=row-1;
        j=col-1;
         temp1=mat[i][j];
         System.out.println("*"+temp1);
        for(i=row-1;i>0;i--){
          if(i==row/3){
            mat[i][j]=temp;
          }
         else{
           mat[i][j]=mat[i-1][j];
          }
        }
      i=row-1;
      j=0;
      temp=mat[i][j];
        for(j=0;j<col-1;j++){
         if(j!=col-2){
           mat[i][j]=mat[i][j+1];
          }
          else{
            mat[i][j]=temp1;
          }
        }
        j=0;
        for(i=0;i<row-1;i++){
          if(i==row-2){
            mat[i][j]=temp;
          }
         else{
           mat[i][j]=mat[i+1][j];
          }
        }
      System.out.println("*");
      for(i=0;i<row;i++){
         for( j=0;j<col;j++){
            System.out.print(mat[i][j]+"\t");
         }
         System.out.println();
     }
  }
}

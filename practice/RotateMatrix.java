
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
      int temp=0;
      int i=0;
       while(i<row){
           int j=col-1;
           temp=mat[i][j];
        for(j=col-2;j>=0;j--){
         if(j!=0){
           mat[i][j+1]=mat[i][j];
          }
          else{
            mat[i][j+1]=mat[i][0];
          }
        }
        i++;
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

package logic;
import java.util.Scanner;
public class Sudoku{
    static int n=9;
  public static boolean solveSudoku(int [] []grid,int row,int col){
    if(row==n-1&&col==n){
       return true;
    }
    if(col==n){
      row++;
      col=0;
    }
    if(grid[row][col]!=0){
      return solveSudoku(grid,row,col+1);
    }
      for(int num=1;num<10;num++){
       boolean val=true;
         for(int j=0;j<n;j++){
            if(grid[row][j]==num){
              val=false;
            }
         }
         for(int j=0;j<n;j++){
            if(grid[j][col]==num){
               val=false;
            }
         }
         int startRow=row-row%3,startCol=col-col%3;
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(grid[i+startRow][j+startCol]==num){
                   val=false;
                }
            }
         }
         if(val){
            grid[row][col]=num;
            if(solveSudoku(grid,row,col+1)){
               return true;
            }
        }
        grid[row][col]=0;
      }
      return false;
    }
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the elements:");
    int [] []grid=new int[n][n];
    for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
          grid[i][j]=sc.nextInt();
       }
    }
    int row=0,col=0;
    if(solveSudoku(grid,row,col)){
       for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             System.out.print(grid[i][j]+"\t");
         }
         System.out.println();
       }
    }
    else{
         System.out.println("No solution exists:");
    }
  }
}
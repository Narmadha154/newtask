package logic;
import java.util.Scanner;
public class Path{
  public static int numberOfPaths(int m, int n) {
        int [] []count=new int[m][n];
        for(int i=0;i<m;i++){
            count[i][0]=1;
        }
        for(int j=0;j<n;j++){
            count[0][j]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                count[i][j]=count[i-1][j]+count[i][j-1];
            }
        }
        return count[m-1][n-1];
        
    }
  public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of rows:");
     int row=sc.nextInt();
     System.out.println("Enter the no.of col:");
     int col=sc.nextInt();
    /* char [] [] mat=new char[row][col];
     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
           mat[i][j]=sc.next().charAt(0);
        }
     }
     System.out.println("matrix:");
     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(mat[i][j]+"\t");
        }
         System.out.println();
     }*/
     System.out.println("no of paths:"+numberOfPaths(row,col));   
  }
} 

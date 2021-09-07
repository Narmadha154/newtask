package logic;
import java.util.Scanner;
public class SpiralPrinting{
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no.of rows:");
      int row=sc.nextInt();
      System.out.println("Enter the no.of cols:");
      int col=sc.nextInt();
      System.out.println("Enter the no:");
      int num=sc.nextInt();
      int [] [] mat=new int[row][col];
      int top=0,down=row-1;
      int left=0,right=col-1;
      int p=0;
      while(true){
        if(top%2==0){
           p=num;
           num--;
        }
        else{
           p=num;
           num--;
        }
        for(int i=left;i<=right;i++){
            mat[top][i]=p;
        }
        top++;
        if(top>down||left>right){
            break;
        }
        for(int i=top;i<=down;i++){
            mat[i][right]=p;
        }
        right--;
        if(top>down||left>right){
            break;
        }
        for(int i=right;i>=left;i--){
            mat[down][i]=p;
        }
        down--;
        if(top>down||left>right){
            break;
        }
        for(int i=down;i>=top;i--){
            mat[i][left]=p;
        }
        left++;
        if(top>down||left>right){
            break;
        }
     }
     for(int i=0;i<row;i++){
         for(int j=0;j<col;j++){
             System.out.print(mat[i][j]+"\t");
         }
         System.out.println();
     }
   }
 }
         











             
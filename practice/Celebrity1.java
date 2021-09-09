package logic;
import java.util.Scanner;
public class Celebrity1{ 
  public static int knows(int M[][],int a,int b){
    return M[a][b];
  }
  public static int celebrity(int M[][],int n){
    int [] indegree=new int[n];
    int [] outdegree=new int[n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
         int x=knows(M,i,j);
         outdegree[i]+=x;
         indegree[j]+=x;
      }
    }
    for(int i=0;i<n;i++){
       if(indegree[i]==n-1&&outdegree[i]==0){
          return i;
        }
    }
    return -1;
   }
  public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size:");
       int n=sc.nextInt();
       int [][]M=new int[n][n];
       System.out.println("Enter the matrix elements:");
       for(int i=0;i<n;i++){
    	    for(int j=0;j<n;j++){
    	       M[i][j]=sc.nextInt();
    	    }
       }
       System.out.println("matrix elements:");
       for(int i=0;i<n;i++){
    	    for(int j=0;j<n;j++){
    	       System.out.print( M[i][j]);
    	    }
    	     System.out.println();
       }
       System.out.println(celebrity(M,n));
     }
   }

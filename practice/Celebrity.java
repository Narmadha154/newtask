package logic;
import java.util.Scanner;
public class Celebrity{ 
  public static int celebrity(int M[][], int n,int m)
    {
        int [] arr=new int[n+m];
    	for(int i=0;i<n;i++){
    	       int k=i;
    	    for(int j=0;j<m;j++){
    	        if(M[i][j]==1){
    	            arr[k++]=j;
    	            System.out.println(j);
    	             System.out.print("*"+arr[k]);
    	        }
    	    }
    	}
    	for(int i=0;i<k;i++){
    	    System.out.println(arr[k]);
    	}
    	for(int i=0;i<k-1;i++){
    	    if(arr[k]==arr[k+1]){
    	        return arr[k];
    	    }
    	}
      return -1;
    }
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size:");
       int n=sc.nextInt();
       System.out.println("Enter the size:");
       int m=sc.nextInt();
       int [][]M=new int[n][m];
       System.out.println("Enter the matrix elements:");
       for(int i=0;i<n;i++){
    	    for(int j=0;j<m;j++){
    	       M[i][j]=sc.nextInt();
    	    }
       }
       System.out.println("matrix elements:");
       for(int i=0;i<n;i++){
    	    for(int j=0;j<m;j++){
    	       System.out.print( M[i][j]);
    	    }
    	     System.out.println();
       }
       System.out.println(celebrity(M,n,m));
     }
   }

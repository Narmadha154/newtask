
package logic;
import java.util.Scanner;
public class FamilyTree{
 public static void main(String [] args){ 
   String [][] fachi={{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the father name:");
   String str=sc.next();
   String [] child=new String[fachi.length];
   int count=0;
   int k=0;
    for(int i=0;i<fachi.length;i++){
        if(fachi[i][1].equals(str)){
           child[k]=fachi[i][0];
           System.out.println("child is "+child[k]);
           k++;
         }
      }
     for(int i=0;i<fachi.length;i++){
       for(int m=child.length-1;m>=0;m--){
        if(fachi[i][1].equals(child[m])){
           count++;
         }
       }
    }
     System.out.println("No.of grandchildren"+ count);
  }
}
         

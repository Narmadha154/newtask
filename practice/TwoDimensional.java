
import java.util.*;
public class TwoDimensional{
 public static void main(String [] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the string:");
   String str=sc.next();
   int length=str.length();
   int k=0;
   int row=(int) Math.ceil(Math.sqrt(length));
   int col=(int) Math.ceil(Math.sqrt(length));
   System.out.println(row);
   System.out.println(col);
   char ch [][]=new char[row][col];
   for(int i=0;i<row;i++){
     for(int j=0;j<col;j++){
         ch[i][j]=str.charAt(k);
         k++;
       if(k==(length)){
         ch[i][j+1]=' ';
         break;
        }
     }
   }
   System.out.println("char array:");
   for(int i=0;i<row;i++){
     for(int j=0;j<col;j++){
        System.out.print(ch[i][j]);
     }
     System.out.println();
   } 
   System.out.println("Enter the substring:");
   String subStr=sc.next();
   char [] subChar=subStr.toCharArray();
   int count=0;
   int m=0;
   for(int i=0;i<row;i++){
      for(int j=0;j<subStr.length();j++){
        if(ch[i][j]==subChar[m]&&ch[i][j+1]==subChar[m+1]&&ch[i][j+2]==subChar[m+2]){
           count++;
           System.out.println("start index: <"+i+","+j+">");
           System.out.println("end index: <"+i+","+(j+2)+">");
         }
         /*else{
          System.out.println("not found");
         }*/
      }
      if(count==1){
         break;
      }
    }
     for(int i=0;i<subStr.length();i++){
      for(int j=0;j<row;j++){
        if(ch[i][j]==subChar[m]&&ch[i+1][j]==subChar[m+1]&&ch[i+2][j]==subChar[m+2]){
           count++;
           System.out.println("start index: <"+i+","+j+">");
           System.out.println("end index: <"+(i+2)+","+j+">");
         }
         /*else{
          System.out.println("not found");
         }*/
      }
      if(count==1){
        break;
      }
    }
 }
}

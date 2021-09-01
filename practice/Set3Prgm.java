

import java.util.Scanner;
public class Set3Prgm{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string:");
    String str=sc.next();
    char temp;
    int res=0;
    for(int i=0;i<str.length();i++){
    
  /*  if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
       temp=str.charAt(i-1);

   while(i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
     res=res*10+(str.charAt(i)-48);
     i++;
  }
 for(int k=0;k<res;k++){
    System.out.print(temp);
 }
}
 
    res=0;
   }*/ 
    while(i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
     res=res*10+(str.charAt(i)-48);
     i++;
  }
  for(int k=0;k<res;k++){
    System.out.print(str.charAt(i));
 }
 res=0;
}
}
}


 /* if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
       int j=i+1;
       while(str.charAt(j)>=48&&str.charAt(j)<=57&&j<str.length()){
         b=(b*10)+((int)str.charAt(j)-48);
         j++;
         }
       while(b!=0){
         System.out.print(str.charAt(i));
         b--;
       }
     }
    }*/



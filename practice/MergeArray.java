

package logic;
import java.util.*;
public class MergeArray{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array1");
    int size1=sc.nextInt();
    int [] array1=new int[size1];
    System.out.println("Enter the elements of array1:");
    for(int i=0;i<size1;i++){
        array1[i]=sc.nextInt();
    }
    System.out.println("Enter the size of array2");
    int size2=sc.nextInt();
    int [] array2=new int[size2];
    System.out.println("Enter the elements of array2:");
    for(int i=0;i<size2;i++){
        array2[i]=sc.nextInt();
    }
    int count=0;
    int j=0;
    int [] mergedArr=new int[size1+size2];
    for(int i=0;i<size1;i++){
        mergedArr[j]=array1[i];
        j++;
        count++;
     }
    for(int i=0;i<size2;i++){
       mergedArr[count]=array2[i];
       count++;  
    }
    int newSize=size1+size2;
    System.out.println("merged array is:");
    for(int i=0;i<newSize;i++){
       System.out.println(mergedArr[i]);
    }
    int temp=0;
    for(int i=1;i<newSize;i++){
       for(j=0;j<newSize-i;j++){
          if(mergedArr[j]>mergedArr[j+1]){
             temp=mergedArr[j];
             mergedArr[j]=mergedArr[j+1];
             mergedArr[j+1]=temp;
           }
        }
     }
    int newCount=0;
    for(int i=0;i<newSize-1;i++){
      if(mergedArr[i]==mergedArr[i+1]){
          newCount++;
       }
    }
    int k=0;
    for(int i=0;i<newSize-1;i++){
      if(mergedArr[i]!=mergedArr[i+1]){
          mergedArr[k++]=mergedArr[i];
        }
   }
   mergedArr[k++]=mergedArr[newSize-1];
   k=newSize-newCount;
   System.out.println("merged array is:");
    for(int i=0;i<k;i++){
       System.out.println(mergedArr[i]);
    }
  }
 } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  

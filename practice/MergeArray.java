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
   /* int count1=0,count2=0;
    for(int i=0;i<size1;i++){
        if(array1[i]==array2[i]){
           count1++;
        }
        else{
           count2+=2;
        }
    }*/
    /*System.out.println(count1+" "+count2);
    int j=0;
    int [] mergedArr=new int[(count1+count2)];
    for(int i=0;i<(count1+count2);i++){
       if(array1[i]<array2[i]){
            mergedArr[j]=array1[i];
            mergedArr[j+1]=array2[i];
            j+=2;
        }
     }
     System.out.println("merged array:");
     for(int i=0;i<(count1+count2);i++){
         System.out.println(mergedArr[i]);
     }*/
    List<Integer> list=new ArrayList<>();
    for(int i=0;i<(size2+1);i++){
        if(list.contains(array1[i])&&list.contains(array2[i])){
             list.add(array1[i]);
        }
        else if(array1[i]>array2[i]){
           list.add(array1[i]);
        }
    }
    System.out.println(list);
   }
  }  
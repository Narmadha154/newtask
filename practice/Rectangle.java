package logic;
import java.util.Scanner;
public class Rectangle{
  public static boolean checkOverlap(int x1,int y1,int x2,int y2,int a1,int b1,int a2,int b2){
    if(x1==x2||y1==y2||a1==a2||b1==b2){
       return false;
     }
     if(x1<=a1&&y1>=b1&&a2>=x2&&b2>=y2){
          return true;
     }
   return false;
 }
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the x1 point for rec1:");
    int x1=sc.nextInt();
    System.out.println("Enter the y1 point for rec1:");
    int y1=sc.nextInt();
    System.out.println("Enter the x2 point for rec1:");
    int x2=sc.nextInt();
    System.out.println("Enter the y2 point for rec1:");
    int y2=sc.nextInt();
    System.out.println("Enter the x1 point for rec2:");
    int a1=sc.nextInt();
    System.out.println("Enter the y1 point for rec2:");
    int b1=sc.nextInt();
    System.out.println("Enter the x2 point for rec2:");
    int a2=sc.nextInt();
    System.out.println("Enter the y2 point for rec2:");
    int b2=sc.nextInt();
    if(checkOverlap(x1,y1,x2,y2,a1,b1,a2,b2)){
        System.out.println("Two rectangles overlap");
    }
    else{
        System.out.println("Two rectangles not overlap");
    }
  }
}


package logic;
public class MaxMin{
  public static void main(String [] args){
   int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are :" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("sorted array is:" +Arrays.toString(array));
        int [] maxMinSortedArray=new int [n];
        for(int i=0,max=n-1,min=0;i<n;i+=2,min++,max--){
            maxMinSortedArray[i]=array[max];
            if(i+1<maxMinSortedArray.length){
                maxMinSortedArray[i+1]=array[min];
            }
        }
        System.out.println("maximum minimum sorted array is: " + Arrays.toString(maxMinSortedArray));
    }
} 																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							

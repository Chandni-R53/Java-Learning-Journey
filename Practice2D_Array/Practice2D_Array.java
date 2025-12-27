package Practice2D_Array;

import java.util.Scanner;
public class Practice2D_Array {
   public static void main(String[] args) {
   int[][] arr=ArrayUtility_2D.get2DArr();
   boolean isFound=search(arr);
   if(isFound)
   {System.out.println("The element is found");}
   else
   {System.out.println("The element is not found");}
   sumAndAvg(arr);
   
}   
//searching in 2D array
public static boolean search(int[][] a){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the element to search in array:");
   int key=sc.nextInt();
   for(int i=0;i<a.length;i++){
    for(int j=0;j<a[i].length;j++){
        if(a[i][j]==key)
        {return true;}
    }
   }
   return false;
}
//sum and avg of all elements in 2D array
public static void sumAndAvg(int[][] a){
    long sum=0;
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            sum+=a[i][j];
        }
    }
    System.out.println("The sum of all elements is: "+sum);
    int row=a.length;
    int column=a[0].length;
    double avg=(double)sum/(row*column);
    System.out.println("The avg of all elements is: "+avg);
}
}



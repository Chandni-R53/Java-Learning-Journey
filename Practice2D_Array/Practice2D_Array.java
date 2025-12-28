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
   int Sum=sumOfdiagonals(arr);
   System.out.println("The sum of two diagonal elements is:"+Sum);
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
//sum of two diagonal elements
public static int sumOfdiagonals(int[][] a){
    int left=sumOfLeft(a);
    int right=sumOfRight(a);
    int sum=left+right;
    int ind=a.length/2;
    if(a.length%2!=0){
        sum-=a[ind][ind];
    }
    return sum;
}
public static int sumOfLeft(int[][] a){
    int sum=0;
    for(int i=0;i<a.length;i++){
        sum+=a[i][i];
    }
    return sum;
}
public static int sumOfRight(int[][] a){
    int sum=0;
    int i=0;
    while(i<a.length){
        int j=a.length-1-i;
        sum+=a[i][j];
        i++;
    }
    return sum;
}
}



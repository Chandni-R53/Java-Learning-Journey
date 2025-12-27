package ArrayUtility_2D;
import java.util.Scanner;
public class ArrayUtility_2D{
    
//taking 2D array input from user
public static int[][] get2DArr(){
Scanner sc=new Scanner(System .in);
System.out.print("Enter the no. of rows and columns for 2D array:");
int row=sc.nextInt();
int column=sc.nextInt();
int[][] a=new int[row][column];
System.out.println("Enter the elements of 2D array:");
 for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
            a[i][j]=sc.nextInt();
        }
    }
    return a;
}
//print 2D array
public static void printArr(int[][] a,int r,int c){
     for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }

}


}





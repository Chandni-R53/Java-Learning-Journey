package Array;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[] arr=new int[5];
        // int[] arr={12,4,34,22,10};
        arr[0]=12;
        arr[1]=4;
        arr[2]=34;
        arr[3]=22;
        arr[4]=10;
        //array traversal
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of array:");
        int length=sc.nextInt();
        int[] a=new int[length];
        System.out.print("Enter the elements of array:");
        for(int i=0;i<length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Elements in the array:");
        for(int i=0;i<length;i++){
            System.out.println(a[i]);
        }
        //searching in array
        System.out.print("Enter the element to search in array:");
        int key=sc.nextInt();
        boolean found=false;
        for(int i=0;i<length;i++){
            if(a[i]==key)
            {System.out.println("Element found in array at index "+i);
                found=true;
                break;
            }
        }
        if(!found)
        {System.out.println("Element is not found in array");}
        
        //string array
        String[] strArr={"Good","Nice","Wonderful","Excellent"};
        System.out.println(strArr.length);

        //2D array
        int[][] Arr=new int[2][3];
        Arr[0][0]=23;
        Arr[1][2]=11;

        int[][] myArr={{1,2,3},{4,2,5},{6,2,5}};
        for(int i=0;i<myArr.length;i++){
            for(int j=0;j<myArr[i].length;j++){
                System.out.print(myArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}



import java.util.Scanner;
public class Practice3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,3,5,7,9,11};
        int[] a={2,4,6,8};
        int Sum=sum(arr);
        System.out.println("Sum of all elements in array: "+Sum);
        System.out.println("Avg of all elements in array: "+avg(arr,Sum));
        System.out.println("Max element in array: "+max(arr));
        System.out.println("Min element in array: "+min(arr));
        int[] newArr=revArr(arr);
        System.out.print("Reversed array: ");
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
        System.out.print("\nEnter an element to find its occurences:");
        int key=sc.nextInt();
        System.out.println(" The occureneces of the element in array: "+occur(arr,key));
        boolean isInc=isIncrease(arr);
        boolean isDec=isDecrease(arr);
        if(isInc||isDec)
        {System.out.println("The array is sorted");}
        else
        { System.out.println("The array is not sorted");}
        System.out.print("The new array after deleting "+key+" from old array: ");
        newArr=newArray(arr,key);
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
        boolean isPalin=isPalindrome(arr);
        if(isPalin)
        {System.out.println("\nThe array is palindrome");}
        else
        {System.out.println("\nThe array is not palindrome");}
        newArr=mergedArray(arr,a);
        System.out.print("The new array after merging: ");
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
    //finding sum of all elements in array
    public static int sum(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    //finding avg of all elements in array
    public static int avg(int[] a,int sum){
        int Avg=sum/a.length;
         return Avg;
    }
    //finding max element in array
     public static int max(int[] a){
        if(a.length==0){
            return Integer.MIN_VALUE;
        }
        int mx=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>mx){
               mx=a[i];
           }
        }
        return mx;
    }
    //finding min element in array
     public static int min(int[] a){
        int mn=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<mn){
               mn=a[i];
           }
        }
        return mn;
    }
    //reverse an array
    public static int[] revArr(int[] a){
        int i=0;
        int j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return a; 
    }
    //finding occureneces of an element in array
    public static int occur(int[] a,int key){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                count++;
            }
        }
        return count;
    }
    //to check if array is sorted or not
    public static boolean isIncrease(int[] a){
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isDecrease(int[] a){
        for(int i=1;i<a.length;i++){
            if(a[i]>a[i-1]){
                return false;
            }
        }
        return true;
    }
    //to delete specific number from array and return new array
     public static int[] newArray(int[] a,int key){
        int occ=occur(a,key);
        int size=a.length-occ;
        int[] newArr=new int[size];
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=key){
                newArr[j]=a[i];
                j++;
            }
        }
        return newArr;
     }
     //array is palindrome or not
     public static boolean isPalindrome(int[] a){
        int j=a.length-1;
        int i=0;
        while(i<j){
            if(a[i]!=a[j])
              {return false;}
     }
        return true;
    }
    //merge two sorted arrays
    public static int[] mergedArray(int[] a1,int[] a2){
        int size=a1.length+a2.length;
        int[] a3=new int[size];
        int i=0,j=0,k=0;
        while(i<a1.length||j<a2.length){
            if(j==a2.length||(i!=a1.length&&a1[i]<a2[j]))
            {a3[k]=a1[i];
                i++;
                k++;
            }
            else
            {a3[k]=a2[j];
                j++;
                k++;
            }
        }
        return a3;
    }

}
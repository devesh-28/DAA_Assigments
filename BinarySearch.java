import java.util.Scanner;

public class BinarySearch {
    static int Search(int arr[], int left, int right, int x){

        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]<x)
            {
                left=mid+1;
            }
               else
            {
                right=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the number of elements in Ascending order");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println("The number to be found");
        int num=sc.nextInt();
        int output;
        int n= arr.length;
        output=Search(arr,0,n-1,num);
        if(output==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("element found at position "+" "+output);
        }
    }
}

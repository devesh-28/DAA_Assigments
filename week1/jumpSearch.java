import java.lang.annotation.ElementType;
import java.util.Scanner;

public class jumpSearch {
    public static int  Search(int arr[], int x){
        int start=0;
        int size=arr.length;
        int end=(int)(Math.sqrt(size));
        while(arr[end] <=x && end < size)
        {
            start=end;
            end+=(int)(Math.sqrt(size));
            if(end>size-1)
            {
                end=size;
            }
        }
        for (int i=start; i<end;i++)
        {
            if (arr[i]==x)
            {
                return i;
            }
        }
           return -1;
    }

    public static void main(String[] args) {
        int []arr=new int[20];
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
        output=Search(arr,num);
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



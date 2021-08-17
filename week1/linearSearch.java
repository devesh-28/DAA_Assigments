import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class linearSearch {
    public static void search(int arr[], int n){
        int temp=-1;
    for(int i=0;i<arr.length;i++) {
        if (arr[i] == n) {
            System.out.println("element found at position" + "  "+i+1);
            temp = 0;
            break;
        }
    }
        if(temp==-1)
        {
            System.out.println("element not found");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Entre the elements of array");
        for (int i=0; i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Entre the element to be found ");
        int num= sc.nextInt();
        search(arr,num );

    }
}

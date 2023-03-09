package GFG.Array;

import java.util.Scanner;

public class SearchAElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println("what element you wanna to search in array");
        int search=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==search)
            System.out.println("found at index "+i);
        }
    }
}

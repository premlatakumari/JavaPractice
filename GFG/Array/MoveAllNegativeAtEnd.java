package GFG.Array;
import java.util.*;
import coding_ninja.Array.ArrayList;


public class MoveAllNegativeAtEnd {
    public static void main(String[] args) {
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        int n=arr.length;
        int idx=0;
        int ans[]=new int[n];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0)
            {
                ans[idx++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0)
            {
                ans[idx++]=arr[i];
            }
        }
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}

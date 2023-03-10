package GFG.Array;

import java.util.ArrayList;

public class RightRotateByDElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int d=3;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=arr.length-d;i<arr.length;i++)
        {
            list.add(arr[i]);
        }
        for(int i=0;i<arr.length-d;i++) {
            list.add(arr[i]);
        }
        for(int i:list)
        {
            System.out.print(i+" ");
        }
    }
}

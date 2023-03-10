package GFG.Array;

import java.util.*;
public class LeftRoateByDelement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int d=3;
        ArrayList<Integer>list1=new ArrayList<>();
        for(int i=d;i<arr.length;i++)
        {
            list1.add(arr[i]);
        }
        for(int i=0;i<d;i++){
            list1.add(arr[i]);
        }
        for(int I:list1){
            System.out.print(I+" ");
        }
    }
}

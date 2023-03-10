package GFG.Array;

import java.util.ArrayList;

public class ShiftAllZeroAtEnd {
    public static void main(String[] args) {
        int arr[]={2,3,0,1,8,0,0,2,3,0};
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
            {
                list.add(arr[i]);
            }
        }
        for (int i=list.size();i<arr.length;i++)
        {
            list.add(0);
        }
        for(int i:list){
            System.out.print(i+" ");
        }
    }
}

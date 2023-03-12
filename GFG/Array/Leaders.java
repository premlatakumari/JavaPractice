package GFG.Array;

import java.util.ArrayList;

public class Leaders {
    public static void main(String[] args) {
        int arr[]={16,17,4,5,2};
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        int max=arr[n-1];
        list.add(max);
        for(int i=n-1;i>0;i--)
        {
            if(arr[i]>max){
                max=arr[i];
                list.add(max);
            }
        }

        System.out.println(list);
    }
}

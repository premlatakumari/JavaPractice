package GFG.Array;

import java.util.ArrayList;

public class Leaders {
    public static void main(String[] args) {
        int arr[]={16,17,4,5,2};
        ArrayList<Integer>list=new ArrayList<>();
        list.add(arr.length-1);
        for(int i=arr.length-1;i>0;i--)
        {
            int ans=arr[arr.length-1];
            if(arr[i-1]>ans)
            {
                ans=Math.max(ans,arr[i-1]);

            }
        }
        System.out.println(list);
    }
}

package GFG.Array;

import java.util.HashMap;

public class TwoSum1 {
    public static void main(String[] args) {
        int arr[]={2,7,11,15,7};
        int arr1[]=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        int target=9;
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(target-arr[i]))
            {
                System.out.println(map.get(target-arr[i]));
            }

        }
    }
}

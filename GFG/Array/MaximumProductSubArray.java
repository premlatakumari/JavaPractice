package GFG.Array;

import OOps.Kunal_khuswaha.StaticExample.Main;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int arr[]={-10,-20,-30,0,70,-80,-20};
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int mul=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                mul*=arr[j];
                ans= Math.max(ans,mul);
            }

        }
        System.out.println(ans);

    }
}

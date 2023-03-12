package GFG.Array;

public class LargestSubArrayWith0Sum {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        int max=0;
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                sum+=arr[j];
                if(sum==0)
                {
                    //System.out.println(i+" " + j);
                   max=Math.max(max,j-i+1);

                }
            }

        }
        System.out.println(max);
    }
}

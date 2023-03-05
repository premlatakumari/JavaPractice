package Kunal_Khushwaha_Problem.Array;

public class RunningSumof1dArray {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};

        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum+=nums[j];
            }
            ans[i]=sum;
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }


    }

}

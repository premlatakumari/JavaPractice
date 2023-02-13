package GFG.Array;

public class MaximumCosucativeOne {
    public static void main(String[] args) {
        int arr[]={1,0,0,1,1,1,1,0,0,1,1};
        int res=0;
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count=0;
            }
            else {
                count++;
                res=Math.max(res,count);
            }
        }
        System.out.println(res);
    }
}

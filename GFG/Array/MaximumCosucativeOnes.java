package GFG.Array;

public class MaximumCosucativeOnes {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,1,0,1};
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
        int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]==1){
                    count++;
                }
                else{
                    break;
                }
            }
            res=Math.max(res,count);
        }
        System.out.println(res);
    }
}

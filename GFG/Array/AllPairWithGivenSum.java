package GFG.Array;

public class AllPairWithGivenSum {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,7};
        int brr[]={5,6,3,4,8};
        int sum=9;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<brr.length;j++){
                if(arr[i]+brr[j]==sum)
                {
                    System.out.print(arr[i]+" "+brr[j]);
                }
            }
            System.out.println();
        }
    }
}

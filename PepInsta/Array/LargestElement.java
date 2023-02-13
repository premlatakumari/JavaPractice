package PepInsta.Array;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,67,55};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}

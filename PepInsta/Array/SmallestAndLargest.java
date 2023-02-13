package PepInsta.Array;

public class SmallestAndLargest {
    public static void main(String[] args) {
        int arr[]={34,1,2,3,4,4,5,6,7,77,5};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max +" "+min);
    }
}

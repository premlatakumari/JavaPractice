package Array;

public class Reversee {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;


        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

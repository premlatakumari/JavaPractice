package GFG.Array;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=4;

        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while (low<=high)
        {
            if(arr[mid]==k){
                System.out.println("found my element at index "+ mid);
                break;
            } else if (arr[mid]>k) {
                high=mid-1;

            }
            else {
                low=mid+1;
            }
            mid=(low+high)/2;
        }
    }
}

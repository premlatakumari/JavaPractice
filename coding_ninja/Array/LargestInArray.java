package coding_ninja.Array;

public class LargestInArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,56,7,8};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}

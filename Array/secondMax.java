package Array;

public class secondMax {
    public static void main(String args[]){
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int arr[]={1,2,3,4,56,33};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]<max){
                smax=arr[i];
            }
        }
        System.out.println(smax);
    }
}

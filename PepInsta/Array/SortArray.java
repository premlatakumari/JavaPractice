package PepInsta.Array;

public class SortArray {
    public static void main(String[] args) {
        int arr[]={10, 40, 20, 30};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}

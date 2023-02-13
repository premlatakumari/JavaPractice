package PepInsta.Array;

public class SortAceDec {
    public static void main(String[] args) {
        int arr[]={3, 2, 4, 1, 10, 30, 40, 20};
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        for(int i=n/2;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        for(int I:arr){
            System.out.print(I+" ");
        }
    }
}

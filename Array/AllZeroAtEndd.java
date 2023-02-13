package Array;

public class AllZeroAtEndd {
//    public static int swap(int i, int j){
//        int temp=i;
//        i=j;
//        j=temp;
//       return i;
//    }
    public static void main(String[] args) {
        int arr[]={1,2,0,3,0,4,0,0,0,5};
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                for(int j=i+1;j<n;j++){
                    if(arr[i]!=0){
//                        swap(arr[i],arr[j]);
                        int temp=arr[j];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

package Array;

import java.util.ArrayList;

public class AllZeroAtEnd {
    public static void main(String[] args) {
        int arr[]={1,2,0,3,0,4,0,0,0,5};
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                list.add(arr[i]);
            }
        }
        for(int i=0;i<count;i++){
            list.add(0);
        }
        for(int i:list){
            System.out.print(i+" ");
        }
    }
}

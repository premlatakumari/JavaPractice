package GFG.Array;

import java.util.ArrayList;

public class LeadersInArrayy {
    public static void main(String[] args) {
        int arr[]={7,10,4,10,6,5,2};
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        int max=arr[n-1];
        list.add(max);
        for(int i=n-2;i>0;i--){
            if(arr[i]>max){

                        max=arr[i];
                list.add(max);

            }

        }
        for(int i:list){
            System.out.print(i+" ");
        }
    }
}

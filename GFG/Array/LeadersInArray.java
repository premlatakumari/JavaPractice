package GFG;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};;
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            boolean flag=false;
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            list.add(arr[i]);
        }
        for(int i:list){
            System.out.print(i+" ");
        }
    }
}

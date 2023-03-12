package GFG.Array;

import coding_ninja.Array.ArrayList;

public class SortArraycontaining012 {
    public static void main(String[] args) {
        int arr[]={1,0,2,1,1,0,2,2,0};

        int zcount=0;
        int ocount=0;
        int tcount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                zcount++;
            else if(arr[i]==1)
                ocount++;
            else
                tcount++;
        }
        int idx=0;
        for(int i=0;i<zcount;i++){
            arr[idx++]=0;
        }
        for(int i=0;i<ocount;i++){
            arr[idx++]=1;
        }
        for(int i=0;i<tcount;i++){
            arr[idx++]=2;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

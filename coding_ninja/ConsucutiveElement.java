package coding_ninja;

import java.util.ArrayList;

public class ConsucutiveElement {
    public static void main(String[] args) {
        int arr[]={10,10,20,20,20,30,40,10};
        ArrayList<Integer>list=new ArrayList<>();

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                list.add(arr[i]);
            }
        }
        if(arr[arr.length-1]!=arr[arr.length-2]){
            list.add(arr[arr.length-1]);
        }
        for(int i:list){
            System.out.print(i+" ");
        }
    }
}

package GFG.Array;

import java.util.HashMap;

public class FindFrequencyOfElement {
    public static void main(String[] args) {
        int arr[]={10,10,20,20,20,20,30,30};
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int i:map.keySet()){
            System.out.println(i+"-->"+map.get(i));
        }

    }
}

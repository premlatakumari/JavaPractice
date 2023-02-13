package Array;
import java.util.*;
public class Distinctt {
    public static void main(String args[]){
        int arr[]={12,12,34,3,12,34,4,3,1};
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
            System.out.print(i+" ");
        }
    }
}

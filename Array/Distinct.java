package Array;
import java.util.*;
public class Distinct {
    public static void main(String args[]){
        int arr[]={12,12,34,3,12,34,4,3,1};
        int n=arr.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int i:set){
            System.out.print(i+" ");
        }
    }
}

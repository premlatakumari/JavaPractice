package PepInsta.Array;
import java.util.HashMap;
public class SortingElementByFrequecny {
    public static void main(String[] args) {
        int arr[]={1,2,2,33,11,1,2,33,11,1,11};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
    }
}

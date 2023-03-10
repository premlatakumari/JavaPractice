package GFG.Array;

import java.util.HashMap;

public class FirstElementThatOccourKTimes {
    public static void main(String[] args) {
        int arr[]={1,7,4,3,4,8,7};
        int k=2;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            map.put(arr[i],map.get(arr[i])+1);
            if(k == map.get(arr[i]))
            {
                System.out.println(arr[i]);
            }
            else
                map.put(arr[i],1);
        }
        System.out.println(map);
        for(int i:map.keySet())
        {
            if(map.get(i)==k)
            {
                System.out.println(i);
                break;
            }

        }
    }
}

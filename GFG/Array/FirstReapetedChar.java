package GFG.Array;

import java.util.HashMap;

public class FirstReapetedChar {
    public static void main(String[] args) {
        String s="Geeksforgeeks";
        HashMap<Character,Integer>map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
                if(map.get(s.charAt(i))==2)
                {
                    System.out.println(s.charAt(i));
                    break;
                }
            }
            else {
                map.put(s.charAt(i),1);
            }
        }
//        for(int i:map.keySet())
//        {
//            if(map.get(i)==2)
//            {
//                System.out.println(i);
//            }
//        }
        //System.out.println(map);
    }
}

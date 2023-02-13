package coding_ninja.Array;
import java.util.*;
import java.util.Collection;
import java.util.HashSet;

public class ArrayList {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(3);
        set.remove(set.size());
        for(int i:set){
            System.out.println(i);
        }
//        Collection.sort(set);
//        System.out.println(set.get(2));
    }
}

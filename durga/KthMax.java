package durga;

import java.util.TreeSet;

public class KthMax {
    public static void main(String[] args) {
       int arr[]={1,2,33,233,2343,1,2,3};
       int k=4;
        TreeSet<Integer>set=new TreeSet<>();
        for(int i:arr){
            set.add(i);
        }
        //System.out.println(set.size()-k+1);
        int idx=1;
        for(int i:set){
            if(idx==k){
                System.out.println(i);
            }
            if(idx++==set.size()-k+1){  //6-4+1
                System.out.println(i);
            }
        }
        System.out.println(set);
    }
}

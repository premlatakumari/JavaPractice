package PepInsta.working_number;

public class ReplaceZerowithONee {
    public static void main(String[] args) {
        int n=1202011;
        String str=Integer.toString(n);
        String ans=str.replaceAll("0", "1");
        System.out.println(ans);
    }
}

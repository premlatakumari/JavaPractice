package PepInsta.working_number;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n=10;
        //int ans=0;
        String ans="";
        while (n>0)
        {
            int r=n%2;
            ans=r+ans;
            n=n/2;
        }
        System.out.println(ans);
    }
}

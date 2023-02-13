package PepInsta.Basic_coding;

public class ReplaceZeroWithOne {
    public static void main(String[] args) {
        int n=706120678;
        int ans=0;
        int mul=1;
        while (n>0)
        {
            int r=n%10;
            if(r==0)
            {
                r=1;
            }
            ans=ans+r*mul;
            mul=mul*10;
            n=n/10;
        }
        System.out.println(ans);
    }
}

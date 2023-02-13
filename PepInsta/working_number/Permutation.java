package PepInsta.working_number;

public class Permutation {
    public static int fact(int n)
    {
        int ans=1;
        for(int i=1;i<=n;i++)
        {
            ans*=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        int r=9;
        int ans=0;
        int diff=n-r;
        ans=fact(n)/fact(diff);
        System.out.println(ans);

    }
}

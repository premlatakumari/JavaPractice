package PepInsta.Basic_coding;
public class StrongNumber {
    public static int fact(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int num=145;
        int n=num;
        int ans=0;
        while (n>0){
            int r=n%10;
            ans+=fact(r);
            n=n/10;
        }
      if(ans==num)  {
          System.out.println("Strong number");
      }
      else {
          System.out.println("not a strong number");
      }
    }
}

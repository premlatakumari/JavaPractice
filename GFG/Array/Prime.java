package GFG.Array;

public class Prime {
    public static boolean checkPrime(int n){
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n=13;
        for(int i=2;i<=n;i++){
            if(checkPrime(i)==true)
            {
                System.out.println(i);
            }

        }
    }
}

package PepInsta.working_number;
public class NumberAsSumOfTwoPrimeNumber {
    public static  boolean isPrime(int num)
    {
        int count=0;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0)
            count++;

        }
        if(count==0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        int n=14;
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i)==true)
            {
                //System.out.println(i);
                int ans=n-i;
                if(isPrime(ans)==true) {

                    System.out.println(i + ", " + ans);
                }
            }
        }
    }
}





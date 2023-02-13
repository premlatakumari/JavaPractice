package PepInsta.working_number;

public class PrimeNumberBetweenARange {
    public static boolean isPrime(int n)
    {
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                count++;
        }
        if(count==0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        for(int i=1;i<=100;i++)
        {
            if(isPrime(i)==true)
                System.out.println(i);
        }

    }
}

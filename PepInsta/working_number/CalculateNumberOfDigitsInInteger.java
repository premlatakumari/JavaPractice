package PepInsta.working_number;

public class CalculateNumberOfDigitsInInteger {
    public static void main(String[] args) {
        int n=1233323451;
        int count=0;
        while (n>0)
        {
            count++;
            n=n/10;

        }
        System.out.println(count);
    }
}

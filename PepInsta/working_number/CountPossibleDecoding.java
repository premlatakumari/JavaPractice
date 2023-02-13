package PepInsta.working_number;

public class CountPossibleDecoding {
    public static void main(String[] args) {
        int n=131;
        int count=0;
        int r=0;
        while (n>0)
        {
                r = n % 10; //1 //3 //1
                count++;//1 //3
                n = n / 10;//13
                if (n <= 26 && n!=0) {
                    count++; //2
                    n=n/10; //1

                }

        }
        System.out.println(count);
    }
}

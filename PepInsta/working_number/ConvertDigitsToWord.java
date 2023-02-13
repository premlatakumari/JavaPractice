package PepInsta.working_number;

public class ConvertDigitsToWord {
    public static void main(String[] args) {
        int n=221;
        int count=0;
        while (n>0) {
            count++;
            n = n / 10;
        }
        if(count==4)
        {
            int r=n/1000;
            System.out.print(r+" thousand");
        }
        if(count==3)
        {
            int r=n/100;
            System.out.print(r+" Hundred");
        }
//        if(n==2)
//        {
//
//        }

    }
}

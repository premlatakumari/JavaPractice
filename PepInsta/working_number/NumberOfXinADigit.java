package PepInsta.working_number;

import java.util.Scanner;

public class NumberOfXinADigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("enter the digit you want to search");
        int x=sc.nextInt();
        int count=0;
        while(n>0)
        {
            int r=n%10;
            if(r==x)
            {
                count++;
            }
            n=n/10;

        }
        System.out.println(count);
    }
}

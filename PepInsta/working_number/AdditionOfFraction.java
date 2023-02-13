package PepInsta.working_number;

public class AdditionOfFraction {
    public static void main(String[] args) {
        int num1=4;
        int dem1=7;
        int num2=9;
        int dem2=7;
        int lcm=0;
        int ans=1;
        int min=Math.min(dem1,dem2);
        for(int i=min;i<dem2*dem1;i++)
        {
            if(i%dem1==0 && i%dem2==0)
            {
                lcm=i;
                break;
            }
        }
        ans=(num1*(lcm/dem1))+(num2*(lcm/dem2))/lcm;

        System.out.println( ans);

    }
}

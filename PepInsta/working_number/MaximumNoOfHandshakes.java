package PepInsta.working_number;

public class MaximumNoOfHandshakes {
    public static void main(String[] args) {
        int person=4;
        int ans=1;
        ans=person*ans*(person-1);
        System.out.println(ans);
    }
}

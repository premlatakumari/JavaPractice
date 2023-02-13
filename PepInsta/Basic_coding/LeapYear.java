package PepInsta.Basic_coding;

public class LeapYear {
    public static void main(String[] args) {
        int year=2340;
       if(year %400==0){
           System.out.println("Leap year");
       }
       else if(year%4==0 && year%100!=0){
           System.out.println("Leap year");
       }
       else{
           System.out.println("not a Leap year");
       }
    }
}

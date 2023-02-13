package PepInsta.working_number;

public class NumberOfDayInMonth {
    public static void main(String[] args) {
        int year=2018;
        int month=8;
        if(year%400==0 && year%4==0 && year%100!=0)
        {
            if(month==2)
            {
                System.out.println("29 days ");
            }

        }
        else if(month==2)
        {
            System.out.println("28 days");
        }
        else if(month==1 || month==3 || month==5 ||month==7 || month==8 ||month==10 || month==12){
            System.out.println(month+" "+ 31+ " days");
        }
        else{
            System.out.println("30 days");
        }
    }
}


package PepInsta.working_number;

public class Cordinate {
    public static void main(String[] args) {
        int x=9;
        int y=-90;
        if(x==0 && y==0)
        {
            System.out.println("at centre");
        }
        else if(x>0 && y>0)
        {
            System.out.println("quadrant-1");
        }
        else if (x<0 && y>0) {
            System.out.println("quadrant -2");
        }
        else if(x<0 && y<0)
        {
            System.out.println("quadrant-1");
        }
        else   {
            System.out.println("quadrant -2");
        }
    }
}

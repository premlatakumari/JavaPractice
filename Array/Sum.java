package Array;
import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int sum = scanner.nextInt();
        int i = 0 ;

        while(true){
            i=++i;

            int n = scanner.nextInt();
            if (n == 0){
                break;
            }
            sum = sum+n;
}
    }
}

package PepInsta.Basic_coding;
import java.util.*;

public class PrimeFactorOfANumber {
    public static List<Integer> findPrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }
        return primeFactors;
    }
    public static void main(String[] args) {
        int n=12;
        System.out.println(findPrimeFactors(n));
    }
}

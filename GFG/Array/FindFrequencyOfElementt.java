package GFG.Array;
//it will work only on sorted arrary;
public class FindFrequencyOfElementt {
    public static void main(String[] args) {
        int arr[]={10,10,10,20,20,30,30,30};
        int n=arr.length;
        int freq=1;
        int i=1;
        while (i<n) {
            while (i < n && arr[i] == arr[i - 1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i - 1] + " " + freq);
        }
            freq = 1;
            if (n == 1 || arr[n - 1] == arr[n - 2]) {
                System.out.println(arr[n - 1] + " " + 1);
        }
    }
}

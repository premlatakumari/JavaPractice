package GFG.Array;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,2};
        for(int i=0;i<arr.length;i++) {
            int leftsum = 0;
            int rightsum = 0;

            for (int j = 0; j<i; j++) {
                leftsum += arr[j];
            }
            for(int j=i+1;j<arr.length;j++)
            {
                rightsum+=arr[j];
            }
            if(leftsum==rightsum)
            {
                System.out.println(i+1);
            }
        }
    }
}

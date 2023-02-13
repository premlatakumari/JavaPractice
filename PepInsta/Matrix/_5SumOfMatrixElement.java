package PepInsta.Matrix;

public class _5SumOfMatrixElement {
    public static void main(String[] args) {
        int arr1[][]={{1,2,3},
                {4,5,6},
                {5,4,6}};

        int sum=0;
        for(int i=0;i<arr1.length;i++){
            for (int j=0;j<arr1[0].length;j++){
                sum+=arr1[i][j];
            }
        }
        System.out.println(sum);
    }
}

package PepInsta.Matrix;

public class _4AdditionOfMatrix {
    public static void main(String[] args) {
        int arr1[][]={{1,2,3},
                {4,5,6},
                {5,4,6}};
        int arr2[][]={{11,2,3},
                {4,50,6},
                {50,4,6}};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
            }
            System.out.println();
        }
    }


}

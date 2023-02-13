package PepInsta.Matrix;

public class _7MultiplicationOftwoMatrix {
    public static void main(String[] args) {
        int arr1[][]={{1,2,3},
                {4,5,6},
                {5,4,6}};
        int arr2[][]={{2,2,3},
                {4,5,6},
                {2,4,6}};
        int sum=0;
        int arr3[][]=new int[3][3];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[0].length;j++){
             arr3[0] [j] +=arr1[0][j]*arr2[i][0];
            }
        }
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[0].length;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}

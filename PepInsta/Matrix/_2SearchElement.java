package PepInsta.Matrix;

public class _2SearchElement {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                {4,5,6},
                {5,4,6}};
        int search=5;
        int sign=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==search){
                    System.out.println("found at index "+ i +", "+j);
                    sign=1;
                    break;
                }
            }
            if(sign==1){
                break;
            }
        }
        if(sign==0)
        {
            System.out.println("not found");
        }
    }
}

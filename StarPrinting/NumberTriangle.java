package StarPrinting;

public class NumberTriangle {
    public static void main(String[] args) {
        int n=6;
        int m=6;
        int ans=1;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(j<=i){
                    System.out.print(j +" ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5



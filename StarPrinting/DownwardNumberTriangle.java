package StarPrinting;

public class DownwardNumberTriangle {
    public static void main(String[] args) {
        int n=6;
        int m=6;
        int ans=1;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(j<=i){
                    System.out.print(i+" ");
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
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5

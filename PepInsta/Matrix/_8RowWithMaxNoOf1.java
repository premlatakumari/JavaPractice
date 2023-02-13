package PepInsta.Matrix;

public class _8RowWithMaxNoOf1 {
    public static void main(String[] args) {

        int arr1[][]={{1,2,3},
                {1,1,1},
                {5,4,6}};
       int ele=1;
       int ans=0;
       int max=-1;
       for(int i=0;i<arr1.length;i++){
           int count=0;
           for (int j = 0; j < arr1[0].length; j++) {
               if(arr1[i][j]==ele){
                   count++;
               }
           }
           if(count>max){
               max=count;
               ans=i;
           }
       }
        System.out.println(ans);
    }
}

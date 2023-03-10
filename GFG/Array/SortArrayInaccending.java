package GFG.Array;

public class SortArrayInaccending {
    public static void main(String[] args) {
        int arr[]={0,2,1,2,0};
        int zcount=0;
        int ocount=0;
        int tcount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
                zcount++;
            else if (arr[i]==1) {
                ocount++;
            }
            else {
                tcount++;
            }
        }
        for(int i=0;i<zcount;i++){
            arr[i]=0;
        }
        for(int i=zcount;i<zcount+ocount;i++){

            arr[i]=1;
        }
        for(int i=ocount+zcount;i<tcount+ocount+zcount;i++){
            arr[i]=2;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

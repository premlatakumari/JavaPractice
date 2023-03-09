package GFG.Array;

public class InsertElementInArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,3,5};
        int element=4;
        int index=2;
        int arr1[]=new int [arr.length+1];
        for(int i=arr.length-1;i>=index;i--)
        {
            arr1[i+1]=arr[i];

        }
        for(int i=0;i<index;i++)
        {
            arr1[i]=arr[i];
        }
        arr1[index]=element;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");

        }
    }
}

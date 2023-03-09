package GFG.Array;

public class sortedOrNot {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        boolean sign=true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                sign=false;
                break;
            }

        }
        if(sign==true)
        {
            System.out.println("sorted");
        }
        else {
            System.out.println("not sorted");
        }

    }
}
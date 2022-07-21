import java.util.*;
public class q3 {
    public static int kthSmallest(int[] arr,int k,int N){
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }

        }
        return arr[k-1];


    }
    public static void main(String[] args){
        int[] arr = new int[]{4,5,6,7,8,11,-9,3};
        System.out.println(kthSmallest(arr,3,8));


    }


}

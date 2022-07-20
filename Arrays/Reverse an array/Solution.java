import java.util.*;

class Solution {
    public static void findSum(int arr[],int N)
    {
        int start = 0;
        int end  = N-1;
        int temp;

        while (start< end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        for(int i = 0 ; i<N ; i++){
            System.out.print(" "+arr[i]+" ");

        }
        System.out.println();
    }
    static void printA(int A[],int N){
        for(int i = 0 ; i<N ; i++) {
            System.out.print(" " + A[i] + " ");
        }
    }


    public static void main (String args[]){
        int[] A = new int[]{-5,3,9,4,7};
        findSum(A,A.length);
        printA(A,A.length);



    }
}

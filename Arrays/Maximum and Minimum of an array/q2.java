public class q2 {
    public static void minMax(int[] arr){
        int min = arr[0] ;
        int max = arr[0] ;

        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]<=min)
                min = arr[i];
            if(arr[i]>=max)
                max = arr[i];
        }
        System.out.println("max = "+ max);
        System.out.println("min = "+ min);


    }
    public static void main(String args[]){
        int[] arr = new int[]{-4,2,3,4,7,8,9};
        minMax(arr);
    }




}

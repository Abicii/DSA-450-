class q4
{
    public static void sort012(int a[], int n)
    {
        int zero = 0 , one = 0 , two = 0;
        for (int i = 0 ; i < n ; i++){
            if (a[i] == 0){
                zero++;
            }
            if (a[i] == 1){
                one++;
            }
            if (a[i] == 2){
                two++;
            }


        }
        for (int i = 0 ; i < zero ; i++){
            a[i] = 0;
        }
        for (int i = zero ; i < one + zero ; i++){
            a[i] = 1;
        }
        for (int i = one + zero ; i < one + two + zero ; i++){
            a[i] = 2;
        }
//        for (int i = 0 ; i < n ; i++){
//            System.out.print(a[i] + " ");
//        }



    }
//    public static void main(String[] args) {
//        int[] arr = new int[]{0,1,2,2,1,0};
//        sort012(arr , 6);
//    }
}

package Sorting;

import java.util.Arrays;

public class MergeSort {

    public  static int[] mergeSort(int[] a , int L , int R){

        // Điều kiện dừng
        if (L == R){
            int[] singleE =  {a[L]};
            return  singleE;
        }

        // Trường hợp tổng quát

        // Chia ra
        int k = (L+R)/2;
        int[] a1 = mergeSort(a,L,k);
        int[] a2 = mergeSort(a,k+1,R);

        // Trộn vào

        int[] result = merge(a1,a2);
        return  result;
    }

    private static int[] merge(int[] a1, int[] a2) {
        int n  = a1.length + a2.length;
        int[] result = new int[n];
        int i = 0;  // index of array result
        int i1 = 0; // index of a1
        int i2 = 0; // index of a2
        while (i < n){
            // dùng để kiểm tra a1 và a2 không phải là mảng rỗng
            if (i1 < a1.length && i2 < a2.length){
                if (a1[i1] <= a2[i2]){ // tìm phần tử nhỏ lên vào đầu tiên
                    result[i] = a1[i1];
                    i++;
                    i1++;
                }else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }else{
                if (i1 < a1.length){
                    result[i] = a1[i1];
                    i++;
                    i1++;
                }else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        int[] a = {8,7,1,2,9,10,5,4};
        System.out.println(Arrays.toString(mergeSort(a,0,a.length - 1)));
    }


}

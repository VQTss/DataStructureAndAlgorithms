package Sorting;

import java.util.Arrays;

public class QuickSort {

    static  void quickSort(int []a , int L , int R){

        if (L >=  R) return;
        // b1 . Chọn khóa
        int key = a[(L+R)/2];
        // b2 . phân bố mảng theo khóa
        int k = partion(a,L ,R,key);
        // b3  chia đôi mảng -> lặp lại
        quickSort(a,L, k-1);
        quickSort(a,k,R);
    }

    static  int partion(int [] a , int L , int R , int key){
        int iL = L;
        int iR = R;
        while (iL <= iR){
            while (a[iL] < key) iL++;
            while (a[iR] > key) iR--;

            if (iL <= iR){
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                iR--;
                iL++;
            }
        }
        return iL;
    }




    public static void main(String[] args) {
        int [] a = {8,3,4,5,1,2,9};
        quickSort(a,0,a.length - 1);
        System.out.println(Arrays.toString(a));



    }
}

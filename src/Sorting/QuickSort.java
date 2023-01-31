package Sorting;

import java.util.Arrays;

public class QuickSort {

    static  void quickSort(int []a , int L , int R){

        // Điều kiện dừng
        if (L >=  R) return;
        // b1 . Chọn khóa
        int key = a[(L+R)/2];
        // b2 . phân bố mảng theo khóa
        int k = partion(a,L ,R,key); // tìm vị trí để tiếp tục chia mảng ra
        // b3  chia đôi mảng -> lặp lại
        quickSort(a,L, k-1);
        quickSort(a,k,R);
    }

    static  int partion(int [] a , int L , int R , int key){
        int iL = L;
        int iR = R;
        while (iL <= iR){
            while (a[iL] < key) iL++; // tăng iL để tìm phần tử không đúng ví : có nghĩa là tìm phần tử >= key
            while (a[iR] > key) iR--; // giảm iR để tìm phần không đúng vị trí : có nghĩa là tìm phần tử <= key
            // đổi 2 phần tử đang đứng không đúng vị trí
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

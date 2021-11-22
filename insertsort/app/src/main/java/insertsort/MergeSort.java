package insertsort;


import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public int[] mergeSort(int[]arr){
        int n=arr.length;

        if (n>1){
            int mid=n/2;

            int []leftPart= Arrays.copyOfRange(arr,0,mid);
            int []rightPart= Arrays.copyOfRange(arr,mid,arr.length);
            //{1,2,3,4}
            mergeSort(leftPart);
            mergeSort(rightPart);
            merge(leftPart, rightPart, arr);
        }return arr;
    }
    public int[] merge(int[]left,int[]right,int[]arr) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i = i + 1;
                System.out.println(i);
            } else {
                arr[k] = right[j];
                j = j + 1;
            }
            k = k + 1;
        }
        if (i == left.length) {
            System.out.println(i);

            for (int l = j; l < right.length; l++) {
                arr[k] = right[l];
                k++;
            }

        }
        else{

            for (int r = i; r < left.length; r++) {
                arr[k] = left[r];
                k++;
            }

        }return arr;
    }
}
import java.util.*;

class BinarySearch {

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int num = 10;
        int result = binarySearch(num);
        if (result == -5)
            System.out.println("there is no element ");
        else
            System.out.println("Element found at index " + result);
    }

       public int binarySearch(int arr[], int num){
            int mid ;
            int firstNumInd =0;
            int lastNumInd =arr.length-1 ;
            while ( firstNumInd <= lastNumInd) {
                mid = (firstNumInd+lastNumInd)/2;
                if (arr[mid] == num) {
                    return mid;
                } else if (arr[mid] > num) {
                    lastNumInd=mid-1
                }else {
                    firstNumInd =mid+1;
                }
            }
        }
        return -5;
    }
}
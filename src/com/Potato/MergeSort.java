package com.Potato;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;

public class MergeSort {

    public static int inversionCount = 0;

    // Places the elements of the given array into sorted order
    // using the merge sort algorithm.
    // post: array is in sorted (nondecreasing) order
    public static int[] mergeSort(int[] array) {
        int[] returnArr = new int[array.length];
        if (array.length > 1) {
            // split array into two halves
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);

            // recursively sort the two halves
            mergeSort(left);
            mergeSort(right);

            // merge the sorted halves into a sorted whole
            returnArr = merge(array, left, right);
        }
        return returnArr;
    }

    // Returns the first half of the given array.
    public static int[] leftHalf(int[] array) {
        int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }

    // Returns the second half of the given array.
    public static int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }

    // Merges the given left and right arrays into the given
    // result array.  Second, working version.
    // pre : result is empty; left/right are sorted
    // post: result contains result of merging sorted lists;
    public static int[] merge(int[] result,
                             int[] left, int[] right) {
        int i1 = 0;   // index into left array
        int i2 = 0;   // index into right array

        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length &&
                    left[i1] <= right[i2])) {
                result[i] = left[i1];    // take from left
                i1++;
                //inversionCount++;
            } else {
                result[i] = right[i2];   // take from right
                i2++;
                inversionCount++;
            }
        }
        System.out.println("Inversion count is = " + inversionCount);
        return result;
    }


   }






//package com.Potato;
//
//public class mergeSrt {
//
//    //class that sets the initializes the merge sort using the input arr,
//    // a helper arr, start, and end
//    static int mergeSort(int arr[], int arr_size) {
//        int temp[] = new int[arr_size];
//
//        //returns inversion count
//        return mergeSorting(arr, temp, 0, arr_size - 1);
//    }
//
//    // uses recursion to sort the input array andd return the inversion amount
//    static int mergeSorting(int arr[], int temp[], int left, int right) {
//
//        //initialize variables
//        int mid, inv_count = 0;
//
//        //if the right is greater than left begins the sorting. if it's not then it's an array size 1
//
//        if (right > left) {
//            //Divide the array into two parts and call mergeSorting to sort each part.
//            mid = (right + left)/2;
//
//            // Inversion count will be sum of inversions in left side, right side, and merging
//            inv_count = mergeSorting(arr, temp, left, mid);
//            inv_count = inv_count + mergeSorting(arr, temp, mid+1, right);
//            inv_count= inv_count + merge(arr, temp, left, mid+1, right);
//        }
//        return inv_count;
//    }
//
//    // This method merges the two sorted arrays
//    static int merge(int arr[], int temp[], int left, int mid, int right)
//    {
//        int i, j, k;
//        int inv_count = 0;
//        // i is the index for the left arr
//        //j is the index for the right arr
//        //k is the combined arr index
//
//        i = left;
//        j = mid;
//        k = left;
//
//        // During the merge process, when arr[i] is greater than a[j] then
//        // there are (mid-i) inversion since both subarrays are sorted.
//        while ((i <= mid - 1) && (j <= right))
//        {
//            if (arr[i] <= arr[j]) {
//                temp[k++] = arr[i++];
//            }
//            else {
//                temp[k++] = arr[j++];
//                inv_count = inv_count + (mid - i);
//            }
//        }
//
//        //copy any remaining element of the left array to temp
//        while (i <= mid - 1) temp[k++] = arr[i++];
//        //copy any remaining element of the right array to temp.
//        while (j <= right) temp[k++] = arr[j++];
//
//        //merge elements back to original array
//        for (i=left; i <= right; i++) {
//            arr[i] = temp[i];
//        }
//
//        return inv_count;
//    }
//
//
//}




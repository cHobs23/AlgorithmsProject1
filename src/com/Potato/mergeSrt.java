package com.Potato;

public class mergeSrt {

    static int mergeSort(int arr[], int arr_size) {
        int temp[] = new int[arr_size];

        return mergeSorting(arr, temp, 0, arr_size - 1);
    }

        static int mergeSorting(int arr[], int temp[], int left, int right) {

        int mid, inv_count = 0;


            if (right > left) {
                mid = (right + left)/2;

                inv_count = mergeSorting(arr, temp, left, mid);
                inv_count = inv_count + mergeSorting(arr, temp, mid+1, right);
                inv_count= inv_count + merge(arr, temp, left, mid+1, right);
            }
                return inv_count;
        }

        // This method merges the two sorted arrays
    static int merge(int arr[], int temp[], int left, int mid, int right)
    {
        int x;
        int y;
        int z;
        int inv_count = 0;

        x = left;
        y = mid;
        z = left;

        while ((x <= mid - 1) && (y <= right))
        {
            if (arr[x] <= arr[y]) {
                temp[z++] = arr[x++];
            }
            else {
                temp[z++] = arr[y++];
                inv_count = inv_count + (mid - x);
            }
        }

        while (x <= mid - 1) temp[z++] = arr[x++];
        while (y <= right) temp[z++] = arr[y++];

        for (x=left; x <= right; x++) {
            arr[x] = temp[x];
        }

        return inv_count;
    }


}

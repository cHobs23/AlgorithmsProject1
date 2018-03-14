
package com.Potato;

public class SelectionSort {

   private static int countInversion = 0;
   private static int lowMedian =0;

    public static void sort(int arr[],int a, int b)
    {
        if(a < b) {
            int index = partitionArray(arr, a, b);
            if (a > ((arr.length / 2) - 1) && b > ((arr.length / 2 - 1))) {

                lowMedian = arr[(arr.length / 2) - 1];
                System.out.println("Lower median: " + lowMedian);
            } else {

                sort(arr, a, (index - 1));
                sort(arr, (index + 1), b);
            }
        }
    }
   public  static int partitionArray(int arr[], int a, int b){

        int k = arr[b];
        int i = a-1;
        for(int j=a; j<b; j++)
        {
            if(arr[j]<= k)
            {
                i++;

                int inversion = arr[i];
                arr[i]=arr[j];
                arr[j]=inversion;
            }
        }

        int inversion = arr[i+1];
        arr[i+1]=arr[b];
        arr[b]=inversion;
        countInversion++;

        return i+1;
    }

    public static int getInverCount()
    {
        return countInversion;
    }

}

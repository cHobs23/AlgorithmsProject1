
package com.Potato;

public class SelectionSort {

   int countInversion = 0;

    public  static int partitionArray(int array[], int a, int b){

        int countInversion = 0;
        int k = array[b];
        int i = a-1;
        for(int j=a; j<b; j++)
        {
            if(array[j]<= k)
            {
                i++;

                int inversion = array[i];
                array[i]=array[j];
                array[j]=inversion;
            }
        }

        int inversion = array[i+1];
        array[i+1]=array[b];
        array[b]=inversion;
        countInversion++;
        System.out.println("i+1  is: "+ i+1);
        return i+1;
    }

    public  static int sort(int array[],int a, int b)
    {
        if(a < b)
        {
            printArray(array);
            int index = partitionArray(array, a, b);
            sort(array, a, (index-1));
            sort(array, (index+1), b);
        }

        return countInversion;

    }



    public static void printArray(int array[])
    {
        int n = array.length;
        System.out.print("After sorting:   ");
        for (int index=0; index<n; index++)
        {
            System.out.print(array[index] + "  ");
        }
        System.out.println();
    }


    public int getInverCount()
    {
        return countInversion;
    }

}

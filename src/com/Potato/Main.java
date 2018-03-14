package com.Potato;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        try {
            int end = args.length - 1;

            //set output file to the last args
            String outputFile = args[end];

            //set the decimal format 2 decimal places
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(8);

            PrintStream out = new PrintStream(new FileOutputStream(outputFile));
            System.setOut(out);

            for (int x = 0; args.length - 1 > x; x++) {

                int xInput = 0;

                String inputFile = args[x];

                Scanner counterFile = new Scanner(new File(inputFile));
                Scanner scan = new Scanner(new File(inputFile));
                //BufferedReader buffScan = new BufferedReader(new FileReader(inputFile));


                while (counterFile.hasNextInt()) {
                    counterFile.nextInt();
                    xInput++;
                }

                int[] arr = new int[xInput];
                int[] mergeArr = new int[xInput];
                int[] selectionArr = new int[xInput];




                System.out.println("This is an array with "+ xInput+ " size");
                System.out.println("This is the unsorted array:");
                for (int i = 0; i < xInput; i++) {
                    arr[i] = scan.nextInt();
                    mergeArr[i] = arr[i];
                    selectionArr[i] = arr[i];
                    //System.out.print(mergeArr[i]+",");
                }

                long start = System.nanoTime();
//                System.out.println("This is unsorted Array" + mergeArr);
//                com.Potato.MergeSort.mergeSort(mergeArr);
//                System.out.println("\n\nThis is sorted Array");
//                for(int i = 0; i < xInput;i++){
//                    System.out.print(mergeArr[i]+",");
//                }
                 com.Potato.SelectionSort.sort(selectionArr,0,xInput-1);
                 System.out.println("Inversion count" +com.Potato.SelectionSort.getInverCount());

               // System.out.println(com.Potato.mergeSrt.mergeSort(mergeArr,mergeArr.length-1));

                long elapseTime = System.nanoTime() - start;
                double seconds = elapseTime/1000000000.0;
                System.out.println("\nThe lower median is" + mergeArr[(xInput/2)-1]);
                System.out.println("Elapsed Time for finding median:"+ seconds);



            }


            //hello my name is richie
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

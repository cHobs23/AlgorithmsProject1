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
                int[] outputArr = new int[xInput];

                for (int i = 0; i < xInput; i++) {
                    arr[i] = scan.nextInt();
                }
                com.Potato.MergeSort.mergeSort(arr);

                System.out.print(arr[xInput/2]);




            }


            //hello my name is richie
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

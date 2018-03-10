package com.Potato;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        try{
            int end = args.length - 1;

            //set output file to the last args
            String outputFile = args[end];

            //set the decimal format 2 decimal places
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(8);

            PrintStream out = new PrintStream(new FileOutputStream(outputFile));
            System.setOut(out);


            for(int x=0 ;args.length-1 >x; x++) {

                String inputFile = args[x];

                Scanner scan = new Scanner(new File(inputFile));



            }









        }


        //hello my name is richie
    }

}

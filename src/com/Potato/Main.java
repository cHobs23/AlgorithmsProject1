package com.Potato;
import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
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

                int xInput = 0 ;

                String inputFile = args[x];

                Scanner scan = new Scanner(new File(inputFile));
                //BufferedReader buffScan = new BufferedReader(new FileReader(inputFile));


                List<Integer> list = new ArrayList<Integer>();

//                while((xInput = buffScan.read()) !=null) {
//                    list.add(xInput);
//                }


                while(scan.hasNextInt()) {
                    list.add(scan.nextInt());
                    xInput++;
                }

                System.out.print(list);
            }

        }


        catch (FileNotFoundException var13) {
            var13.printStackTrace();
        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }


        //hello my name is richie
    }

}

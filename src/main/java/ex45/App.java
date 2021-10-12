package ex45;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mohammed Almeaither
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class App {


        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Enter file name: ");
            String filename = in.nextLine();
            String outputfile = "exercise45_output.txt";
            String line = "";
            List<String> lines = new ArrayList<String>();
            List<String> sortedList = new ArrayList<String>();

            String list[] =  new String[]{""};

            int i = 0;
            try
            {
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                do {

                    line = reader.readLine();
                    if(line != null)
                    {
                        lines.add(line);
                        i++;
                    }

                }
                while(line != null);

                for(i=0;i<lines.size();i++)
                {
                    line = lines.get(i);
                    line = line.replace("utilize","use");
                    lines.set(i, line);
                }


            } //end try
            catch(IOException ioe)
            {
                System.err.println("Error reader from "+filename);

            }




            try {
                FileWriter myWriter = new FileWriter(outputfile);
                for(i=0;i<lines.size();i++)
                    myWriter.write( lines.get(i) + "\n");
                System.out.print("Wrote to file successfully....!");
                myWriter.close();

            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }



        }

    }



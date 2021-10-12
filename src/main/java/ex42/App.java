package ex42;
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

public class App {

        public static void main(String[] args) {
            // TODO Auto-generated method stub

            String filename = "exercise42_input.txt";
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

            } //end try
            catch(IOException ioe)
            {
                System.err.println("Error reader from "+filename);

            }


            System.out.print("Last\t  First\t   Salary\n");
            System.out.print("--------------------------\n");
            for(i=0;i<lines.size();i++) {
                String []line_split = lines.get(i).split(",");
                System.out.printf("%-9s %-9s %s\n",line_split[0], line_split[1],line_split[2]);

            }
        }

    }


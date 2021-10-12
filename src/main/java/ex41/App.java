package ex41;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mohammed Almeaither
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

        public static void main(String[] args) {


            // TODO Auto-generated method stub

            String filename = "exercise41_input.txt";
            String line;
            List<String> lines = new ArrayList<>();

            int i = 0;
            try
            {
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                do
                {

                    line = reader.readLine();
                    if (line != null)
                    {
                        lines.add(line);
                        i++;
                    }

                }
                while (line != null) ;


                int n = lines.size();
                String temp;
                for (i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {

                        // to compare one string with other strings
                        if (lines.get(i).compareTo(lines.get(j)) > 0) {
                            // swapping
                            temp = lines.get(i);

                            lines.set(i, lines.get(j));
                            lines.set(j, temp);
                        }
                    }
                }
            } //end try
            catch(IOException ioe)
            {

                System.err.println("Error reader from " + filename);

            }

            try {
                FileWriter myWriter = new FileWriter("exercise41_output.txt");
                myWriter.write("Total of " + lines.size() + " names\n");
                myWriter.write("-----------------\n");
                for (i = 0; i < lines.size(); i++)
                    myWriter.write(lines.get(i) + "\n");

                myWriter.close();

            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }


        }
    }



package ex46;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mohammed Almeaither
 */
import java.util.Map;
import java.util.TreeMap;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class App {


        public static void main(String[] args) {
            // TODO Auto-generated method stub



            String filename = "exercise46_input.txt";
            String outputfile = "exercise46_output.txt";
            String line = "";
            List<String> lines = new ArrayList<String>();
            List<String> sortedList = new ArrayList<String>();
            Map<String,Integer> mp=new TreeMap<>();
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



                String newLine = "";

                for(i=0;i<lines.size();i++)
                {


                    // Splitting to find the word
                    //String arr[]=lines.get(i).split(" ");
                    newLine = newLine +" "+ lines.get(i);

                }
                String arr[] = newLine.split(" ");

                // Loop to iterate over the words
                for( i=1;i<arr.length;i++)
                {

                    if(mp.containsKey(arr[i]))
                    {
                        mp.put(arr[i], mp.get(arr[i])+1);
                    }
                    else
                    {
                        mp.put(arr[i],1);
                    }
                }

                // Loop to iterate over the
                // elements of the map
                for(Map.Entry<String,Integer> entry:
                        mp.entrySet())
                {
                    System.out.print(entry.getKey()+
                            ": ");
                    for(i=0;i<entry.getValue();i++)
                        System.out.print("*");
                    System.out.println();
                }



            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }



        }

    }



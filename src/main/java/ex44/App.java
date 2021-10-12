package ex44;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mohammed Almeaither
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class App {

        public static void main(String[] args) throws IOException, ParseException {

            Scanner in = new Scanner(System.in);
            JSONParser js = new JSONParser();

            try {
                FileReader reader = new FileReader("data.json");

                Object obj = js.parse(reader);

                JSONObject givendata = (JSONObject)obj;

                JSONArray array = (JSONArray)givendata.get("product");

                boolean con = true;

                String choice;
                while(con) {
                    System.out.print("What is the product name? ");
                    choice = in.nextLine();
                    for(int i=0;i<array.size();i++) {
                        JSONObject prod = (JSONObject)array.get(i);
                        if(prod.get("name").equals(choice)) {
                            System.out.println("Name: " + prod.get("name"));
                            System.out.println("Price: " + prod.get("price"));
                            System.out.println("Quantity: " + prod.get("quantity"));
                            con = false;
                        }
                    }
                    if(con) {
                        System.out.println("Sorry, that product was not found in out inventory.");
                    }
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


        }

    }



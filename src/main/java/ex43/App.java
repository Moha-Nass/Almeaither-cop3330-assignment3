package ex43;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mohammed Almeaither
 */
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String title = "<div> <h1> Header here </h> <p>Hello world</p></div>";
        System.out.print("Site name: ");
        String name = in.nextLine();
        System.out.print("Author: ");
        String auth = in.nextLine();
        System.out.print("Do you want a folder for javaScript? ");
        char js = in.nextLine().charAt(0);
        System.out.print("Do you want a folder for CSS? ");
        char css = in.nextLine().charAt(0);
        if(js == 'y'| js == 'Y') {
            File f1 = new File("website/" + name);
            boolean bool = f1.mkdirs();
            if(bool) {
                System.out.println("Created ./website/"+name);
            }

            File f4 = new File("/index.html");
            boolean bool4 = f4.mkdirs();
            if(bool4) {
                System.out.println("Created ./website/"+name+ "/index.html");
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(f4));
                    bw.write(title);
                    bw.close();
                }
                catch(IOException e) {
                    e.printStackTrace();
                }
            }




            File f2 = new File("website/" + name + "/js");
            boolean bool2 = f2.mkdirs();
            if(bool2) {
                System.out.println("Created ./website/"+name+ "/js");
            }

            File f3 = new File("website/" + name + "/css");
            boolean bool3 = f3.mkdirs();
            if(bool3) {
                System.out.println("Created ./website/"+name+ "/css");
            }



        }

        in.close();
    }

}








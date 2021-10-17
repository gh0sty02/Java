package com.pranay;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;



public class CombiningFiles {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new FileReader("abc.txt"));
        PrintWriter pr = new PrintWriter(new FileWriter("combined.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("fw.txt"));

        String line1 = br1.readLine();
        String line2 = br2.readLine();

        while(line1 != null || line2 != null){
            if(line1 != null){
                pr.println(line1);
                line1 = br1.readLine();

            }
            if(line2 != null){
                pr.println(line2);
                line2 = br2.readLine();

            }
        }

        pr.flush();
        pr.close();

    }
}

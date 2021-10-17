package com.pranay;
import java.io.*;

public class BW {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("fw.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(100);
        bw.newLine();
        char[] arr = {'p', 'r','a','n','a','y'};
        bw.write(arr);
        bw.newLine();
        bw.write("Hello, this is Pranay, How are you ??");
        bw.newLine();
        bw.write("I'm all good");

        bw.flush();
        bw.close();
    }
}

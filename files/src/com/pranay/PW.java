package com.pranay;

import java.io.PrintStream;
import java.io.PrintWriter;

public class PW {
    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println(100);
        pw.println(true);
        pw.close();
    }
}

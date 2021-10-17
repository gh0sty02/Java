package com.pranay;

import java.io.*;

public class ReallAllFiles{

    private static BufferedReader br;

    public static void main(String[] args)  throws Exception {
        PrintWriter pw = new PrintWriter("AIO.txt");
        File f = new File("C:\\Users\\Pranay Yadav\\Desktop\\NodeSql");
        String[] arr = f.list();
        for(String file : arr){
            File temp = new File(f, file);
            BufferedReader br = new BufferedReader(new FileReader(temp));
            String line = br.readLine();
            while(line != null){
                pw.println(line);
                line = br.readLine();
            }

        }
        pw.flush();
        pw.close();
    }
}

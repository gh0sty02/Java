package com.pranay;

import java.io.*;

public class CompareAndDelete {
    public static void main(String[] args) throws Exception{
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

        BufferedReader b1 = new BufferedReader(new FileReader("input1.txt"));
        String line1 = b1.readLine();
        while(line1 != null){
            boolean available  =false;
            BufferedReader br2 = new BufferedReader(new FileReader("delete.txt"));
            String target = br2.readLine();
            while(target != null){
                if(line1.equals(target)){
                    available = true;
                    break;
                }
                target = br2.readLine();
            }
            if(!available){
                pw.println(line1);
            }
            line1 = b1.readLine();
        }
        pw.flush();
        pw.close();
    }
}

package com.pranay;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
//        File f = new File("abc.txt");
//        System.out.println(f.exists());
//        f.createNewFile();
//        f.delete();

        int count = 0;
        try{
//            FileWriter f = new FileWriter("abc.txt", true);
//            f.write("HEllo this is PRanay\n");
//            char[] arr = {'p', 'n', 'y'};
//            f.write(arr);
//            f.write("\n");
//            f.flush();
            File f = new File("abc.txt");
            FileReader fr = new FileReader(f);
//            int i = fr.read();
//            while (i != -1){
//                System.out.print((char)(i));
//                i = fr.read();
//            }

            char[] arr = new char[(int)f.length()];
            fr.read(arr);
            for(char c : arr){
                System.out.print(c);
            }

        }catch (NullPointerException e){
            e.printStackTrace();
        }

    }


}

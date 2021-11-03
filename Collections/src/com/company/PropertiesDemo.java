package com.company;

import java.io.*;
import java.util.*;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("abc.properties");
        p.load(fis);
        System.out.println(p);

//        System.out.println(new File(".").getAbsoluteFile());


    }
}

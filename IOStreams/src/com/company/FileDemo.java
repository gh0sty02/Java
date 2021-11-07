package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo {
    public static void main(String[] args) throws Exception {
        File f = new File("abc.txt");
        System.out.println(f.canRead());
        f.setReadOnly();
        FileOutputStream fos = new FileOutputStream(f);
        fos.write('w');
    }
}

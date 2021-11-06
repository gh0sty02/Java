package com.company;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread{
    OutputStream os;
    Producer(OutputStream o){
         os = o;
     }
    @Override
     public void run() {
             int count = 0;
             while (true) {
                 try {
                 os.write(count);
                 os.flush();

                 System.out.println("Producer " + count);
                 System.out.flush();

                 Thread.sleep(10);
                 count++;
                 }catch (Exception e){}
             }
     }
 }

 class Consumer extends Thread{
    InputStream io;

    Consumer(InputStream o){
        io = o;
    }

     @Override
     public void run() {
         int x;
         while(true){
             try{
             x = io.read();
                 System.out.println("Consumer : " + x);
                 System.out.flush();
             }catch (Exception e){}
         }
     }
 }

public class PipedStreams {

    public static void main(String[] args) throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        Consumer c = new Consumer(pis);
        Producer p = new Producer(pos);

        pos.connect(pis);

        p.start();
        c.start();
    }


}

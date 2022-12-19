package org.example;

public class ThreadSleep {
    public static void main(String[] args) {
        try
        {
            for (int i=1;i<10000;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

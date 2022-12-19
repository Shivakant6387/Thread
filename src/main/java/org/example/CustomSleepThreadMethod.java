package org.example;

public class CustomSleepThreadMethod extends Thread {
public void  run (){

    try
    {
        for (int i=0;i<5;i++){
            Thread.sleep(1000);
            System.out.println(i);
        }

    }catch (InterruptedException e){
        System.out.println(e);
    }

}
    public static void main(String[] args) {
CustomSleepThreadMethod customSleepThreadMethod=new CustomSleepThreadMethod();
customSleepThreadMethod.start();
    }
}

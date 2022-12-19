package org.example;
class numbers{
    public void generateNumbers(){
        for (int i=1;i<=100;i++){
            System.out.println("The numbers from 1 to 100 are "+i);
        }
    }
    public void generateNumbersFrom101(){
        for (int i=101;i<=200;i++){
            System.out.println("The numbers from 101 to 200 are "+i);
        }
    }
}
public class SleepFile{
    public static void main(String[] args) {
        numbers thread=new numbers();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                thread.generateNumbers();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                thread.generateNumbersFrom101();
            }
        });
        thread1.start();
        thread2.start();
        System.out.println("Thanks for  using our software");
    }
}

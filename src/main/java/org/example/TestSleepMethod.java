package org.example;

public class TestSleepMethod extends Thread{
public void run(){
    for (int i=1;i<5;i++){
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println(e);
           }
        System.out.println(i);

    }

}

    public static void main(String[] args) {
 TestSleepMethod testSleepMethod=new TestSleepMethod();
 testSleepMethod.start();
 TestSleepMethod testSleepMethod1=new TestSleepMethod();
 testSleepMethod1.start();
    }
}

package org.example;

public class ThreadIllegalEx {
    public static void main(String[] args) {
        try{
            for (int i=0;i<10;i++){
                Thread.sleep(-100);
                System.out.println(i);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

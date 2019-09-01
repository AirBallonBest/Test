package cn.fortest;

import java.io.FileNotFoundException;
import java.io.IOException;

public class HelloB extends HelloA {
	
	
	 public HelloB(){
         System.out.println("HelloB");
     }

     { System.out.println("I'm B class"); }

     static {
         System.out.println("static B");
     }

     public static void main(String[] args) {
         System.out.println("main start");
         new HelloB();
         new HelloB();
         System.out.println("main end");
         
         seven();
     }

     private static void seven() {
         try{
             if(true){
                 throw new IOException();
             }
         }catch (FileNotFoundException e){
             System.out.print("FileNotFoundException!");
         }catch (IOException e){
             System.out.print("IOException!");
         }catch (Exception e){
             System.out.print("Exception!");
         }
         System.out.println("\n7. IOException!");
     }
	
}

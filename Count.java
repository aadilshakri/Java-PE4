import java.io.*;
import java.util.Scanner;

class Count{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       String string = input.nextLine();
       String s =input.next();
       String newstring = string.replaceAll(s, "");
       int count = string.length()- newstring.length();
       System.out.println(count);
       input.close();
   }
}
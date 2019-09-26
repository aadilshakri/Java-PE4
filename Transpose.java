import java.io.*;
import java.util.*;

class Transpose{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String string=input.nextLine();
        String[] words = string.split(" ");
        for(String i:words){
            StringBuilder j=new StringBuilder();
            j.append(i);
            j=j.reverse();
            System.out.print(j + " ");
        }     
    }
}
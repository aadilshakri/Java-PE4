import java.io.*;
import java.util.*;

class Replace{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String string=input.nextLine();
        System.out.println("Original string: "+ string);
        string=string.replace('d', 'f');
        string=string.replace('l','t');
        System.out.println("New string: "+ string);
        input.close();
    }
    
}
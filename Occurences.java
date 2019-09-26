import java.util.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Occurences{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        String string=input.nextLine();
        String s=input.next();
        Pattern pattern = Pattern.compile(s);
        Matcher m = pattern.matcher(string);
        while(m.find()){
            System.out.println("Found at: " + m.start()+"-"+ (m.end()));
        }
        input.close();
    }
}
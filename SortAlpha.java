import java.io.*;
import java.util.*;

class SortAlpha{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String string=input.nextLine();
        String[] words = string.split("\\,|\\.|\\ ");
        List<String> list=new ArrayList<String>(Arrays.asList(words));
        Collections.sort(list); 
        for(String i:list)
        System.out.print(i);
        input.close();
    }
}
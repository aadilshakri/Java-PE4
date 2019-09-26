import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Regex{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        String string=input.nextLine();
        Pattern pattern = Pattern.compile("Harry");
        Matcher m = pattern.matcher(string);
        if(m.find()){
            System.out.println("Is Harry here ? "+true);
        }
        else{
            System.out.println("Is Harry here ? "+false);
        }
    }

}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Documentación desde cisco para un mejor entendimiento link pdf:
https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&ved=2ahUKEwjUn5i1qunyAhUTXM0KHcUeD2UQFnoECAMQAQ&url=https%3A%2F%2Fwww.cisco.com%2Fc%2Fen%2Fus%2Ftd%2Fdocs%2Frouters%2Fxr12000%2Fsoftware%2Fxr12k_r4-1%2Fgetting_started%2Fconfiguration%2Fguide%2Fgs41xr12k%2Fgs41aexp.pdf&usg=AOvVaw1qvVb1ODlCxy7tB6xSl6jI
 */

public class TagContentExtractor{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = p.matcher(line);

            int match = 0;
            while (m.find()){
                match ++;
                System.out.println(m.group(2));
            }

            if(match == 0){
                System.out.println("None");
            }
            //Write your code here

            testCases--;
        }
    }
}

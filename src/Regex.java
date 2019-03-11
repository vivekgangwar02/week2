import java.util.regex.*;
public class Regex {

    public static void main(String[] args) {
        int c=0;

        //Using simply regex match using "matches" class/method
        String pattern =".*Q[^u]\\d+\\..*";
        String line="dfdf Q300. Qu300. ";

        if(line.matches(pattern))
            System.out.println("Matched");
        else
            System.out.println("no match");
        System.out.println();

        //Using Pattern compile and matcher classes
        String text="Welcome to Indian Railways, we wish for your great journey ahead";
        String patt=" is";
        Matcher m=Pattern.compile(patt).matcher(text);
        while(m.find()) {
            c++;
        }
//        if(m.find())
        System.out.println(text + " "+   patt);
        System.out.println();


        String pattern2="Q[^u]\\d+\\.";
        String text2="ORder QT300. Qi454. Now!!";
        Matcher m2=Pattern.compile("Q[^u]\\d+\\.").matcher(text2); //pattern2 string is not used
        if(m2.find()) {
            System.out.println(pattern2 + " matches " + m2.group(0));
        }

        String text3="john, smith\n adams, john quincy";
        String pattern3="(.*), (.*)";
        Matcher m3=Pattern.compile(pattern3).matcher(text3);
        if(m3.find()) {
            System.out.println(text3+" \nfinded using regex: "+pattern3+" i.e. "+ m3.group(2)+" "+m3.group(1));// returns the values
            //of groups only when m3.group(0) was not used as it retrns the full matching string
            //m3.start(groupNum) can also be used to return the position of the Substring or group(0) i.e. full match case
            //Similar to start , end can also be used to find the ending index
        }










    }
}

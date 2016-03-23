package carimartinez123.sillystories;

import java.util.ArrayList;

/**
 * Created by cari_martinez123 on 3/6/2016.
 */
public class BookContent {

    private static String title;
    private static String text;
    private static int numChars;
    private static int numNouns;
    private static int numAdjs;
    private static int numAdvs;
    private static int numNums;
    private static int numWeather;
    private static int numPlaces;
    private static ArrayList<String> chars = new ArrayList();
    private static ArrayList<String> nouns = new ArrayList();
    private static ArrayList<String> adjs = new ArrayList();
    private static ArrayList<String> advs = new ArrayList();

    public static void generateGrammarTypes(String str)
    {
        numChars = 4;
        numNouns = 9;
        numAdjs = 8;
        numNums = 2;
        numPlaces = 1;
        numWeather = 1;
        numAdvs = 2;
    }
    public static void generateText(String str)
    {
        title = str;
        switch(str)
        {
            case "Ride to the Airport":
                String CH1 = chars.get(0);
                String CH2 = chars.get(1);
                String CH3 = chars.get(2);
                String CH4 = chars.get(3);
                
                String PL = "Las Vegas";
                
                String ADJ1 = adjs.get(0);
                String ADJ2 = adjs.get(1);
                String ADJ3 = adjs.get(2);
                String ADJ4 = adjs.get(3);
                String ADJ5 = adjs.get(4);
                String ADJ6 = adjs.get(5);
                String ADJ7 = adjs.get(6);
                String ADJ8 = adjs.get(7);
                
                String N0 = nouns.get(0);
                String N1 = nouns.get(1);
                String N2 = nouns.get(2);
                String N3 = nouns.get(3);
                String N4 = nouns.get(4);
                String N5 = nouns.get(5);
                String N6 = nouns.get(6);
                String N7 = nouns.get(7);
                String N8 = nouns.get(8);
                
                String NUM1 = "7";
                String NUM2 = "77";
                
                String ADV1 = advs.get(0);
                String ADV2 = advs.get(1);
                
                String WEATHER1 = "tornado";


                text = "One day, " + CH1 + " and " + CH2 + " got in their " + N0 + " to get to the airport. They were going on a trip to " + PL + ", and they were very " + ADJ1 + ".  They were riding along " + ADV1 + " when all of a sudden " + CH1 + " said, \"Oh no I forgot my " + ADJ2 + " " + N1 + "!\" So, they turned their " + N0 + " around and started back to the house. " + CH2 + " said \"Uh-oh. We seem to be slowing down.\" \"Oh no!\" said " + CH1 + ". \" I forgot to put gas in the " + N0 + "!\" So, they stopped at the " + ADJ3 +  " gas station, " + CH2 + " said, \"Wow! This " + ADJ3 + " gas sure costs a lot of " +  N2 + "!\" " + CH1 +  " yelled, \"Oh no! I forgot my " + N2 + "!\" Now, they were really " + ADJ4 + ". Just then, it started to rain. " + CH2 + " cried, \"Look out! A " + WEATHER1 + "!\"  " + CH2 + " said, \" Ugh! I hate " + WEATHER1 + "s!\" " + CH1 +   " said, \"Don't worry. We'll get out of here. I found my lucky " + N3 + ". We can pay with that.\" "+ CH1 + " took the lucky " + N3 + " to " + CH3 + ", the cashier, who looked at it " + ADV2 + ". \"What exactly is this?\", said " + CH3 + ". \" This is my lucky " +  N3 + ",\" said " + CH1 + ", and it's worth " + NUM1 + " dollars, so I'm sure it will pay for the gas we need for our " + N0 + ".\" \"Okie dokie\", said " + CH3 + ". \"Here is your change.\" " +  CH3 + " gave " + CH1 + " one " + N4 + ", and " + CH1 + " and " + CH2 + " were off. \"Oh no!\" said " + CH1 + ". \"Look at the time! We're going to be late for our airplane if we don't go get my " + N1 + " right now!\" So they got in their " + N0 + " and went as fast as they could. All of a sudden, " + CH2 + " saw some flashing lights. \"Uh-oh!\" said " + CH2 + ". \"I think we were going too fast! The police officer is going to give us a " + N4 + "!\" " +  CH4 + ", the police officer, said \"Do you know how fast you were going? " + NUM2 + " miles per hour! I am going to have to give you a " + ADJ5 + " " +  N4 + ".\" " +  CH1 + " said, \"I'm sorry. We are in a hurry because I forgot my " + N1 + ", and we have to get to the airport fast. We're late! We're going to " + PL + " and we don't want to miss our flight. \" Well\", said " + CH4 + ", I happen to have an extra " + ADJ6 + " " +  N1 + " right here. I guess you could borrow it for a while if you promise to take good care of it.\" \"WE PROMISE!\" said " + CH1 + " and " + CH2+ ". Then, " + CH4 + " said \"You know, I know a " + ADJ7 + " shortcut to the airport from here. Follow me!\" So, " + CH1 + " and " + CH2 + " followed " + CH4 + " over the " + N5 + ", under the " + N6 + ", across the " + N7 + " and through the " + ADJ8 + " " + N8 + ". Finally, they made it to the airport. Time to fly!";

                System.out.println(text);
                break;
            default:
                break;
        }
    }

    public static String getTitle() {
        return title;
    }

    public static ArrayList<String> getChars() {
        return chars;
    }

    public static ArrayList<String> getNouns() {
        return nouns;
    }

    public static ArrayList<String> getAdjs() {
        return adjs;
    }

    public static ArrayList<String> getAdvs() {
        return advs;
    }

    public static String getText() {
        return text;
    }

    public static void setText(String text) {
        BookContent.text = text;
    }

    public static void setTitle(String title) {
        BookContent.title = title;
    }

    public static int getNumChars() {
        return numChars;
    }

    public static int getNumNouns() {
        return numNouns;
    }

    public static int getNumAdjs() {
        return numAdjs;
    }

    public static int getNumAdvs() {
        return numAdvs;
    }

    public static int getNumNums() {
        return numNums;
    }

    public static int getNumWeather() {
        return numWeather;
    }

    public static int getNumPlaces() {
        return numPlaces;
    }
}

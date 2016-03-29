package carimartinez123.sillystories;

import android.text.Html;

import java.util.ArrayList;

/**
 * Created by cari_martinez123 on 3/6/2016.
 */
public class BookContent {

    private final static char tab = '\u0009';
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
    private static ArrayList<String> nums = new ArrayList();
    private static ArrayList<String> places = new ArrayList();
    private static ArrayList<String> weathers = new ArrayList();

    public static void generateGrammarTypes(String str)
    {
        numChars = 4;
        numNouns = 10;
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
                
                String PL = places.get(0);
                
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
                String N9 = nouns.get(9);
                

                
                String NUM1 = nums.get(0);
                String NUM2 = nums.get(1);
                
                String ADV1 = advs.get(0);
                String ADV2 = advs.get(1);
                
                String WEATHER1 = weathers.get(0);



                text = "<font size='48'><em>Ride to the Airport</em></font> <br/> <br/>" +
                        tab + "One day, <font color='#0000EE'>" + CH1 + "</font> and <font color='#0000EE'>"
                        + CH2 + "</font> got in their <font color='#0000EE'>" + N0 + "</font> to get to the airport. They were going on a trip to <font color='#0000EE'>"
                        + PL + "</font>, and they were very <font color='#0000EE'>" + ADJ1 + "</font>.  They were riding along <font color='#0000EE'>" + ADV1 + "</font> " +
                        "when all of a sudden <font color='#0000EE'>" + CH1 + "</font> said, \"Oh no! I forgot my <font color='#0000EE'>" + ADJ2 +
                        "</font> <font color='#0000EE'>" + N1 + "</font>!\" So, they turned their <font color='#0000EE'>" + N0 + "</font> around " +
                        "and started back to the house.<br/><br/>  " +
                        tab + "<font color='#0000EE'>" + CH2 + "</font> said \"Uh-oh. We seem to be slowing down.\" \"Oh no!\" said" +
                        " <font color='#0000EE'>" + CH1 + "</font>. \"I forgot to put gas in the <font color='#0000EE'>" + N0 + "</font>!\" So, they stopped" +
                        " at the <font color='#0000EE'>" + ADJ3 + "</font> gas station, <font color='#0000EE'>" + CH2 + "</font> said, \"Wow! " +
                        "This <font color='#0000EE'>" + ADJ3 + "</font> gas sure costs a lot of <font color='#0000EE'>" +  N2 +
                        "</font>!\" <font color='#0000EE'>" + CH1 + "</font> yelled, \"Oh no! I forgot my <font color='#0000EE'>" + N2 +
                        "</font>!\" Now, they were really <font color='#0000EE'>" + ADJ4 + "</font>.<br/><br/>" +
                        tab + "Just then, it started to rain." +
                        " <font color='#0000EE'>" + CH2 + "</font> cried, \"Look out! A <font color='#0000EE'>" + WEATHER1 + "</font>!\" " +
                        " <font color='#0000EE'>" + CH2 + "</font> said, \"Ugh! I hate <font color='#0000EE'>" + WEATHER1 + "s</font>!\"" +
                        " <font color='#0000EE'>" + CH1 + "</font> said, \"Don't worry. We'll get out of here. I found my lucky <font color='#0000EE'>"
                        + N3 + "</font>. We can pay with that.\" <font color='#0000EE'>"+ CH1 + "</font> took the lucky <font color='#0000EE'>" + N3 + "</font> to " +
                        "<font color='#0000EE'>" + CH3 + "</font>, the cashier, who looked at it <font color='#0000EE'>" + ADV2 + "</font>. " +
                        "\"What exactly is this?\" said <font color='#0000EE'>" + CH3 + "</font>. \"This is my lucky <font color='#0000EE'>" +
                        N3 + "</font>,\" said <font color='#0000EE'>" + CH1 + "</font>, and it's worth <font color='#0000EE'>" + NUM1 + "</font>" +
                        " dollars, so I'm sure it will pay for the gas we need for our <font color='#0000EE'>" + N0 + "</font>.\" \"Okie dokie,\"" +
                        " said <font color='#0000EE'>" + CH3 + "</font>. \"Here is your change.\" <font color='#0000EE'>" +  CH3 + "</font> gave " +
                        "<font color='#0000EE'>" + CH1 + "</font> one <font color='#0000EE'>" + N4 + "</font>, and <font color='#0000EE'>" + CH1 +
                        "</font> and <font color='#0000EE'>" + CH2 + "</font> were off.<br/><br/>" +
                        tab + "\"Oh no!\" said <font color='#0000EE'>" + CH1 +
                        "</font>. \"Look at the time! We're going to be late for our airplane if we don't go get my <font color='#0000EE'>" + N1 +
                        "</font> right now!\" So they got in their <font color='#0000EE'>" + N0 + "</font> and went as fast as they could." +
                        " All of a sudden, <font color='#0000EE'>" + CH2 + "</font> saw some flashing lights. \"Uh-oh!\" said <font color='#0000EE'>" +
                        CH2 + "</font>. \"I think we were going too fast! The police officer is going to give us a <font color='#0000EE'>" +
                        N9 + "</font>!\" <font color='#0000EE'>" +  CH4 + "</font>, the police officer, said \"Do you know how fast you were going? " +
                        "<font color='#0000EE'>" + NUM2 + "</font> miles per hour! I am going to have to give you a <font color='#0000EE'>" +
                        ADJ5 + "</font> <font color='#0000EE'>" +  N9 + "</font>.\" <font color='#0000EE'>" +  CH1 + "</font> said, \"I'm sorry. " +
                        "We are in a hurry because I forgot my <font color='#0000EE'>" + N1 + "</font>, and we have to get to the airport fast. " +
                        "We're late! We're going to <font color='#0000EE'>" + PL + "</font> and we don't want to miss our flight.\" \"Well\", " +
                        "said <font color='#0000EE'>" + CH4 + "</font>, \"I happen to have an extra <font color='#0000EE'>" + ADJ6 + "</font> " +
                        "<font color='#0000EE'>" + N1 + "</font> right here. I guess you could borrow it for a while if you promise to take good care" +
                        " of it.\" \"WE PROMISE!\" said <font color='#0000EE'>" + CH1 + "</font> and <font color='#0000EE'>" + CH2+ "</font>. Then," +
                        " <font color='#0000EE'>" + CH4 + "</font> said \"You know, I know a <font color='#0000EE'>" + ADJ7 + "</font> shortcut to " +
                        "the airport from here. Follow me!\" <br/><br/>" +
                        tab + "So, <font color='#0000EE'>" + CH1 + "</font> and <font color='#0000EE'>" + CH2 +
                        "</font> followed <font color='#0000EE'>" + CH4 + "</font> over the <font color='#0000EE'>" + N5 + "</font>, under the" +
                        " <font color='#0000EE'>" + N6 + "</font>, across the <font color='#0000EE'>" + N7 + "</font> and through the" +
                        " <font color='#0000EE'>" + ADJ8 + "</font> <font color='#0000EE'>" + N8 + "</font>. Finally, they made it to the airport. Time to fly!<br/><br/>" +
                        "THE END";


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

    public static ArrayList<String> getNums() {
        return nums;
    }

    public static ArrayList<String> getPlaces() {
        return places;
    }

    public static ArrayList<String> getWeathers() {
        return weathers;
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

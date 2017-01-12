package twelvedaysofchristmas;

public class days {

    public static void main(String[] args) {

        for (int i = 0 ; i < 12; i++){

            System.out.printf("On the first day of Christmas \nmy true love"
                    + "sent to me:\n");
            twelveDays(i);

        }
    }
    private static void twelveDays(int i){


        String[] twelve = new String[]
                {"Partridge in a Pear Tree",
                        "Turtle Doves",
                        "French Hens",
                        "Calling Birds",
                        "Golden Rings",
                        "Geese a Laying",
                        "Swans a Swimming",
                        "Maids a Milking",
                        "Ladies Dancing",
                        "Lords a Leaping",
                        "Pipers Piping",
                        "Drummers Drumming"};


        for (int counter = 0; counter <= i; counter++){

            System.out.println(twelve[counter]);}


    }

}

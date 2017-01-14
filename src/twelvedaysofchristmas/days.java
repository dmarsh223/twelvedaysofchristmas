package twelvedaysofchristmas;

public class days {

    public static void main(String[] args) {

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

        String[] days = new String[]
                {"first", "second", "third", "fourth", "fifth", "sixth",
                        "seventh", "eighth", "ninth", "tenth", "eleventh",
                        "twelfth"
                };

        String[] number = new String[]
                {"a", "two", "three", "four", "five", "six", "seven",
                        "eight", "nine", "ten", "eleven", "twelve"

                };

        for (int i = 0; i < 12; i++) {

            System.out.printf("On the " + days[i] + " day of Christmas \nmy true love sent to me:\n");

            for (int counter = i; counter >= 0; counter--) {

                if (counter == 0 && i != 0) {
                    System.out.printf("and ");
                }

                System.out.printf(number[counter] + " ");

                System.out.println(twelve[counter]);

            }

            System.out.println();
        }
    }

}
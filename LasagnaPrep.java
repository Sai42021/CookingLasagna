import java.util.Scanner;

public class LasagnaPrep {

    // Define the expected oven time in minutes. According to the cooking book, the
    // expected oven time in minutes is 40.
    public static int EXPECTED_MINUTES_IN_OVEN = 40;

    // Calculating the remaining oven time in minutes.
    static void remainingMinutesInOven(int actualTimeInOven, int EXPECTED_MINUTES_IN_OVEN) {
        int TimeLeft = EXPECTED_MINUTES_IN_OVEN - actualTimeInOven;
        System.out.println("Time left in oven: " + TimeLeft + " minutes");
    }

    // Calculate the preparation time in minutes.
    public static int preparationTimeInMinutes(int numberOfLayers) {
        int prepTime = numberOfLayers * 2;
        return prepTime;
    }

    // Calculate the total working time in minutes.
    static void totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        int totalTimeWorked = preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
        System.out.println("Total working time: " + totalTimeWorked + " minutes");
    }

    public static void main(String args[]) {
        try (Scanner userIn = new Scanner(System.in)) {
            System.out.println("How long has the lasagna been in the oven? ");
            int actualTimeInOven = userIn.nextInt();
            if (actualTimeInOven < 40) {
                remainingMinutesInOven(actualTimeInOven, EXPECTED_MINUTES_IN_OVEN);
            } else {
                System.out.println("The lasagna is definitely done by now!");
            }

            System.out.println("Enter number of layers added: ");
            int numberOfLayers = userIn.nextInt();
            totalTimeInMinutes(numberOfLayers, actualTimeInOven);
        }

    }

}
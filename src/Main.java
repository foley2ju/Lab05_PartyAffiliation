import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {

        String affiliation = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter party affiliation (Democratic, Republican, Independent): ");
        affiliation = in.nextLine();

        // Independent
        if (affiliation.equals("Independent")) {
            System.out.println("You get an independent person.");
        }

        // Democratic
        else if (affiliation.equals("Democratic")) {
            System.out.println("You get a democratic donkey.");
        }

        // Republican
        else if (affiliation.equals("Republican")) {
            System.out.println("You get a republican elephant.");

        }

        // Fail
        else {
            System.out.println("Please enter a proper USA party affiliation (Democratic, Republican, Independent). You entered:" + affiliation);
        }

    }
}
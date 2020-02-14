import javax.swing.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        askTheQuestion();
        doKitchenLogic();
        doUpstairsLogic();
    }


    public static void askTheQuestion(){
        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" +
                "\"kitchen\"?");
    }

    public static void doKitchenLogic() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();


        if (input.equals("kitchen")) {
            System.out.println("There is a long counter top with dirty dishes everywhere.  Off to one side\n" +
                    "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
                    "or look in a \"cabinet\".");
            input = scan.nextLine().toLowerCase();

            if (input.equals("refrigerator")) {
                System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                        "Would you like to eat some of the food? (\"yes\" or \"no\")");

                input = scan.nextLine().toLowerCase();

                if (input.equals("no")) {
                    System.out.println("You die of starvation... eventually.");
                }
                if (input.equals("yes")) {
                    System.out.println("You don't die of starvation... eventually.");
                }
            }

            if (input.equals("cabinet")) {
                System.out.println("Inside the cabinet you see a fully charged laptop.  Looks like someone installed intelliJ.\n" +
                        "Would Would you like to code? (\"yes\" or \"no\")");

                input = scan.nextLine().toLowerCase();

                if (input.equals("no")) {
                    System.out.println("You should make tome to practice Java.");
                }
                if (input.equals("yes")) {
                    System.out.println("I think this is the right decision so you stay sharp with code");
                }
            }
        }
    }

    public static void doUpstairsLogic() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();


        if (input.equals("upstairs")) {
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n" +
                    "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n" +
                    "to go?");
            input = scan.nextLine().toLowerCase();

            if (input.equals("bedroom")) {
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                        "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                        "like to open the door? (\"yes\" or \"no\")");

                input = scan.nextLine().toLowerCase();

                if (input.equals("no")) {
                    System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\n" +
                            "I'm tired of making nested if statements.");
                }
                if (input.equals("yes")) {
                    System.out.println("Looks like a fully charged laptop and someone installed intelliJ. I'll code for a while.\n");
                }
            }

            if (input.equals("bathroom")) {
                System.out.println("Inside the bathroom you see a fully charged laptop.  I've always wanted to try, Python should we give it a shot?.\n" +
                        "(\"yes\" or \"no\")");

                input = scan.nextLine().toLowerCase();

                if (input.equals("no")) {
                    System.out.println("You should make tome to practice a new language so you stay sharp.");
                }
                if (input.equals("yes")) {
                    System.out.println("I think this is the right decision so you stay sharp with code");
                }
            }
        }
    }
}

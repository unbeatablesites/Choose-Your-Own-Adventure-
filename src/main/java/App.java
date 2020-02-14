import javax.swing.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        askTheQuestion();
        doKitchenLogic();

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
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                        "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                        "like to open the door? (\"yes\" or \"no\")");

                input = scan.nextLine().toLowerCase();

                if (input.equals("no")) {
                    System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\n" +
                            "I'm tired of making nested if statements.");
                }
            }
        }
    }
}

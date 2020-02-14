import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        askTheQuestion();
        doLogic();
    }


    public static void askTheQuestion(){
        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!\n");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" +
                "\"kitchen\"?");
    }

    public static void doLogic(){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(input.equals("upstairs")){
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n" +
                    "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n" +
                    "to go?");
            input = scan.nextLine().toLowerCase();

            if(input.equals("bedroom")){
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                        "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                        "like to open the door? (\"yes\" or \"no\")");

                input = scan.nextLine().toLowerCase();

                if(input.equals("no")){
                    System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\n" +
                            "I'm tired of making nested if statements.");
            }

        }


    }

}

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        askTheQuestion();
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

        if(input.equals("upstairs")){

        }


    }

}

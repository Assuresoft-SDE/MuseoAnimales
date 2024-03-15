import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleVisitor implements IConsole {
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void run() {
        boolean appRunning = true;
        System.out.println("What's your name? ");
        String visitorName = "";
        try {
            visitorName = input.readLine();
        } catch (IOException exc) {
        }
        System.out.println("Welcome to the museum " + visitorName + "!!");

        while (appRunning) {
            int optionValue = -1;
            System.out.println("You have this options: ");
            System.out.println("    1.- See all animals.");
            System.out.println("    2.- Search an animal by name.");
            System.out.println("    3.- Exit");
            System.out.print("Select one: ");
            try {
                optionValue = Integer.parseInt(input.readLine());
            } catch (IOException exc) {
            }
            switch (optionValue) {
                case 1:
                    System.out.println("Show all animals");
                    //show animals
                    break;
                case 2:
                    System.out.println("Search animal by name");
                    //search animal by name
                    break;
                case 3:
                    appRunning = false;
                    break;
                default:
                    System.out.println("Select one: ");
                    break;
            }
        }
    }
}






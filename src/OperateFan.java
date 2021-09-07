import java.util.Scanner;

public class OperateFan {
    private static String PULL = "p";
    private static String REVERSE = "r";
    private static String EXITCODE = "exit";

    public static void main(String[] args) {

        System.out.println("Pull cord by passing pull value : p");
        System.out.println("Reverse by passing reverse value : r");
        System.out.println("Exit by passing exit value : exit");

        Scanner input = new Scanner(System.in);
        while (input != null) {
            String inputStr = input.nextLine();
            if (inputStr.equals(EXITCODE)) {
                break;
            }
            System.out.println("You entered command string:  " + inputStr);
            applyFanFunction(inputStr);
        }

        input.close();
    }

    private static void applyFanFunction(String args) {
        String pullCord = "";
        Fan fan = new FanControlSwitch();


        if (args != null && args.equalsIgnoreCase(PULL)) {
            pullCord = PULL;
        } else if (args != null && args.equalsIgnoreCase(REVERSE)) {
            pullCord = REVERSE;
        }

        switch (pullCord) {
            case "p":
                fan.pullCord();
                break;
            case "r":
                fan.reverseDirection();
                break;
            default:
                System.out.println("Invalid Fan switch input");
                break;
        }
    }
}

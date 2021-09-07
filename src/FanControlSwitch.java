public class FanControlSwitch implements Fan {

    private static Integer speedControl = 0;
    private static boolean direction = true;

    @Override
    public void pullCord() {
        if (speedControl >= 3) {
            speedControl = 0;
        } else {
            speedControl++;
        }
        printStatement();
    }

    @Override
    public void reverseDirection() {
        if (direction) {
            direction = false;
        } else {
            direction = true;
        }
        printStatement();
    }

    private void printStatement() {
        System.out.println("Fan speed at " + speedControl);
        if (direction) {
            System.out.println("Fan direction mode " + "forward");
        } else {
            System.out.println("Fan direction mode " + "reverse");
        }
    }
}

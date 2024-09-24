public class TestTime {
    public static void main(String[] args) {
        // Create two Time objects
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        // Set times using set methods
        t1.setTime(21, 10, 15);
        t2.setTime(10, 20, 25);

        System.out.println("Initial times:");
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);

        // Call nextSecond() for t1 and previousSecond() for t2
        t1.nextSecond();
        t2.previousSecond();

        System.out.println("\nAfter nextSecond() for t1 and previousSecond() for t2:");
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
    }
}
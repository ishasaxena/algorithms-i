package i.course.intro;

public class HelloGoodbye {
    static void main(String[] args) {
        // Check if two arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide two strings as command-line arguments.");
            return;
        }

        String first = args[0];
        String second = args[1];

        System.out.println("Hello " + first + " and " + second + ".");
        System.out.println("Goodbye " + second + " and " + first + ".");
    }
}

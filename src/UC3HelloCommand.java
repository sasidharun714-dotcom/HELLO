public class UC3HelloCommand {

    public static void main(String[] args) {

        // If a name is given, use it.
        // Otherwise, use "World" as default.
        String name = (args.length > 0) ? args[0] : "World";

        System.out.println("Hello, " + name + "!");
    }
}
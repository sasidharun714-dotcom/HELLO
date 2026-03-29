public class UC5HelloCommand {

    public static void main(String[] args) {

        String names = "World";

        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            for (String name : args) {

                if (!first) {
                    nameBuilder.append(", ");
                }

                nameBuilder.append(name);
                first = false;
            }

            names = nameBuilder.toString();
        }

        System.out.println("Hello, " + names + "!");
    }
}
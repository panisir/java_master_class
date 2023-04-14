package e_oop_part_one.g_string;

public class StringBuilderUsage {
    /**
     * Java provides a mutable class that let us
     * change its text value
     * The StringBuilder class
     * <p>
     * There are 4 ways to create a String builder
     * object with the new keyword
     * (1) Pass a String
     * (2) Pass no arguments at all
     * (3) Pass an integer value
     * (4) Pass some other type of character sequence(lik StringBuilder)
     */
    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        /**
         * After executing concat method here
         * it creates one more object " and Goodbye" in Heap Memory
         * also it creates one more object of the result is
         * "Hello World And Goodbye"
         * So we have 3 objects created in Heap Memory
         *
         * An as you see the result of "helloWorld.concat(...)"
         * is ignored, because we did not assign it to new variable.
         *
         * !!! It is important to remember to assign the result,
         * of any String manipulation method you call
         *
         * String methods create a new object in memory, and return
         * a reference to this new object.
         * */
        helloWorld.concat(" and Goodbye");

        /**
         * After executing append method here
         * the variable helloWorldBuilder is still referencing the same object
         * but the value is changed.
         *
         * !!! This is important, because it means the character sequence in the
         * StringBuilder changed We do not have to assing the result to a new
         * object.
         *
         * StringBuilder methods return a StringBuilder reference, but
         * it's really a self-reference to support chaining methods together.
         *
         * */
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(40));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(150));

        printInformation(emptyStart);
        printInformation(emptyStart32);
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("Capacity = " + builder.capacity());
    }
}

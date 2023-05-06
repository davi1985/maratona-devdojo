package academy.devdojo.maratonajava.intro;

/**
 * Primitive Types -
 * int, double, float, char, byte, short, long, boolean.
 *
 * The Primitive Types receives numeric values, except the type boolean that it is receive true or false
 * The difference between them is the storage capacity
 */
public class Lesson02PrimitiveTypes {
    public static void main(String[] args) {
        int age = 37;
        double salary = 2500.00;
        float salaryFloat = 2500;
        char firstLetter = 'd';
        byte ageByte = 37;
        short ageShort = 10;
        long bigNumber = 10000000;
        boolean isMarried = true;

        System.out.println("My age is " + age + " years old");
    }
}

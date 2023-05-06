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
        int age = (int) 100000000000L;
        double salary = 2500.00;
        float salaryFloat = 2500.0F;
        char firstLetter = 'd';
        byte ageByte = 127;
        short ageShort = 32000;
        long bigNumber = (long) 25.5;
        boolean isMarried = true;

        System.out.println(age);
        System.out.println(bigNumber);
    }
}

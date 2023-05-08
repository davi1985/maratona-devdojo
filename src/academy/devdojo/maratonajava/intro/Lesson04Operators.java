package academy.devdojo.maratonajava.intro;

public class Lesson04Operators {
    public static void main(String[] args) {
        // =, +=, -=, /=, %=

        double bonus = 1800;
        bonus += 1000;

        System.out.println(bonus);

        int num1 = 10;
        num1 -= 2;

        System.out.println(num1);

        System.out.println(num1 *= 2);
        System.out.println(num1 /= 2);
        System.out.println(num1 %= 3);

        // increment, decrement
        System.out.println("pos incement" + num1++);
        System.out.println("pre incement" + ++num1);
        System.out.println("pos decrement" + num1--);
        System.out.println("pos decrement" + --num1);
    }
}

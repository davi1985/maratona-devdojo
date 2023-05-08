package academy.devdojo.maratonajava.intro;

public class Lesson04Operators {
    public static void main(String[] args) {
        // Math operators: %
        int numberOne = 10;
        int numberTwo = 20;

        int rest = 20 % 7;
        System.out.println(rest);

        // comparator operators: < > <= >= == != - always return boolean value
        boolean isNumberHigherThanOther = numberOne > numberTwo;
        boolean isNumberMinorThanOther = numberOne < numberTwo;
        boolean isNumberEqualsToOther = numberOne == numberTwo;
        boolean isFirstNumberIsEqual = numberOne == numberOne;
        boolean isNumberIsDifferentThanOther = numberOne != numberTwo;

        System.out.println("isNumberHigherThanOther: " + isNumberHigherThanOther);
        System.out.println("isNumberMinorThanOther: " + isNumberMinorThanOther);
        System.out.println("isNumberEqualsToOther: " + isNumberEqualsToOther);
        System.out.println("isFirstNumberIsEqual: " + isFirstNumberIsEqual);
        System.out.println("isNumberIsDifferentThanOther: " + isNumberIsDifferentThanOther);
    }
}

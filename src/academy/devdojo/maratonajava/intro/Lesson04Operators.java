package academy.devdojo.maratonajava.intro;

public class Lesson04Operators {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 20;

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

        // logic operators: &&(and), || (or), !(not)
        int age = 35;
        float salary = 3500F;
        boolean isInsideLowParameterHigherThanThirty = age > 30 && salary >= 4612.00;
        boolean isInsideLowParameterMinorThanThirty = age < 30 && salary > 3381.00;

        System.out.println(isInsideLowParameterHigherThanThirty);
        System.out.println(isInsideLowParameterMinorThanThirty);
    }
}

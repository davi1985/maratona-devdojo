package academy.devdojo.maratonajava.intro;

public class Lesson05Conditionals04 {
    public static void main(String[] args) {
        float[] salariesLevelAmount = {34712, 68507};
        double annualSalary = 70000;
        double taxLevelOne = 9.70 / 100;
        double taxLevelTwo = 37.75 / 100;
        double taxLevelThree = 49.58 / 100;

        double taxAmount;

        if (annualSalary <= salariesLevelAmount[0]) {
            taxAmount = annualSalary * taxLevelOne;
        } else if (annualSalary >= salariesLevelAmount[0] && annualSalary <= salariesLevelAmount[1]) {
            taxAmount = annualSalary * taxLevelTwo;
        } else {
            taxAmount = annualSalary * taxLevelThree;
        }

        System.out.println(taxAmount);
    }
}

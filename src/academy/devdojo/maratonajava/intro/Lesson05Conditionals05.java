package academy.devdojo.maratonajava.intro;

public class Lesson05Conditionals05 {
    public static void main(String[] args) {
        // show week day from user input - sunday is the first day

        byte userInputDay = 41;

        switch (userInputDay) {
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;

            default:
                System.out.println("Invalid");
                break;
        }

        char gender = 'M';

        switch (gender) {
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}

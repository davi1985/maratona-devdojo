package academy.devdojo.maratonajava.intro;

public class Lesson05Conditionals06 {
    public static void main(String[] args) {
        byte day = 1;

        switch (day) {
            case 1:
            case 7:
                System.out.println("weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Work day");
                break;

            default:
                System.out.println("Invalid");
        }
    }
}

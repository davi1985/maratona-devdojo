package academy.devdojo.maratonajava.intro;

public class Lesson05Conditionals02 {
    public static void main(String[] args) {
        // age < 15 - 'infantile', age >= 15 && age < 18 - 'juvenile', age >= 18 - 'adult'

        int age = 14;
        String category;

        if (age < 15) {
            category = "Infantile";
        } else if (age >= 15 && age < 18) {
            category = "Juvenile";
        } else {
            category = "Adult";
        }

        System.out.println(category);
    }
}

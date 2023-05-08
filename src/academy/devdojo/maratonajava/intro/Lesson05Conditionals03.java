package academy.devdojo.maratonajava.intro;

public class Lesson05Conditionals03 {
    public static void main(String[] args) {
        double salary = 6000.0;
        String sendContribution = "I will send 500.00 to DevDojo";
        String noSendContribution = "I do not have money enough";
        String result = salary > 500 ? sendContribution : noSendContribution;

        System.out.println(result);
    }
}

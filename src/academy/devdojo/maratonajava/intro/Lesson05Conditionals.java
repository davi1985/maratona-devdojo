package academy.devdojo.maratonajava.intro;

public class Lesson05Conditionals {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorized = age >= 18;

        if(isAuthorized) {
            System.out.println("Authorized");
        }

        if(!isAuthorized) {
            System.out.println("Not Authorized");
        }
    }
}

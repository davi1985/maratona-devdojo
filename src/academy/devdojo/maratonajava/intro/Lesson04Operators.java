package academy.devdojo.maratonajava.intro;

public class Lesson04Operators {
    public static void main(String[] args) {
        // logic operators: &&(and), || (or), !(not)
        double currentAccountTotalAmount = 200;
        double savingAccountTotalAmount = 10000;
        float playStationAmount = 5000F;

        boolean canBuyPlayStationFive = currentAccountTotalAmount > playStationAmount || savingAccountTotalAmount > playStationAmount;

        System.out.println("Can buy PlayStation 5 ? " + canBuyPlayStationFive);
    }
}

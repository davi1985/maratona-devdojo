package academy.devdojo.maratonajava.intro;

public class Lesson06RepetitionStructure05 {
    public static void main(String[] args) {
        double totalAmount = 30000.00;

        for (int installment = 1; installment <= totalAmount; installment++) {
            double installmentAmount = totalAmount / installment;

            if (installmentAmount < 1000) {
                break;
            }

            System.out.println("Installment: " + installment + String.format(" R$ %.2f",installmentAmount));
        }
    }
}


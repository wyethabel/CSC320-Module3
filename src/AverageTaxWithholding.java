import java.util.Scanner;

public class AverageTaxWithholding {

    public static void main(String[] args) {
        taxCalculation();
        taxCalculation();
        taxCalculation();
    }
    public static void taxCalculation() {
        Scanner inputEarnings = new Scanner(System.in);
        System.out.print("Please enter the weekly earnings.");
        double earnings = inputEarnings.nextDouble();
        double taxPercentage;
        if (earnings < 500) {
            taxPercentage = 0.10;
        } else if (earnings < 1500) {
            taxPercentage = 0.15;
        } else if (earnings < 2500) {
            taxPercentage = 0.20;
        } else {
            taxPercentage = 0.30;
        }
        double totalTax = earnings * taxPercentage;
        System.out.println("Total tax withholding for this week is: " + totalTax);
    }
}


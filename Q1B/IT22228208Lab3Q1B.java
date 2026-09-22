import java.util.Scanner;

public class IT22228208Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = scanner.nextDouble();

        double totalAmount = pricePerKg * kilograms;
        double discount = totalAmount * 10 / 100;
        double discountedAmount = totalAmount - discount;

        System.out.println("The total amount with 10% discount is: " + discountedAmount);

        scanner.close();
    }
}
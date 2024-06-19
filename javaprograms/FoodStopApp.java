package javaprograms;

import java.util.Scanner;

public class FoodStopApp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Welcome to Food Stop---");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        String gender = "";
        while (true) {
            System.out.print("Gender (male/female): ");
            gender = sc.nextLine().toLowerCase();

            if (gender.equals("male")) {
                System.out.println("Welcome Mr. " + name);
                break;
            } else if (gender.equals("female")) {
                System.out.println("Welcome Miss. " + name);
                break;
            } else {
                System.out.println("Invalid input. Please enter 'male' or 'female'.");
            }
        }

        double totalOrderCost = 0;
        char decision=0;

        do {
            System.out.println("Available Food Items: \n 1) Pizza\n 2) Burger\n 3) Cool Drink\n 4) Maggie\n 5) Mojitto");

            System.out.print("Enter ID of what you want: ");
            int productId = sc.nextInt();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            int cost = 0;
            double totalCost = 0, discount = 0;

            switch (productId) {
                case 1:
                    cost = 200;
                    discount = 0.05 * cost;
                    totalCost = cost * quantity - discount;
                    break;
                case 2:
                    cost = 150;
                    discount = 0.03 * cost;
                    totalCost = cost * quantity - discount;
                    break;
                case 3:
                    cost = 100;
                    discount = 0.0 * cost;
                    totalCost = cost * quantity - discount;
                    break;
                case 4:
                    cost = 80;
                    discount = 0;
                    totalCost = cost * quantity - discount;
                    break;
                case 5:
                    cost = 120;
                    discount = 0.06 * cost;
                    totalCost = cost * quantity - discount;
                    break;
                default:
                    System.out.println("Invalid product ID");
                    continue; 
            }

            System.out.println("Discount offered: " + discount * quantity);
            System.out.println("Total cost for this item: " + totalCost);

            totalOrderCost += totalCost;

            System.out.print("Enter Y to continue shopping, N to close: ");
            decision = sc.next().toLowerCase().charAt(0);

        } while (decision == 'y');

        System.out.println("Total cost is: " + totalOrderCost);
        System.out.println("Thanks for shopping with us !");

        sc.close();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruitList = new String[5];
        int[] fruitPrice = new int[5];

        System.out.println(" - SHOPPING LIST - ");
        System.out.println("We are doing a fruit salad. Please choose five fruits: ");
        for (int i = 0; i < fruitList.length; i++) {
            System.out.println("Fruit nr " + (i + 1) + ": ");
            fruitList[i] = scanner.next();
            scanner.nextLine();
        }

        System.out.println("Please write the fruit prices: ");
        for (int i = 0; i < fruitPrice.length; i++) {
            System.out.println("Price of fruit nr " + (i + 1) + ": ");
            fruitPrice[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int mostExpensiveFruit = fruitPrice[0];
        for (int i = 1; i < fruitPrice.length; i++) {
            if (fruitPrice[i] > mostExpensiveFruit) {
                mostExpensiveFruit = fruitPrice[i];
            }
        }

        int cheapestFruit = fruitPrice[0];
        for (int i = 1; i < fruitPrice.length; i++) {
            if (fruitPrice[i] < cheapestFruit) {
                cheapestFruit = fruitPrice[i];
            }
        }

        System.out.println("We have the following fruits and prices: ");
        for (int i = 0; i < fruitList.length; i++) {
            System.out.println((i + 1) + ": " + fruitList[i] + ", at " + fruitPrice[i] + " kr.");
        }

        for (int i = 0; i < fruitPrice.length; i++) {
            if (mostExpensiveFruit == fruitPrice[i]) {
                System.out.println("The most expensive fruit is: " + fruitList[i] + " at " + fruitPrice[i] + " kr.");
                break;
            }
        }
        for (int i = 0; i < fruitPrice.length; i++) {
            if (cheapestFruit == fruitPrice[i]) {
                System.out.println("The cheapest fruit is: " + fruitList[i] + " at " + fruitPrice[i] + " kr.");
                break;
            }
        }
    }
}

import java.util.Scanner;

public class MyMain {
    // Write a method that asks the user to input a double between 0.0 and 1000000.0
    // Your method should keep asking them until they type in a valid value
    // The method returns the final double they type in

    // scan.nextDouble() might be useful here
    public static double inputDouble() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a number between 0.0 and 1000000.0 : ");
        double initialNumber = scan.nextDouble();
        while (0.0 >= initialNumber && initialNumber >= 1000000.0){
            System.out.println("ERROR404: Please input a number between 0.0 and 1000000.0 : ");
            initialNumber = scan.nextDouble();
        }
        return initialNumber;
    }

    // Takes a double money as input and returns the number of quarters that we
    // can return in change
    // You should use a while loop!
    public static int numQuarters(double money) {
        int countQ = 0;
        while(money >= 0.25){
            money = money - 0.25;
            countQ = countQ + 1;
        }
        return countQ;
    }

    // Takes a double money as input and returns the number of dimes that we
    // can return in change
    // You should use a while loop!
    public static int numDimes(double money) {
        int countD = 0;
        while(money >= 0.10){
            money = money - 0.10;
            countD = countD + 1;
        }
        return countD;
    }

    // Takes a double money as input and returns the number of nickels that we
    // can return in change
    // You should use a while loop!
    public static int numNickels(double money) {
        int countN = 0;
        while(money >= 0.05){
            money = money - 0.05;
            countN = countN + 1;
        }
        return countN;
    }

    // Takes a double money as input and returns the number of pennies that we
    // can return in change
    // You should use a while loop!
    public static int numPennies(double money) {
        int countP = 0;
        while(money >= 0.01){
            money = money - 0.01;
            countP = countP + 1;
        }
        return countP;
    }

    public static void main(String[] args) {

        // Some code to test numQuarters
        System.out.println("\nnumQuarters tests:");
        System.out.println("1.25 in quarters would be: " + numQuarters(1.25) + " quarters."); // 5
        System.out.println("10.55 in quarters would be: " + numQuarters(10.55) + " quarters."); // 42
        System.out.println("1000000.20 in quarters would be: " + numQuarters(1000000.20) + " quarters."); //4000000

        // Some code to test numDimes
        System.out.println("\nnumDimes tests:");
        System.out.println("1.20 in dimes would be: " + numDimes(1.20) + " dimes."); // 12
        System.out.println("120.13 in dimes would be: " + numDimes(120.13) + " dimes."); //1201
        System.out.println("150.25 in dimes would be: " + numDimes(150.25) + " dimes."); //1502

    }
}
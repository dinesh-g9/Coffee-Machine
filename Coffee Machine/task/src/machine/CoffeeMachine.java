package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static int water = 400, milk = 540, beans = 120, cups = 9, money = 550;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loopCheck = true;
        while (loopCheck){
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            System.out.println();
            switch (action){
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    loopCheck = false;
                    break;
            }
        }
    }
    public static void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner input = new Scanner(System.in);
        String choice = input.next();
        switch (choice){
            case "1":
                if (water < 250)
                    System.out.println("Sorry, not enough water!");
                else if (beans < 16)
                    System.out.println("Sorry, not enough coffee beans!");
                else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 250;
                    beans -= 16;
                    money += 4;
                    cups -= 1;
                }
                break;
            case "2":
                if (water < 350)
                    System.out.println("Sorry, not enough water!");
                else if (milk < 75)
                    System.out.println("Sorry, not enough milk!");
                else if (beans < 20)
                    System.out.println("Sorry, not enough coffee beans!");
                else{
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    money += 7;
                    cups -= 1;
                }
                break;
            case "3":
                if (water < 200)
                    System.out.println("Sorry, not enough water!");
                else if (milk < 100)
                    System.out.println("Sorry, not enough milk!");
                else if (beans < 12)
                    System.out.println("Sorry, not enough coffee beans!");
                else{
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    money += 6;
                    cups -= 1;
                }
                break;
            case "back":
                return;
        }
    }
    public static void fill(){
        Scanner input = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
         water += input.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += input.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        beans += input.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += input.nextInt();
    }

    public static void take(){
        System.out.printf("I gave you $%d%n",money);
        money = 0;
    }
    public static void remaining(){
        System.out.printf("The coffee machine has:%n" +
                "%d of water%n" +
                "%d of milk%n" +
                "%d of coffee beans%n" +
                "%d of disposable cups%n" +
                "$%d of money%n",water,milk,beans,cups,money);
    }
}

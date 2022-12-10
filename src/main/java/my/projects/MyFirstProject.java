package my.projects;

import java.util.Scanner;

public class MyFirstProject {

        public static void main(String[] args) {

            String greeting = "Hi there!";
            System.out.println(greeting);


            System.out.println("Please enter your name:");
                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();
            System.out.println("Hi," + name + "! ");


            System.out.println("Please enter your hobby:");
                String hobby = scanner.nextLine();
            System.out.println("Your hobby is:" + hobby + ". That is really awesome hobby!");


            System.out.println("How old are you?");
                int myAge = scanner.nextInt();
                String result = (myAge < 30) ? "You are " + myAge + "! You are a young person full of energy!" : "You are " + myAge + " years old, but you look much younger!";
            System.out.println(result);


            System.out.println("Pick a number from 1 to 5 and see what comes up: ");
                int mySwitch2 = scanner.nextInt();
                switch (mySwitch2) {
                    case 1:
                        System.out.println("You will have a great day!");
                    break;

                    case 2:
                        System.out.println("Something good will happen to you today!");
                    break;

                    case 3:
                        System.out.println("Your day will be fabulous, just like you!");
                    break;

                    case 4:
                        System.out.println("Smile!");
                    break;

                    default:
                        System.out.println("Have a great day!");
            }

            System.out.println("Bye! See you soon!");

        }
    }


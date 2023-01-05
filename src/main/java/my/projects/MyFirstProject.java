package my.projects;

import java.util.Scanner;

public class MyFirstProject {

        public static void main(String[] args) {


            String[] start = {"Ready...",  "Steady...",  "Go!"};
                for (String b : start) {
            System.out.println(b);
            }

            String greeting = "Hi there!";
            System.out.println(greeting);


            for (int a = 1; a < 10; a++) {
                if (a == 4) {
                    break;

                }
                System.out.println(a + "...");
            }

            System.out.println("Let's start!");


            System.out.println("Please enter your full name:");
                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();
            System.out.printf("Hi, %s! Nice to meet you!\n", name);

            System.out.println("Please enter your last name:");
                char[] name1 = scanner.nextLine().toCharArray();
            System.out.println("Reversed your last name looks like this: ");
                for (int i = name1.length - 1; i >= 0; i--) {
            System.out.print(name1[i]);
            }

            System.out.println("\nPlease enter your phone:");
            long phone = Long.parseLong(scanner.nextLine());
            System.out.printf("Your phone is: %d. I'll try to remember it!\n", phone);


            System.out.println("Please enter your hobby:");
                String hobby = scanner.nextLine();
            System.out.println("Your hobby is:" + hobby + ". That is really awesome hobby!");

            System.out.println("Are you male or female?");
            String gender = scanner.nextLine();
            System.out.println("What color are your eyes?");
            String eyesColor = scanner.nextLine();

            switch (gender) {
                case "male":
                    switch (eyesColor) {
                        case "blue":
                            System.out.println("You a man with blue eyes. That is really awesome! ");
                            break;
                        case "green":
                            System.out.println("You a man with green eyes. That is really impressive! ");
                            break;
                        case "brown":
                            System.out.println("You a man with brown eyes. I like them very much! ");
                            break;
                        case "black":
                            System.out.println("You a man with black eyes. That is really cool! ");
                            break;
                        default:
                            System.out.println("You are a man with unique eyes!");
                    }
                    break;
                case "female":
                    switch (eyesColor) {
                        case "blue":
                            System.out.println("You a woman with blue eyes. That is really awesome! ");
                            break;
                        case "green":
                            System.out.println("You a woman with green eyes. That is really impressive! ");
                            break;
                        case "brown":
                            System.out.println("You a woman with brown eyes. I like them very much! ");
                            break;
                        case "black":
                            System.out.println("You a woman with black eyes. That is really cool! ");
                            break;
                        default:
                            System.out.println("You are a woman with unique eyes!");
                    }
                    break;
                default:
                    System.out.println("Well, That's odd! You are one of a kind!");
            }

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


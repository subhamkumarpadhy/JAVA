import java.util.Scanner;
import java.util.Random;

public class Practise_Ch4 {
    public static void main(String[] args) {
//        Question 1:
//        int a = 11;
//        if(a == 11){
//            System.out.println("I'm 11");
//        }

        // Question 2
//        byte m1, m2, m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in Physics");
//        m1 = sc.nextByte();
//
//        System.out.println("Enter your marks in Chemistry");
//        m2= sc.nextByte();
//
//        System.out.println("Enter your marks in Mathematics");
//        m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Your Overall percentage is: " + avg);
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations, You have been promoted");
//        }
//        else{
//            System.out.println("Sorry, You have not been promoted! Please try again.");
//        }

        // Question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in Lakhs per annum");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.5){
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income <= 5f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//
//        System.out.println("The total tax paid by the employee is: " + tax);

//        Question 4:

//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

//        Question 6
//        Scanner sc = new Scanner(System.in);
//        String website = sc.next();
//        if(website.endsWith(".org")){
//            System.out.println("This is an organizational website");
//        }
//        else if(website.endsWith(".com")){
//            System.out.println("This is a Commercial website");
//        }
//        else if(website.endsWith(".in")){
//            System.out.println("This is an Indian website");
//        }
                //Rock paper scisser game
//                System.out.println("Enter 0 for rock");
//                System.out.println("Enter 1 for paper");
//                System.out.println("Enter 2 for scissor");
//                Scanner sc = new Scanner(System .in);
//                System.out.print("Enter your output: ");
//                int user = sc.nextInt();
//                System.out.println();
//                System.out.println("Your output was: " + user);
//                // TO GENERATE RANDOM NUMBER
                Random random = new Random();
                int computer = random.nextInt(3);
//                System.out.println("Computer output was: " + computer);
//                System.out.println();
//
//                if(user == computer){
//                    System.out.println("DRAW");
//                }
//                else if(user == 0 && computer == 1){
//                    System.out.println("Computer won !!!");
//                }
//                else if(computer == 0 && user == 1){
//                    System.out.println("You won !!!");
//                }
//                else if(user == 1 && computer == 2){
//                    System.out.println("Computer won !!!");
//                }
//                else if(user == 2 && computer == 1){
//                    System.out.println("You won !!!");
//                }
//                else if(user == 0 && computer == 2){
//                    System.out.println("You won !!!");
//                }
//                else if(user == 2 && computer == 0){
//                    System.out.println("Computer won !!!");
//                }
//                else{
//                    System.out.println("Both the omds minds were same !!!");
//                }
        //Finding Leap year
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year ");
        int num = sc.nextInt();
        if (((num % 4 ==0) && (num % 100 != 0)) || (num % 400 ==0))
        {
            System.out.println("It is a leap year!!");
        }
        else
        {
            System.out.println("It is not a leap year!!");
        }
            }
        }
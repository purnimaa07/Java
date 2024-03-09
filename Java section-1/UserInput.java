import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        System.out.println("Taking user input.");
        //Reading datafrom the user - in order to read data from the user java has a scanner class
        Scanner scanner=new Scanner(System.in);
        int counter=0;

        System.out.println("What is your name");
        String name=scanner.nextLine();
        counter++;

        System.out.println("How much money do you spend in coffee?");
        double coffeePrice=scanner.nextDouble();
        counter++;

        System.out.println("How much money do you want to spend in fast food?");
        double fastfoodPrice=scanner.nextDouble();
        counter++;

        System.out.println("How many times in a week do you buy coffee?");
        int coffeeAmount=scanner.nextInt();
        counter++;

        System.out.println("How many times in a week do you buy fastfood?");
        int fastfoodAmount=scanner.nextInt();counter++;

        scanner.close();

        System.out.println("Thankyou "+ name +" for answering all "+ counter +" questions.");
        System.out.println("Weekly,you have spend Rs- "+ (coffeePrice*coffeeAmount) + " on coffee.");
        System.out.println("Weekly,you have spend Rs- "+ (fastfoodPrice*fastfoodAmount) + " on fast food");

    }
    
}

import java.util.Scanner;

public class StuMarkPercent {

    public static void main(String[] args) {
        System.out.println("Taking student's input for percentage calculation.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your 5 subjects marks out of 100.");

        System.out.println("Enter your Hindi mark");
        int a = scanner.nextInt();

        System.out.println("Enter your English mark");
        int b = scanner.nextInt();

        System.out.println("Enter your Science mark");
        int c = scanner.nextInt();

        System.out.println("Enter your Mathematics mark");
        int d = scanner.nextInt();

        System.out.println("Enter your Social mark");
        int e = scanner.nextInt();

        int mark = (a+b+c+d+e)/5;
        //The most important is to close your scanner used to reduce  leakage of data
        scanner.close();

        System.out.println(name + " your percentage is : " + mark+"%");







    }
    
}

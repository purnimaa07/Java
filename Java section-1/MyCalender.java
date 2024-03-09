import java.util.Scanner;

public class MyCalender {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week:");
        String day = sc.nextLine();
        switch(day){
            case "Monday" :
                         System.out.println("\nBusy");
                         break;
            case "Tuesday" :
                         System.out.println("\nMeeting");
                         break;
            case "Wednesday" :
                         System.out.println("\nAppointment");
                         break; 
            case "Thrusday" :
                         System.out.println("\nDate night");
                         break;
            case "Friday" :
                         System.out.println("\nFree");
                         break;
            case "Saturday" :
                         System.out.println("\nMe time");
                         break;
            case "Sunday" :
                         System.out.println("\nFamily time");
                         break; 
            default:
                   System.out.println("\nYou can enjoy!");                                                                                       
        }
       sc.close();
    }
    
}

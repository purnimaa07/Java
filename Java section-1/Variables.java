public class Variables {
    
    public static void main(String[] args) {
        // integer - 4 bytes
        int passengers=7;
        System.out.println(passengers);
        int busTickets=passengers;
        System.out.println(busTickets);
        passengers-=4;
        System.out.println(passengers);

        // string - varies in data type
        int year=2010;
        String winner="India";
        String announcement="The winner of "+ year + " world cup is "+ winner ;
        System.out.println(announcement);
        }
}

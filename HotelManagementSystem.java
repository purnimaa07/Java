import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Booking {
    private int bookingID;
    private String bookingDate;
    private int duration;

    public Booking(int bookingID, String bookingDate, int duration) {
        this.bookingID = bookingID;
        this.bookingDate = bookingDate;
        this.duration = duration;
    }

    public int getBookingID() {
        return bookingID;
    }
}

class Customer {
    private String name;
    private String address;
    private String paymentMethod;
    private int customerID;
    private List<Booking> bookings;

    public Customer(String name, String address, String paymentMethod, int customerID) {
        this.name = name;
        this.address = address;
        this.paymentMethod = paymentMethod;
        this.customerID = customerID;
        this.bookings = new ArrayList<>();
    }

    public void bookRoom(int bookingID, String bookingDate, int duration) {
        Booking booking = new Booking(bookingID, bookingDate, duration);
        bookings.add(booking);
        System.out.println("Booking successful!");
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }
}

class Room {
    private int roomNumber;
    private String roomType;
    private boolean isOccupied;

    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isOccupied = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void checkIn() {
        isOccupied = true;
    }

    public void checkOut() {
        isOccupied = false;
    }
}

class HotelManager {
    private List<Customer> customers;
    private List<Room> rooms;

    public HotelManager() {
        this.customers = new ArrayList<>();
        this.rooms = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void checkInCustomer(int customerID, int roomNumber) {
        Customer customer = findCustomerById(customerID);
        Room room = findRoomByNumber(roomNumber);

        if (customer != null && room != null && !room.isOccupied()) {
            room.checkIn();
            System.out.println(customer.getName() + " checked into room " + roomNumber);
        } else {
            System.out.println("Check-in failed. Please check customer and room details.");
        }
    }

    public void checkOutCustomer(int roomNumber) {
        Room room = findRoomByNumber(roomNumber);

        if (room != null && room.isOccupied()) {
            room.checkOut();
            System.out.println("Check-out completed for room " + roomNumber);
        } else {
            System.out.println("Check-out failed. Room " + roomNumber + " is not occupied.");
        }
    }

    private Customer findCustomerById(int customerID) {
        for (Customer customer : customers) {
            if (customer.getCustomerID() == customerID) {
                return customer;
            }
        }
        return null;
    }

    private Room findRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
}

public class HotelManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelManager hotelManager = new HotelManager();

        // Adding customers and rooms for demonstration purposes
        Customer customer1 = new Customer("John Doe", "123 Main St", "Credit Card", 1);
        Customer customer2 = new Customer("Jane Smith", "456 Oak St", "Cash", 2);
        hotelManager.addCustomer(customer1);
        hotelManager.addCustomer(customer2);

        Room room1 = new Room(101, "Standard");
        Room room2 = new Room(102, "Deluxe");
        hotelManager.addRoom(room1);
        hotelManager.addRoom(room2);

        // Customer booking a room
        customer1.bookRoom(1, "2024-03-09", 3);

        // Manager checking in a customer
        hotelManager.checkInCustomer(1, 101);

        // Manager checking out a customer
        hotelManager.checkOutCustomer(101);

        scanner.close();
    }
}

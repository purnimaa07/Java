class Car{
   private String make;
   private int year;
   private double price;
   private String color;
  

   public Car(String make,int year,double price,String color){
      this.make = make;
      this.year = year;
      this.price = price;
      this.color = color;
    }
//using getters method to access the private fields of the class Car
    public String getmake(){
      return make;
    }

    public int getyear(){
      return year;
    }

    public double getprice(){
      return price;
    }

    public String getcolor(){
      return color;
    }

    public void setprice(double price){
      this.price = price;
    }
  }
 public class Main{   
 public static void main(String[]args){
  
        Car Tesla = new Car("Tesla",2023,20000,"Magenta");
        Car MercedesBenz = new Car("MercedesBenz",2024,50000000,"Grey");
        Tesla.setprice(7700);
        System.out.println("This "+ Tesla.getmake() + " is worth: $"+Tesla.getprice() +".It was built in " + Tesla.getyear() + ".It is of " + Tesla.getcolor() + " color.\n");
   
      }
  }







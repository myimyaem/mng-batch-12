package Task;

public class Task11_11 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyata","Camry",2022,4);
        // car1.setMake("Toyata");
        // car1.setModel("Camry");
        // car1.setYear(2022);
        // car1.setNumberOfDoors(4);
        Car car2 = new Car("Porsche","911 gt3",2024,2);
        
        System.out.println("Car Details:");
        car1.displayDetails();
        car2.displayDetails();
    }
    
}
class Car extends Vehicle{
    Car(String make, String model, int year,int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
        
    }
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    void displayDetails(){
        System.out.println("Make: "+getMake()+"\nModel: "+getModel()+"\nYear: "+getYear()+"\nNumber of Doors: "+this.numberOfDoors+"\n");
    }

}

class Vehicle{
    Vehicle(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;

    }
    private String make;
    private String model;
    private int year;

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
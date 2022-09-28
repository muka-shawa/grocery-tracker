public class Computer {

    //object properties aka instance variables aka fields
    private String make;
    private String model;
    double price;
    private int memory;

    //getter methds allow us to access this data in the other files
    public String getMake(){
        return make;
    }

    public String getModel() {
        return modle;
    }

    public double getPrice() {
        return price;
    }

    public int getMemory() {
        return memory;
    }

    //CONSTRUCTOR will build the object (prefer field injection)
    public Computer (String make, String model, double price, int memory){

    }
}

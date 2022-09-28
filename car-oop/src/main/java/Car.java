public class Car {

    private String make;
    private String model;
    private String color;
    private int mpg;

    //public getter methods allow access to the private properties
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMpg() {
        return mpg;
    }

    //CONSTRUCTor takes the object properties and builds the object
    // Industry standard: Constructor injection: controlling the data thru the constructor
    public Car(String make, String model, String color, int mpg){
      this.model = make;
      this.model = model;
      this.color = color;
      this.mpg = mpg;
    }

    //method of behaviour performs some action on the object
    public void accelerate(){
        System.out.println(this.make + " " +this.model + " is accelerating");
        this.mpg -=2;
    }
}

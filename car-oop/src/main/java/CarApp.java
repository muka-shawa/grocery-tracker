public class CarApp {

    public static void main(String[] args) {

        // CONSTRUCTor injection to create our cars
        Car mustang = new Car( "Ford","Mustang", "Red", 12);
        Car camaro = new Car("Chevy", " Camaro", "black",14);
        Car tesla = new Car("Tesla", "S","White",1000);

        System.out.println("The most fuel efficient car is");
        System.out.println(tesla.getMake() + " " + tesla.getModel());

        System.out.println("lets accelerate the" + mustang.getMake() + " " + mustang.getModel());
        System.out.println("The current mpg is:" + mustang.getMpg());
        mustang.accelerate();
        System.out.println("Mpg after accleration is:" + mustang.getMpg());


    }
}


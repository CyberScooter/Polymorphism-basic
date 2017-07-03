

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car( int cylinders, String name ) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }
    public String startEngine(){
        return "Car engine is starting";
    }

    public String accelerate(){
        return "Car is accelerating";
    }
    public String brake(){
        return "Car brakes are being applied";
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
}
class Mercedes extends Car{
    public Mercedes(int cylinders, String name) {
        super(cylinders, name);
    }
    //polymorphism is used here as an method has been overidden from the superclass to the subclass but in a different form
    @Override
    public String startEngine() {
        return "Mercedes engine is starting";
    }

    @Override
    public String accelerate() {
        return "Mercedes is accelerating";
    }

    @Override
    public String brake() {
        return "Mercedes brakes are being applied";
    }
}

class rollsRoyce extends Car{
    public rollsRoyce(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Rolls royce engine is starting";
    }

    @Override
    public String accelerate() {
        return "Rolls royce is accelerating";
    }

    @Override
    public String brake() {
        return "Rolls royce brakes are being applied";
    }
}
class lambourgini extends Car{
    public lambourgini(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Lambourgini engine is starting";
    }

    @Override
    public String accelerate() {
        return "Lambourgini is accelerating";
    }

    @Override
    public String brake() {
        return "Lambourgini brakes are being applied";
    }
}


public class Main {
    public static void main(String[] args){

        Car myCar = new Car(10, "myCar");
        System.out.println(myCar.accelerate());
        System.out.println(myCar.brake());
        System.out.println(myCar.startEngine());

        lambourgini myLambourgini = new lambourgini(15, "Lambourgini");
        System.out.println(myLambourgini.accelerate());
        System.out.println(myLambourgini.brake());
        System.out.println(myLambourgini.startEngine());

        rollsRoyce myRollsRoyce = new rollsRoyce(20, "Rolls Royce");
        System.out.println(myRollsRoyce.accelerate());
        System.out.println(myRollsRoyce.brake());
        System.out.println(myRollsRoyce.startEngine());


    }

}

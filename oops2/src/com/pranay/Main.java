package com.pranay;

// class Car {
//    private boolean engine;
//    private int cylinders;
//    private String name;
//    private int wheels;
//
//    public Car( int cylinders, String name) {
//        this.engine = true;
//        this.cylinders = cylinders;
//        this.name = name;
//        this.wheels = 4;
//    }
//
//    public String startEngine(){
//        return getClass().getSimpleName() +  "=> Engine Starting";
//    }
//
//    public String accelerate(){
//        return getClass().getSimpleName() +  "=> Car Accelerating" ;
//    }
//
//    public String brake(){
//        return  getClass().getSimpleName() +  "=> Car Braking";
//    }
//
//
//    public int getCylinders() {
//        return cylinders;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//}
//
//
//class Mitsubishi extends Car{
//    public Mitsubishi(int cylinder, String name) {
//        super(cylinder, name);
//    }
//
//    @Override
//    public String startEngine(){
//        return getClass().getSimpleName() +  "=> Engine Starting";
//    }
//    @Override
//    public String accelerate(){
//        return getClass().getSimpleName() +  "=> Car Accelerating";
//    }
//
//    @Override
//    public String brake(){
//        return  getClass().getSimpleName() +  "=> Car Braking";
//
//    }
//
//}
//class Ford extends Car{
//    public Ford(int cylinder, String name) {
//        super(cylinder, name);
//    }
//
//    @Override
//    public String startEngine(){
//        return getClass().getSimpleName() +  "=> Engine Starting";
//
//    }
//    @Override
//    public String accelerate(){
//        return getClass().getSimpleName() +  "=> Car Accelerating";
//    }
//
//    @Override
//    public String brake(){
//        return  getClass().getSimpleName() +  "=> Car Braking";
//
//    }
//
//}
//
//class Holden extends Car{
//    public Holden(int cylinder, String name) {
//        super(cylinder, name);
//    }
//
//    @Override
//    public String startEngine(){
//        return getClass().getSimpleName() +  "=> Engine Starting";
//
//    }
//    @Override
//    public String accelerate(){
//        return getClass().getSimpleName() +  "=> Car Accelerating";
//    }
//
//    @Override
//    public String brake(){
//        return  getClass().getSimpleName() +  "=> Car Braking";
//
//    }
//
//}
//
//

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Resolution resolution = new Resolution(1280, 1080);
//        Monitor monitor = new Monitor( "24 UCB", "LG Ultragear", 32, resolution );
//        Motherboard motherboard = new Motherboard("ABC", "GG", "Asus", 4, 8);
//        Case theCase = new Case( "Acer","GG4", "44W", new Dimensions(3, 7,3) );
//
//        PC newPc = new PC(motherboard, monitor, theCase);
//
//        newPc.powerUp();

//        Bed bed = new Bed("King", new Dimensions(12, 6, 3), "Soft", 3);
//        Table table = new Table( new Dimensions(7, 4, 0),true);
//        Cupboard cupboard = new Cupboard(4, 6, 3, 2);
//
//        House home = new House(bed, cupboard, table);
//
//        home.goToSleep();


//        Printer printer = new Printer(100, true, 0);
//        printer.printPage(120);
//        printer.printPage(12);
//
//        System.out.println(printer.getTonerLevel());
//        System.out.println(printer.getPagesPrinted());

//        Car car = new Car(8, "Base Car");
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());
//
//
//        Mitsubishi mitsubishi = new Mitsubishi(14, "Subaro");
//        System.out.println(mitsubishi.startEngine());
//        System.out.println(mitsubishi.accelerate());
//        System.out.println(mitsubishi.brake());
//
//        Ford ford = new Ford(8, "Mustang");
//        System.out.println(ford.startEngine());
//        System.out.println(ford.accelerate());
//        System.out.println(ford.brake());
//
//        Holden holden = new Holden(3, "IDK");
//        System.out.println(holden.startEngine());
//        System.out.println(holden.accelerate());
//        System.out.println(holden.brake());

        Hamburger hamburger = new Hamburger("Basic","white", "Sausage", 3.56 );

        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato", 0.37);
        hamburger.addHamburgerAddition2("lettuce", 0.23);
        hamburger.addHamburgerAddition3("Cheese", 0.51);


        System.out.println("Total Price of Burger is : "+ hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("bacon", 5.50);
        healthyBurger.addHealthyAddition1("Egg", 1.50);
        healthyBurger.addHealthyAddition2("lettuce", .50);

        System.out.println("Total Price of Burger is : "+ healthyBurger.itemizeHamburger());



    }

}

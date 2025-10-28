package frc.robot;

public class Vehicle {
    /* Exercise 1:
     * Create a Vehicle class and print objects for it. This should include some variables such as
     *      -Current Gallons of Gas
     *      -Mileage
     *      -Passengers
     *      -X position
     *      -Y position
     *      -Current Direction (north, east, south, west)
     *      -Brand
     *      -Parked or not (use a boolean)
     * 
     * You must create some functions as well that will be explained later in the file.
     * At the end, add a psvm and print out some things to prove your functions work. you must do this
     * using objects since your variables are no longer static
     */

    private double gallons;
    private double mileage;
    private int passengers;
    private double xPosition;
    private double yPosition;
    private String direction;
    private String brand;
    private boolean parked;

    /*
    * Constructor
    * Create a constructor that initializes all your variables using parameters
    */
    public Vehicle(int gallons, int mileage, int passengers, double xPosition, double yPosition, String direction, String brand, boolean parked) {
        this.gallons = gallons;
        this.mileage = mileage;
        this.passengers = passengers;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
        this.brand = brand;
        this.parked = parked;
    }



    /*
     * turnRight
     * changes your direction to the right of what it is now
     * decide if you need parameters and how this will work
    */

    public void turnRight() {
        if(direction.equals("south")) {
            direction = "west";
        } else if(direction.equals("west")) {
            direction = "north";
        } else if(direction.equals("north")) {
            direction = "east";
        } else if(direction.equals("east")) {
            direction = "south";
        } else {
            System.out.println("Invalid Direction, please set direction");
        }
    }


    /* 
     * turnLeft 
     * same thing as above function but opposite direction
    */

    public void turnLeft() {
        if(direction.equals("south")) {
            direction = "east";
        } else if(direction.equals("west")) {
            direction = "south";
        } else if(direction.equals("north")) {
            direction = "west";
        } else if(direction.equals("east")) {
            direction = "north";
        } else {
            System.out.println("Invalid Direction, please set direction");
        }
    }

 
    /*
     * move
     * move forward or backwards (depending on negative or positive) by updating coordinates
     * must use parameter (parameter in unit of miles). this function needs to also be accurate to current direction
     * north = positive y, east = positive x, south = negative y, west = negative x
     * you also cannot move when parked or out of gas so both of those need to be up to date
     * you must send an alert if you are out of gas or run out of gas during the movement
    */

    public void move(int miles) {
        if(!parked && (miles * mileage) > gallons) {
            if(direction.equals("south")) {
                yPosition -= miles;
            } else if(direction.equals("west")) {
                xPosition -= miles;
            } else if(direction.equals("north")) {
                yPosition += miles;
            } else if(direction.equals("east")) {
                xPosition += miles;
            } else {
                System.out.println("Invalid Direction, please set direction");
            }
        } else if(parked) {
            System.out.println("You are parked so you cannot move");
        } else {
            System.out.println("Invalid Direction, please set direction");
        }
    }

    /*
     * getXCoordinate
     * return X coordinate
    */

    public double getXCoordinate() {
        return xPosition;
    }


    /*
     * getYCoordinate
     * return Y coordinate
    */

    public double getYCoordinate() {
        return yPosition;
    }

        
    /*
     * getRange
     * return the amount of miles you can go without refilling gas
    */

    public double getRange() {
        return gallons / mileage;
    }

        
    /*
     * refillGas
     * refill the gas by certain amount of gallons
    */

    public void refillGas(double gallons) {
        this.gallons = this.gallons + gallons;
    }


    /*
     * getBrand
     * return the brand
    */

    public String getBrand() {
        return brand;
    }


    /*
     * getPassengers
     * return amount of passengers
    */

    public int getPassengers() {
        return passengers;
    }

    /*
     * setPassengers
     * set the amount of passengers
    */

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    /*
     * isParked
     * return if vehicle is parked or not
     */

    public boolean isParked() {
        return parked;
    }

    
    /*
     * setParked
     * set whether parked or not
     */

    public void setParked(boolean parked) {
        this.parked = parked;
    }
}

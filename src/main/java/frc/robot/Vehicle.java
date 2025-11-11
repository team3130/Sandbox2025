package frc.robot;

import java.time.temporal.ValueRange;

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
    private int gallons;
    private int mileage;
    private int passengers;
    private double x;
    private double y;
    private String currentDirection;
    private String brand;
    private boolean parked;
    
    public static void main(int gallons,int mileage,int passengers,double x,double y,String currentDirection,String brand,boolean parked) {
        System.out.println(gallons);
        System.out.println(mileage);
        System.out.println(passengers);
        System.out.println(x);
        System.out.println(y);
        System.out.println(currentDirection);
        System.out.println(brand);
        System.out.println(parked);
    }


    /*
    * Constructor
    * Create a constructor that initializes all your variables using parameters
    */
    public Vehicle(int gallons,int mileage,int passengers,double x,double y,string currentDirection,string brand,boolean parked) {
        this.gallons = gallons;
        this.mileage = mileage;
        this.passengers = passengers;
        this.x = x;
        this.y = y;
        this.currentDirection = currentDirection;
        this.brand = brand;
        this.parked = parked;
    }



    /*
     * turnRight
     * changes your direction to the right of what it is now
     * decide if you need parameters and how this will work
    */
    public void turnRight(String currentDirection) {
        if (currentDirection.equals("south")) {
            currentDirection = "west";
        }
        else if (currentDirection.equals("west")) {
            currentDirection = "north";
        }
        else if (currentDirection.equals("north")) {
            currentDirection = "east";
        }
        else if (currentDirection.equals("east")) {
            currentDirection = "south";
        }
        else {
        System.out.println("Invalid Direction, please set valid direction");
        }
    }


    /* 
     * turnLeft 
     * same thing as above function but opposite direction
    */
    public void turnLeft(String currentDirection) {
        if (currentDirection.equals("south")) {
            currentDirection = "east";
        }
        else if (currentDirection.equals("west")) {
            currentDirection = "south";
        }
        else if (currentDirection.equals("north")) {
            currentDirection = "west";
        }
        else if (currentDirection.equals("east")) {
            currentDirection = "north";
        }
        else {
            System.out.println("Invalid Direction, please set valid direction");
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
    public void move(int mileage) {
        if(!parked && (miles * mileage) > gallons) {
            if(currentDirection.equals("south")) {
                y -= miles;
            } else if(currentDirection.equals("west")) {
                x -= miles;
            } else if(currentDirection.equals("north")) {
                y += miles;
            } else if(currentDirection.equals("east")) {
                x += miles;
            } else {
                System.out.println("Invalid Direction, please set valid direction");
            }
        } else if(parked) {
            System.out.println("You are parked and cannot move");
        } else {
            System.out.println("Invalid Direction, please set valid direction");
        }
    }
    
    

    /*
     * getXCoordinate
     * return X coordinate
    */
    public double getXCoordinate() {
        return x;
    }

    /*
     * getYCoordinate
     * return Y coordinate
    */
    public double getYCoordinate() {
        return y;
    }

        
    /*
     * getRange
     * return the amount of miles you can go without refilling gas
    */
    public double getRange() {
        return gallons/mileage;
    }
        
    /*
     * refillGas
     * refill the gas by certain amount of gallons
    */
    public void refillGas(double gallonsrefilled) {
        gallons += gallonsrefilled;
    }

    /*
     * getBrand
     * return the brand
    */
    public double getBrand() {
        return brand;
    }

    /*
     * getPassengers
     * return amount of passengers
    */
    public double getPassengers() {
        return passengers;
    }

    /*
     * setPassengers
     * set the amount of passengers
    */
    public void setPassengers(int newPassengers) {
        passengers = newPassengers;
    }

    /*
     * isParked
     * return if vehicle is parked or not
     */
    public double isParked() {
        return parked;
    }
    
    /*
     * setParked
     * set whether parked or not
     */
    public void setParked(boolean newParked) {
        parked = newParked;
    }
}

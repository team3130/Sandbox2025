package frc.robot;

import javax.sound.sampled.SourceDataLine;

import edu.wpi.first.wpilibj2.command.sysid.SysIdRoutine;

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

    /*
    * Constructor
    * Create a constructor that initializes all your variables using parameters
    */
     

        private int gallons;
        private int mileage;
        private int people;
        private double xPosition;
        private double yPosition;
        private String cardinalDirection;
        private String brand;
        private boolean parked;

        public Vehicle(int gallons, int mileage, int people, double xPosition, double yPosition, String cardinalDirection, String brand, boolean parked) {
        //constructor
        this.gallons = gallons;
        this.mileage = mileage;
        this.people = people;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.cardinalDirection = cardinalDirection;
        this.brand = brand;
        this.parked = parked;
        }
    public void printInfo() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
    }


    /*
     * turnRight
     * changes your direction to the right of what it is now
     * decide if you need parameters and how this will work
    */
    public void turnRight() {
        if (cardinalDirection.equals("south") = 0) {
            cardinalDirection = "west";
        } else if(cardinalDirection.equals("north") = 0) {
            cardinalDirection = "east";
        } else if(cardinalDirection.equals("east") = 0) {
            
        }
    }

    /* 
     * turnLeft 
     * same thing as above function but opposite direction
    */

 
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

        }
    }

    /*
     * getXCoordinate
     * return X coordinate
    */

    public double getxCoordinate() {
        return xPosition;
    }

    /*
     * getYCoordinate
     * return Y coordinate
    */

        
    /*
     * getRange
     * return the amount of miles you can go without refilling gas
    */

        
    /*
     * refillGas
     * refill the gas by certain amount of gallons
    */


    /*
     * getBrand
     * return the brand
    */


    /*
     * getPassengers
     * return amount of passengers
    */


    /*
     * setPassengers
     * set the amount of passengers
    */


    /*
     * isParked
     * return if vehicle is parked or not
     */

    
    /*
     * setParked
     * set whether parked or not
     */
}

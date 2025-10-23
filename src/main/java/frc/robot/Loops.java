package frc.robot;
import java.util.Scanner;

public class Loops {
    /* Exercise 1
     * Use a while loop and a for loop to recreate the exponent function
     * using 2 inputs. Note there is no code already here. It is
     * up to you to create everything from variables to psvm to
     * scanner
     * 
     * Exercise 2
     * use a nested loop with both while loops and for loops to ask for an input
     * and make sure it is present. The for loop should act to emulate the exponent function
     * same as before
     */
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        double base = s.nextDouble();
        System.out.println("You entered "+base+" as your base");
        System.out.println("Enter the exponent number: ");
        double exponent = s.nextDouble();
        System.out.println("You entered "+exponent+" as your exponent");

        
    }
}

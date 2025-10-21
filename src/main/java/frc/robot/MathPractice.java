package frc.robot;

public class MathPractice {
    /* Exercise 1
    Write mathematical equations and store them in variables.
    When you run this file at first, it will print a list of numbers
    and a mathematical operation beside each of them. Write an equation
    using the mathematical operation specified to get the answer.
    One example is given.
    Solve below and feel free to print your answers to check
     */

    public static double twoSquared = Math.pow(2, 2);
    




    /* Exercise 2: Challenge Problem
    Lets say you have a sensor that tracks the rotations of a
    motor (known as an encoder). This motor is used for aiming and therefore
    you want to know the degrees at which it is aiming, but the motor starts at 0
    and keeps increasing past 360 degrees. The motor can reach 450 degrees which is
    the same as 90 but harder to understand. Your goal is to take in a number in degrees
    and do some sort of math operations on it to make it so that it is always between
    0 and 360 degrees. You can assume the value given will always be positive. I will
    provide a random number for you to use that is assumed to be positive but feel free
    to solve this using whatever test cases you like.
    Solve below and feel free to print your answers to check
     */
    public static double randomPositiveDouble = (Math.random()) * 10000; //any number from 0 - 10000





    /* Exercise 3: Harder Challenge Problem
    If you solved Exercise 2 and thought it was too easy, try this one. We are in
    the same situation as exercise 2 with the motor and the encoder, except this time
    we have a different range. In the robot code it is most intuitive to keep your angle
    measurements in a range of -180 to 180 degrees so you can think about -90 and 90 as
    opposites easily versus having to remember 270 and 90 as opposites. Try to make new code
    to take in a value of degrees and make it in the range of -180 to 180 and this time you
    cannot assume the input value will be positive. I will provide a random number for you to
    use but feel free to solve this using whatever test cases you like.
    Solve below and feel free to print your answers to check
     */
    public static double randomDouble = (Math.random() - 0.5) * 20000; //any number from -10000 to 10000





    public static void main(String[] args) {
        System.out.println("Exercise 1: ");
        System.out.println("Desired Answer : Mathematical Operation");
        System.out.println(Math.pow(2,2)); //answ 4

        System.out.println(25 + 10); //answ:35
        System.out.println(Math.sqrt(49)); //answ:7 ...sqrt is square root
        System.out.println(50 + 55); //answ:105
        System.out.println(25 / 5); //answ:5
        System.out.println(11 / 2); //answ:5.5
        System.out.println(6 + " : Modulus / Remainder");
        System.out.println(8 * 4); //answ:32
        System.out.println(Math.abs(-135-100));; //answ:235 ...abs is absolute value

        System.out.println("--------------------------------------------");

        System.out.println("Exercise 2: ");
        System.out.println(randomPositiveDouble%360);

        System.out.println("--------------------------------------------");

        System.out.println("Exercise 3: ");
        System.out.println("Random Input: " + randomDouble + " degrees");

    }
}

package frc.robot;

public class VariablesAndComments {
    //Welcome to the first exercise in the 2025 Software Lessons

    /*
    Exercise 1: Comments

    A Multi-Line comment have already been demonstrated here,
    but I want you to try and create at least 1 multi-line comment
    and at least 1 single line comment
    */

    /*Single Line comment under this line*/
 //Comments are so cool


    /*Multi-line comment under this line*/

    /* comments are kinda
    amazing
    */

    /*
    Exercise 2: Variables

    1 variable has been demonstrated for you. This shows some syntax
    and Camel Case which is important in convention. Now Make one of each type of variables.
    Make sure to have your variables as static for now.
    Later this will change

     */

    public static int randomNum = 1;
    //Variables under this line

    public static double randomDouble = 0.1;
    public static String motorName = "Falcon";
    public static boolean limitReached = true;


    //This is psvm and will be used to print out your variable values.
    //try to print out your variables and their values. Make sure you
    //are not just printing a random value and give some context.
    //One example is provided

    public static void main(String[] args) {
        System.out.println("This is a random number: " + randomNum);
        System.out.println("This is a random double number: " + randomDouble);
        System.out.print("Blah Blah");
        System.out.print("Blah Blah 2");
    }
}

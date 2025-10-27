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

   //Exercise 1 Variables
   public static double input1 = 0;
   public static double input2 = 0;
   public static double total = 1;

   //Exercise 2 Variables
   public static double input3 = 0;
   public static double input4 = 0;
   public static double total2 = 1;


   public static void main(String[] args) {
      // Exercise 1 Solution
      Scanner s = new Scanner(System.in);
      System.out.println("Please enter 2 non-zero inputs in base, exponent order");
      System.out.print("Base: ");
      input1 = s.nextDouble();
      System.out.print("Exponent: ");
      input2 = s.nextDouble();

      for(int i = 0; i < input2; i++) {
         total = total * input1;
      }
      System.out.println(input1 + " to the power of " + input2 + " : " + total);

      // Exercise 2 Solution
      System.out.println("Please enter 2 non-zero inputs in base, exponent order");
      System.out.print("Base: ");
      input3 = s.nextDouble();
      System.out.print("Exponent: ");
      input4 = s.nextDouble();

      while(input3 == 0.0 || input4 == 0.0) {
         System.out.println("Invalid Entry: one or more inputs are 0");
         System.out.println("Try again, please enter 2 non-zero inputs");
         System.out.print("Base: ");
         input3 = s.nextDouble();
         System.out.print("Exponent: ");
         input4 = s.nextDouble();
      }
      for(int i = 0; i < input4; i++) {
         total2 = total2 * input3;
      }
      System.out.println(input3 + " to the power of " + input4 + " : " + total2);
     }
}

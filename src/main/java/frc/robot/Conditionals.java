package frc.robot;
import java.util.Scanner;

public class Conditionals {
    //Read everything carefully. What you print is up to you as long as you print the answer in a readable format

    /* Exercise 1
     * Write an if-else statement that selects either
     * Large, Normal, or Small based off of the class size you give.
     * Large Class: more than 50 students
     * Medium Class: 15-50 students (inclusive)
     * Small Class: less than 15 students*/

      
    /*  * Challenge Exercise 1
     * You are free to edit anything you want now for this exercise and are encouraged to do so.
     * I have provided logic on how to get keyboard input and use variables, 
     * use that to complete this exercise. Edit your solution from earlier and
     * add variables as needed for this exercise. 
     * Schools typically size their classes based on how many teachers
     * are present in that class. Ask for input for how many teachers are present.
     * The class type is now determined based on how many students per teacher on average.
     * The values for each range are the same but instead of total students it is students
     * per teacher. For example you could print out:
     *      Total Students: 30
     *      Total Teachers: 5
     *      You have a small class
     */ 
    

     /* Challenge Exercise 2
     * You are free to edit anything you want now for this exercise and are encouraged to do so.
     * The last one was somewhat easy so now let's make it a little difficult.
     * Comparisons can be used for strings as well which can be used in conditionals.
     * A word that is before another in alphabetical order is "less than" the other.
     * (It is weird to say "cat" < "dog" but it works because technically chars are number representations)
     * Now you need to change your variables and solution from previous exercises. You have 3 teachers in 
     * your classroom now. You still need to ask for input for how many students you want, but instead of
     * asking for how many teachers, you will ask for each of the 3 teacher's names. Now you need to make 3
     * print statements and each of them should have the teacher's name, and how many students they are responsible
     * for. The catch is that if the teacher's name comes earlier in alphabetical order, then they need more 
     * students then the ones below it. How can you ensure some have more students than others? For example:
     *      Total Students: 30
     *      Mark has 15 students
     *      Karen has 10 students
     *      Zoey has 5 students
     */

    public static double classSize = 0;             
    public static String classType = "";   
    public static String[] teachers = new String[3];  
    public static double t1 = 0;
    public static double t2 = 0;
    public static double t3 = 0;
    public static String temp = "";
    public static int i = 0;
    public static int j = 0;     

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number of students: ");
        classSize = s.nextDouble();
        for(i=0;i<3;i++){
            System.out.println("Please enter teacher" + (i+1) + " name: ");
            teachers[i] = s.next();
        }
        System.out.println("You entered a class size of: " + classSize + " students");
        System.out.println("You entered teacher1 name: " + teachers[0]);
        System.out.println("You entered teacher2 name: " + teachers[1]);
        System.out.println("You entered teacher3 name: " + teachers[2]);
        java.util.Arrays.sort(teachers);
        t1=classSize/2;
        t2=classSize/3;
        t3=classSize-t1-t2;
        System.out.println(teachers[0] + " has " + t1 + " students");
        System.out.println(teachers[1] + " has " + t2 + " students");
        System.out.println(teachers[2] + " has " + t3 + " students");

        /*TODO:
        Write conditionals, store the result in the classType variable. Do not reassign classSize at any point.
        Create solution below */



        



        /*End Solution */
        System.out.println("You have a " + classType + " class");
    }
}

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Quadratic {
    public static void main(String args[]) {
        Scanner scannerObject = new Scanner(System.in); //Declaring the scannerObject to take in what user types

        System.out.println("This is the quadratic program\n" +
                "It is of the form aX^2 + bX + c = 0"); //Printing an instruction on the screen so that the user can follow

        System.out.println("Enter a :");
        float x = scannerObject.nextFloat();    //Accepts the first input a

        System.out.println("Enter b :");
        float y = scannerObject.nextFloat();   //Accepts the second input b

        System.out.println("Enter c :");
        float z = scannerObject.nextFloat();    //Accepts the second input c

        calculateMethod(x, y, z);        //Passing the parameters into the method for it to calculate


    }

    private static void calculateMethod(float a, float b, float c) {


        float discriminant = b * b - 4 * a * c; // Checking the discriminant to know the shape of the equation

        if (discriminant >= 0) {         //if the det is greater or equal to zero then its a real or equal roots
                                        //then no problem everything becomes easy

            float answer_one = (float) ((-b + sqrt(b * b - 4 * a * c)) / (2 * a)); //calculate to distinct between the + and -
            float answer_two = (float) ((-b - sqrt(b * b - 4 * a * c)) / (2 * a));

            System.out.println("The answers to the equation are " + answer_one + "and " + answer_two); //prints out the answers
        }


        else {                       //if the discriminant is a less than zero then it's a complex root
                                        //problem becomes more challenging for me owwww.think!think!

            float real = (-1 * b) / (2 * a); //calculate for the real part
            float imaginary_one = (float) ((sqrt(Math.abs(b * b - 4 * a * c))) / (2 * a)); //calculate for the imaginary part
            float imaginary_two = (float) -((sqrt(Math.abs(b * b - 4 * a * c))) / (2 * a)); //negative one too must jam

            System.out.println("The answers to the equation are " + real + " + " + imaginary_one +
                    "i" + " and " + real + imaginary_two + "i"); // prints the answer on the screen
        }


    }


}

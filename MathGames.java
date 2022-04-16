package HW2;

import java.util.Scanner;

public class MathGames {
    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and return the base.
    public static double pythTheorem(){
        double side1;
        double side2;
        double Hypotenuse;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type in a value for side 1: ");
        side1 = scan.nextDouble();
        System.out.println("Please enter in a value for side 2: ");
        side2 = scan.nextDouble();
        Hypotenuse = Math.sqrt((Math.pow(side1, 2)+ Math.pow(side2, 2)));
        System.out.println("The length of the hypotenuse is " + Hypotenuse);
        return Hypotenuse;
    }


    
    // 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements are your friend here you will probably need at the least 5 if / ifelse / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method 
    public static double gradeCalc(){
        Scanner scan = new Scanner(System.in);
        double input;
        System.out.println("Please type in your grade: ");
        input = scan.nextDouble();
       
       input = Math.ceil(input);
        if(input >= 90 && input <= 100){
            System.out.println("You recieved an A");
        }
        else if(input >= 80 && input <= 89){
            System.out.println("You recieved a B");
        }
        else if(input >= 70 && input <= 79){
            System.out.println("You recieved a C");
        }
        else if(input >= 60 & input <= 69){
            System.out.println("You recieved a D");
        }
        else if(input >= 0 && input <= 59){
            System.out.println("You recieved an F");
        }
        else{
            System.out.println("Error");
        }

        

return input;

        





    }




    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method 
public static double tipCalc(double totalBill, int persons, double percent ){
double perPerson;
perPerson = Math.ceil((totalBill*(percent/100))/persons);

System.out.println("Each person is paying $" + perPerson);
    return perPerson;
}
    
 


    // you do not need this main if you want to make a tester class
     public static void main(String[] args){
        MathGames.pythTheorem();
        MathGames.gradeCalc();
        MathGames.tipCalc(189.89, 4, 20);
     }




}

package HW3;
import java.time.Year;
import java.util.Scanner;

public class Loops {

    //NOTE: DO NOT change anything in the boiler plate
    //If I added default code it is meant to be there
    //and should not be adjusted unless otherwise noted
    //(return statments are usually changed)

    //Make a method that will return true if a given 
    //String contains between 1 and 3 'e' chars.
    //Ex.
    //loopE("eat") -> true
    //eeat -> true
    //eeeat -> true
    //eeeeat -> false

    public static boolean loopE(String str){
        int e = 0;
        boolean r = true;
        for (int i = 0; i < str.length(); i++) {
            if(str.toLowerCase().charAt(i) == 'e')
            {
               e++;
            }
            if(e >= 1 && e <= 3)
            {
                r=true;;
            }
            else
            {
                 r=false;
            }
        }
        return r;
      

        // <- this should be changed 
    }

    //Given a String str and int n return a larger string
    //that is n copies of the original string 
    //Ex.
    //stringTimes("Code",2) ->"CodeCode"
    //stringTimes("Code",4) ->"CodeCodeCodeCode"
    public static String stringTimes(String str, int n) {
        String temp = "";
        for (int i = 0; i < n; i++) 
        {
        temp += str;
            
        }
        

        return temp; // <- this should be changed 
    } 

    //Create a method Given a string, return the string where all of the "z"
    //Have been removed. Except do not remove a z at the start
    //or end
    //Ex.
    //stringT("zHelloz") -> "zHelloz"
    //stringT("nozthaznks") -> "nothanks"
    //stringT("xksiazdjaasldzsajzasdz") -> "xksiadjaasldsajasdz"
    public static String stringZ(String str){
        String temp = "";
        if(str.toLowerCase().charAt(0) == 'z'){
            temp += str.charAt(0);
            System.out.println(temp);
        }
        for (int i = 1; i < str.length() - 1; i++) 
        //z n o t h a n z k s z
        //0 1 2 3 4 5 6 7 8 9 10
        {
             //System.out.println(i + ", " + str.charAt(i));
            if(str.toLowerCase().charAt(i) == 'z')
            {
              temp += str.replace("z", "");        
              System.out.println(i + ", " + str.charAt(i));    
            }
        }
        if(str.toLowerCase().charAt(str.length()-1) == 'z'){
            temp += str.charAt(0);
            
        }
        return temp; // <- this should be changed 
    }

    
    //Create a method that contains a while loop that allows for
    //The user to input numbers until the number 0 is entered. Each time a number is 
    //entered the total will be summed and then prompted for a second number. 
    //NOTE: I require the use of scanner here to get each integer from the user
    //Assume the numbers entered are integers
    //Also note that the method is void meaning you will not need to return anything
    //It will need to sysout the numbers however
    //Below is a sample output what I would like
    // I will add up the numbers you give me....
    // Number: 12
    // The total so far is 12.
    // Number: 2
    // The total so far is 14.
    // Number: 3
    // The total so far is 17.
    // Number: 4
    // The total so far is 21.
    // Number: 1
    // The total so far is 22.
    // Number: 2
    // The total so far is 24.
    // Number: 3
    // The total so far is 27.
    // Number: 0
    // TOTAL ENDED --- The total is 27.
    public static void sums(){
        double sum = 0;

        System.out.println("I will add up the numbers you give me...");
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNextDouble())
        {
            double input = scan.nextDouble();
            sum = sum + input;
            System.out.println("Number: " + input);
            System.out.println("The total so far is: "+ sum);
            if(input == 0)
            {
                break;
            }
            
        }
        System.out.println("TOTAL ENDED --- The total is: "+ sum);
    }

    public static void main(String[] args) {
     System.out.println(Loops.loopE("jfjfiegybhhevbhn"));

     System.out.println(Loops.stringTimes("yur", 4));
        
     System.out.println(Loops.stringZ("znothanzkz")); 

     Loops.sums();

    }
    
}
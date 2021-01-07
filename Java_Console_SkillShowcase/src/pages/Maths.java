package pages;

import java.util.Scanner;
import static java_console_skillshowcase.Java_Console_SkillShowcase.newPage;
import static java_console_skillshowcase.Java_Console_SkillShowcase.pressAnyKeyToContinue;
import static validation.InputValidation.getChar;
import static validation.InputValidation.getDouble;

/**
 *
 * @author L. Andrew Overholt
 */
public class Maths {
    // load Scanner
    Scanner sc = new Scanner(System.in);
    
    // Variables
    static char c = 0;
    
    
    /**
     * This method displays the Math menu
     */
    public static void loadMathMenu() {
        while (!java_console_skillshowcase.Java_Console_SkillShowcase.quit) {
            newPage();
            
            // Print the menu and store the selection in variable c
            c = getChar("~~~~~~~~~~~~~~~~~\n"
                      + ">>    Math    <<\n"
                      + "~~~~~~~~~~~~~~~~~\n"
                      + "(A): Add\n"
                      + "(S): Subtract\n"
                      + "(M): Multiply\n"
                      + "(D): Divide\n"
                      + "(H): Home\n"
                      + "(Q): Quit\n\n"
                      + "Your choice: ");
            
            // use the users selection stored in variable c to navigate to the 
            // appropriate screen
            switch (c) {
                case 'A', 'a' -> addition();
                case 'S', 's' -> subtraction();
                case 'M', 'm' -> System.out.println("\n***\"Multiply\" has not been created yet ***");
                case 'D', 'd' -> System.out.println("\n***\"Divide\" has not been created yet ***");
                case 'H', 'h' -> java_console_skillshowcase.Java_Console_SkillShowcase.loadHomeMenu();
                case 'Q', 'q' -> java_console_skillshowcase.Java_Console_SkillShowcase.quit = true;
                default ->      {
                    System.out.println("\nThat is not a valid option. Please try again!");
                    pressAnyKeyToContinue();
                }
            }
            
        }
        
    }
    
    
    /**
     * This method allows the user to enter two numbers to be added together
     */
    private static void addition() {
        double num1;
        double num2;
        double result;
        
        newPage();
        
        // print info section
        System.out.println("~~~~~~~~~~~~~~~~\n"
                         + ">>  Addition  <<\n"
                         + "~~~~~~~~~~~~~~~~\n"
                         + "You will enter two numbers to be added together.\n");
        
        // Get the numbers from the user
        num1 = getDouble("First number: ");
        num2 = getDouble("Second number: ");
        
        // Calculate results
        result = num1 + num2;
        
        // Display results
        System.out.println("\n" + num1 + " + " + num2 + " = " + result + "\n");
        
        // Keep the results up until the user is ready to continue
        pressAnyKeyToContinue();
    }
    
    
    /**
     * This method allows the user to enter two numbers.
     * The second number will be subtracted from the first.
     */
    private static void subtraction() {
        double num1;
        double num2;
        double result;
        
        newPage();
        
        // print info section
        System.out.println("~~~~~~~~~~~~~~~~~~~\n"
                         + ">>  Subtraction  <<\n"
                         + "~~~~~~~~~~~~~~~~~~~\n"
                         + "You will enter two numbers.\n"
                         + "The second number will be subtracted from the first.\n");
        
        // Get the numbers from the user
        num1 = getDouble("First number: ");
        num2 = getDouble("Second number: ");
        
        // Calculate results
        result = num1 - num2;
        
        // Display results
        System.out.println("\n" + num1 + " + " + num2 + " = " + result + "\n");
        
        // Keep the results up until the user is ready to continue
        pressAnyKeyToContinue();
    }
}

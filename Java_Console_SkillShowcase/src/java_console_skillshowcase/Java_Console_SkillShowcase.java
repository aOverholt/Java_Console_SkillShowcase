package java_console_skillshowcase;

import java.io.IOException;
import java.util.Scanner;
import static validation.InputValidation.getChar;

/**
 *
 * @author L. Andrew Overholt
 */
public class Java_Console_SkillShowcase
{
    public static void main(String[] args)
    {
        loadHomeMenu();
    }

    
    
    // load Scanner
    Scanner sc = new Scanner(System.in);
    
    // Variables
    static char c = 0;
    static boolean quit = false;
    
    
    
    /**
     * This method displays the Home menu
     */
    public static void loadHomeMenu() {
        while (!quit) {
            System.out.println("\n\n\n\n**************************************************************\n"
                             + "Welcome to L. Andrew Overholt's Java Console Skills Showcase!\n"
                             + "**************************************************************\n\n");
            
            
            // Print the menu and store the selection in variable c
            c = getChar("~~~~~~~~~~~~~~~~\n"
                      + ">>    Home    <<\n"
                      + "~~~~~~~~~~~~~~~~\n"
                      + "(G): Games\n"
                      + "(L): Loops\n"
                      + "(M): Math\n"
                      + "(Q): Quit\n\n"
                      + "Your choice: ");
            
            // use the users selection stored in variable c to navigate to the 
            // appropriate screen
            switch (c) {
                case 'G', 'g' -> pages.Games.loadGamesMenu();
                case 'l', 'L' -> pages.Loops.loadLoopsMenu();
                case 'M', 'm' -> pages.Maths.loadMathMenu();
                case 'Q', 'q' -> quit = true;
                default ->      {
                }
            }
        }
    }
    
    /**
     * Creates white space and a divider between "pages"
     */
    public static void newPage() {
            System.out.println("\n\n\n\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n"
                             + " * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n\n\n");
    }
    
    /**
     * Gives the user the opportunity to see information before moving on to 
     * the next screen
     */
     public static void pressAnyKeyToContinue() { 
         System.out.println("\nPress Enter key to continue...");
         try {
             System.in.read();
         }  
         catch(IOException e) {
         }  
     }
}

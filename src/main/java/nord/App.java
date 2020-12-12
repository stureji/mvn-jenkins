package nord;

/**
 * This is the entry-point for the maven application. Contains functions for JavaJDK 11 to detect
 * if the project has the correct intended configurations.
 */
public class App {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("".isBlank()); // Only compiles with Java11
    }
}

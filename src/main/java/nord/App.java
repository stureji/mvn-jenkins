package nord;

/**
 * This is the entry-point for the maven application. Contains functions for JavaJDK 11 to detect
 * if the project has the correct intended configurations.
 */
public class App {
    public static void main(String[] args){
        System.out.println("Hooks are working!");
        System.out.println("Status reporting are working!");
        System.out.println("Will branching trigger a build? Hope not...");
    }

    public boolean willPass() {
        return false;
    }
}

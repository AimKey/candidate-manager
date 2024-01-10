package Controller;

import View.Menu;
import java.util.ArrayList;

/**
 *
 * @author phamm
 */
public class Controller extends Menu {

    public Controller() {
        super(new String[]{"Experience", "Fresher", "Internship", "Searching", "Exit"}, "Candidate Manager");

    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;

            case 4:
                break;
            case 5:
                System.out.println("See you next time");
                System.exit(0);
                break;
        }
    }

}

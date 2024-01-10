package Controller;

import Common.Library;
import Model.Company;
import Model.Contact;
import Model.Experience;
import Model.Fresher;
import Model.Info;
import Model.Internship;
import View.Menu;

/**
 *
 * @author phamm
 */
public class Controller extends Menu {

    Library lib = new Library();
    Company company;

    public Controller() {
        super(new String[]{"Experience", "Fresher", "Internship", "Searching", "Exit"}, "Candidate Manager");
        company = new Company();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                addExperience();
                break;
            case 2:
                addFresher();
                break;
            case 3:
                addIntern();
                break;
            case 4:
                break;
            case 5:
                System.out.println("See you next time");
                System.exit(0);
                break;
        }
    }

    public void addExperience() {
        try {
            String fName = lib.getString("First name");
            String lName = lib.getString("Last name");
            int bDay = lib.getInt("bDay");
            String address = lib.getString("Address");
            String phone = lib.getString("Phone");
            String email = lib.getString("Email");

            Info i = new Info(fName, lName, bDay);
            Contact c = new Contact(address, phone, email);

            int expInYear = lib.getInt("Year of exp");
            String proSkill = lib.getString("Pro skill");

            Experience e = new Experience(expInYear, proSkill, i, c, 0);
            company.getExperiences().add(e);
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void addFresher() {
        try {
            String fName = lib.getString("First name");
            String lName = lib.getString("Last name");
            int bDay = lib.getInt("bDay name");
            String address = lib.getString("Address");
            String phone = lib.getString("Phone");
            String email = lib.getString("Email");

            Info i = new Info(fName, lName, bDay);
            Contact c = new Contact(address, phone, email);

            String major = lib.getString("Major");
            int semester = lib.getInt("Semester");
            String uniName = lib.getString("University Name");

            Fresher f = new Fresher(major, semester, uniName, i, c, 1);
            company.getFreshers().add(f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void addIntern() {
        try {
            String fName = lib.getString("First name");
            String lName = lib.getString("Last name");
            int bDay = lib.getInt("bDay name");
            String address = lib.getString("Address");
            String phone = lib.getString("Phone");
            String email = lib.getString("Email");

            Info i = new Info(fName, lName, bDay);
            Contact c = new Contact(address, phone, email);

            String date = lib.getString("Date of graduation (dd/MM/yyyy)");
            String graduationRank = lib.getString("Graduation Rank (A, B,...)");
            String education = lib.getString("Where were you educated");

            Internship intern = new Internship(date, graduationRank, education, i, c, 2);
            company.getInternships().add(intern);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void doSearch() {

    }

}

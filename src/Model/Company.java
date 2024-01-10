package Model;

import java.util.ArrayList;

/**
 *
 * @author phamm
 */
public class Company {

    private ArrayList<Experience> experiences = new ArrayList<>();
    private ArrayList<Fresher> freshers = new ArrayList<>();
    private ArrayList<Internship> internships = new ArrayList<>();

    public ArrayList<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(ArrayList<Experience> experiences) {
        this.experiences = experiences;
    }

    public ArrayList<Fresher> getFreshers() {
        return freshers;
    }

    public void setFreshers(ArrayList<Fresher> freshers) {
        this.freshers = freshers;
    }

    public ArrayList<Internship> getInternships() {
        return internships;
    }

    public void setInternships(ArrayList<Internship> internships) {
        this.internships = internships;
    }

    

    
    

}

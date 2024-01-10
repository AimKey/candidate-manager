package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author phamm
 */
public class Internship extends Candidate {
    
    protected LocalDate graduateTime;
    protected String graduationRank;
    protected String education;

    public Internship(String graduateTime, String graduationRank, String education, Info info, Contact contact, int candidateType) {
        super(info, contact, candidateType);
        this.graduateTime = LocalDate.parse(graduateTime, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduateTime() {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(graduateTime);
    }

    public void setGraduateTime(LocalDate graduateTime) {
        this.graduateTime = graduateTime;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }
    
    
}

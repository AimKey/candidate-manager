package Model;

/**
 *
 * @author phamm
 */
public class Experience extends Candidate {
    private int ExpInYear;
    private String ProSkill;

    public Experience(int ExpInYear, String ProSkill, Info info, Contact contact, int candidateType) throws Exception {
        super(null, info, contact, candidateType);
        setExpInYear(ExpInYear);
        this.ProSkill = ProSkill;
    }
    
    
    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int ExpInYear) throws Exception {
        if (ExpInYear > 100) throw new Exception ("You cannot have over 100 years of EXP!");
        this.ExpInYear = ExpInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
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

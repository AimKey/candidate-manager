package Model;

/**
 *
 * @author phamm
 */
public class Fresher extends Candidate {
    
    protected String major;
    protected int semester;
    protected String uniName;

    public Fresher(String major, int semester, String uniName, Info info, Contact contact, int candidateType) {
        super(info, contact, candidateType);
        this.major = major;
        this.semester = semester;
        this.uniName = uniName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
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

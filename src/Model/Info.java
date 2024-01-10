package Model;

/**
 *
 * @author phamm
 */
public class Info {
    protected String fName, lName;
    protected int bDay;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Info(String fName, String lName, int bDay) {
        this.fName = fName;
        this.lName = lName;
        this.bDay = bDay;
    }
}

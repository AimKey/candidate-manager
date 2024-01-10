package Model;

/**
 *
 * @author phamm
 */
public class Contact {
    protected String address, phone, email;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws Exception {
        if(phone.length() < 10) throw new Exception ("Minimum phone number is 10!");
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String address, String phone, String email) throws Exception {
        this.address = address;
        setPhone(phone);
        this.email = email;
    }
                 
    
}

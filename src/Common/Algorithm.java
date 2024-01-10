package Common;

public class Algorithm {
    public void checkEmail (String email) throws Exception {
        if (!email.matches(email)) throw new Exception("Wrong email format!");
    }
}

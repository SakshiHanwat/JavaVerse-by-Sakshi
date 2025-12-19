public class PrivateDemo {
    public static void main(String[] args) {

        Account acc = new Account();

        acc.username = "sakshi";     // ✅ public
        // acc.password = "12345";   // ❌ private (error)

        acc.setPassword("12345");    // ✅ correct way
    }
}

class Account {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
        System.out.println("Password set successfully");
    }
}

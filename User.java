
public class User {

    String userName;
    String password;
    String email;
    String phone;
    public User(){ }
    public User( String userName , String password , String Email , String phone)
    {
        this.userName = userName;
        this.password = password;
        Email = email;
        this.phone = phone;
    }
    public String getUserName() { return userName; }
    public String getPassword() { return password; }
    public String getPhone() { return phone; }
}

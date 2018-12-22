import java.util.Scanner;

public class VerificationBoundary {
    VerificationServices vs = new VerificationServices();

    public void SignUp(DataAccess dataAccess) {
        System.out.print("Enter UserName: ");
        Scanner t = new Scanner(System.in);
        String userN = t.nextLine();
        System.out.print("Enter password: ");
        Scanner l = new Scanner(System.in);
        String pass = l.nextLine();
        System.out.print("Enter Email: ");
        Scanner d = new Scanner(System.in);
        String mail = d.nextLine();
        System.out.print("Enter phone: ");
        Scanner n = new Scanner(System.in);
        String pho = n.nextLine();
        User u = new User(userN, pass, mail, pho);
        vs.SaveAccount(dataAccess, u);
        System.out.println("Account created");

    }

    public int SignIn(DataAccess dataAccess) {
        System.out.print("UserName: ");
        Scanner n = new Scanner(System.in);
        String un = n.nextLine();
        System.out.print("Password: ");
        Scanner p = new Scanner(System.in);
        String pass = p.nextLine();
        if (vs.CheckData(dataAccess, un, pass) == 1) {
            return 1;
        } else {
            return 0;
        }

    }
}
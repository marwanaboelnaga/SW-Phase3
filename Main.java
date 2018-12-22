import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DataAccess d = new DataAccess();
        PostAndSearchBoundary p = new PostAndSearchBoundary();
        VerificationBoundary vb = new VerificationBoundary();

        Scanner sc = new Scanner(System.in);
        DataAccess db = new DataAccess();

        boolean flag = true;
        int choice,t;

        do {
            System.out.println("1)SignUp....2)SignIn....3)exit");
            choice = sc.nextInt();
            if (choice == 1)
                vb.SignUp(d);

            else if (choice == 2) {
                t=vb.SignIn(d);
                if(t==0)
                {continue;}

            } else if (choice == 3)
                flag = false;

            while (choice != 3) {
                System.out.println("1)Post....2)search...3)LogOut");
                choice = sc.nextInt();

                if (choice == 1)
                    p.CreatePost(d);

                else if (choice == 2) {
                    p.search(d);
                }
            }


        } while (flag);

    }

}

public class VerificationBoundary {
}
    public int SignIn(DataAccess dataAccess){
        System.out.print("UserName: ");
        Scanner n = new Scanner(System.in);
        String un = n.nextLine();
        System.out.print("Password: ");
        Scanner p = new Scanner(System.in);
        String pass = p.nextLine();
        if(vs.CheckData(dataAccess, un, pass)==1)
        {
            return 1;
        }
        else{
            return 0;
        }

    }
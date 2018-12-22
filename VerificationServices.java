public class VerificationServices {
	    public int CheckData(DataAccess dataAccess, String un, String pass) {
            int check = 0;
            for (int i = 0; i < dataAccess.users.size(); i++) {
                if (dataAccess.users.get(i).getUserName().equals(un)) {
                    if (dataAccess.users.get(i).getPassword().equals(pass)) {
                        System.out.println(dataAccess.users.get(i).getUserName() + " logged in");
                        check = 1;
                    } else {
                        System.out.println("wrong password");
                        break;
                    }
                }
            }
            return check;
        }
	public void SaveAccount(DataAccess d, User u){
        d.addUser(u);
    }
}

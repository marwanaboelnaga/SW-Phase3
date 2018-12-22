
import java.util.ArrayList;

public class DataAccess {
    public static ArrayList<Item> items= new ArrayList<>();
    public static ArrayList<User> users=new ArrayList<>();
    public void addItem(Item i){
        items.add(i);
    }
    public void addUser(User u){users.add(u);
    }

}

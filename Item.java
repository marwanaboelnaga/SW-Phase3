
import java.util.ArrayList;

public class Item {

    int id;
    String type;
    String location;
    String desc;
    ArrayList<String> ques = new ArrayList<>();
    ArrayList<String> answers = new ArrayList<>();

    //List<User> Applicant;
    public Item(){

    }
    public Item(int id , String type, String location , String desc)
    {
        this.id = id;
        this.type = type;
        this.location = location;
        this.desc = desc;
        ques = new ArrayList<String>();
    }
    public int getIID() { return id; }
    public String getType() { return type; }
    public String getLocation() { return location; }
    public String getDescription() { return desc; }
    public void AddAplicant(String question)
    {
        ques.add(question);
    }
}

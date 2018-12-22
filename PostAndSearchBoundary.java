import java.util.Scanner;
import java.util.ArrayList;
public class PostAndSearchBoundary {
    PostServices p = new PostServices();
    SearchServices s = new SearchServices();
    public Item CreatePost(DataAccess data){
        Item newItem = new Item();
        System.out.print("Enter Item type: ");
        Scanner t = new Scanner(System.in);
        String type = t.nextLine();
        newItem.type=type;
        System.out.print("Enter Item Location: ");
        Scanner l = new Scanner(System.in);
        String loc = l.nextLine();
        newItem.location=loc;
        System.out.print("Enter Item Description: ");
        Scanner d = new Scanner(System.in);
        String dsc = d.nextLine();
        newItem.desc=dsc;
        System.out.print("Enter number of questions: ");
        Scanner n = new Scanner(System.in);
        int nu = t.nextInt();
        for(int i =0;i<nu ;i++){
            System.out.print("Q-1 : ");
            Scanner q = new Scanner(System.in);
            String qu = q.nextLine();
            newItem.ques.add(qu);
            System.out.print("A-1 : ");
            Scanner ans = new Scanner(System.in);
            String answ = q.nextLine();
            newItem.answers.add(answ);
        }

        p.savePost(newItem, data);
        System.out.println("post submitted");
        return newItem;

    }

}

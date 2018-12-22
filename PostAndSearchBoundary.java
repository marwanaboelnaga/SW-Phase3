import java.util.Scanner;
import java.util.ArrayList;
public class PostAndSearchBoundary {
    PostServices p = new PostServices();
    SearchServices s = new SearchServices();

    public Item CreatePost(DataAccess data) {
        Item newItem = new Item();
        System.out.print("Enter Item type: ");
        Scanner t = new Scanner(System.in);
        String type = t.nextLine();
        newItem.type = type;
        System.out.print("Enter Item Location: ");
        Scanner l = new Scanner(System.in);
        String loc = l.nextLine();
        newItem.location = loc;
        System.out.print("Enter Item Description: ");
        Scanner d = new Scanner(System.in);
        String dsc = d.nextLine();
        newItem.desc = dsc;
        System.out.print("Enter number of questions: ");
        Scanner n = new Scanner(System.in);
        int nu = t.nextInt();
        for (int i = 0; i < nu; i++) {
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

    public void search(DataAccess d) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner v = new Scanner(System.in);
        Scanner x = new Scanner(System.in);
        ArrayList<Item> found = new ArrayList<>();
        System.out.println("Search by: 1)Type..2)Location..3)Description..4)All");
        int choice = a.nextInt();
        switch (choice) {
            case 1: {
                System.out.print("Type: ");
                String type = b.nextLine();
                found = s.searchType(type, d);
                printAll(found);
                break;
            }
            case 2: {
                System.out.print("Location: ");
                String loc = c.nextLine();
                found = s.searchLocation(loc, d);
                printAll(found);
                break;
            }
            case 3: {
                System.out.print("Description: ");
                String des = v.nextLine();
                found = s.searchDescription(des, d);
                printAll(found);
                break;
            }
            case 4: {
                System.out.print("Type: ");
                String type = b.nextLine();
                System.out.print("Location: ");
                String loc = c.nextLine();
                System.out.print("Description: ");
                String des = x.nextLine();
                found = s.searchAll(type, loc, des, d);
                printAll(found);
                break;
            }
            default: {
                break;
            }
        }
    }

    public void printAll(ArrayList<Item> found) {
        for (int i = 0; i < found.size(); i++) {
            System.out.println("type: " + found.get(i).type + " location: " + found.get(i).location + " description: " + found.get(i).desc);
        }
    }
}




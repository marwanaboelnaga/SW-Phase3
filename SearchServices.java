

        import java.util.ArrayList;

public class SearchServices {


    public ArrayList<Item> getAll(DataAccess d){
        return d.items;
    }
    public ArrayList<Item> searchType(String type, DataAccess d){
        ArrayList<Item> found = new ArrayList<>();
        for(int i=0 ; i<d.items.size() ; i++){
            if(d.items.get(i).type.equals(type)){
                found.add(d.items.get(i));
            }
        }
        return found;
    }
    public ArrayList<Item> searchLocation(String loc, DataAccess d){
        ArrayList<Item> found = new ArrayList<>();
        for(int i=0 ; i<d.items.size() ; i++){
            if(d.items.get(i).location.equals(loc)){
                found.add(d.items.get(i));
            }
        }
        return found;
    }
    public ArrayList<Item> searchDescription(String descr, DataAccess d){
        ArrayList<Item> found = new ArrayList<>();
        for(int i=0 ; i<d.items.size() ; i++){
            if(d.items.get(i).desc.equals(descr)){
                found.add(d.items.get(i));
            }
        }
        return found;
    }
    public ArrayList<Item> searchAll(String ty, String loc, String des, DataAccess d) {
        ArrayList<Item> found = new ArrayList<>();
        for (int i = 0; i < d.items.size(); i++) {
            if (d.items.get(i).type.equals(ty)) {
                if(d.items.get(i).location.equals(loc)){
                    if(d.items.get(i).desc.equals(des)){
                        found.add(d.items.get(i));
                    }
                }
            }
        }
        return found;
    }
    public Item searchItemId(int idd, DataAccess d){
        Item found = new Item();
        for(int i=0 ; i<d.items.size() ; i++){
            if(d.items.get(i).id == idd){
                found = d.items.get(i);
            }
        }

        return found;
    }


}






import java.util.ArrayList;

/*1. Write a Java program to update specific array element by given element and empty the array list .
 *       Input: [Apple, Grape, Melon, Berry]
 *       Output: [Kiwi, Grape, Mango, Berry]
 *       Array list after removing all elements []*/
public class ListErase {
    ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> addToList(String s) {
        if(s.equals(""))
            return list;
        list.add(s);
        return  list;
    }

    public boolean susbstitue(String old_element, String new_element) {
        boolean found_element = false;
        int index_element_found = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(old_element)) {
                found_element = true;
                index_element_found = i;
                break;
            }
        }
        if(found_element) {
            list.set(index_element_found, new_element);
            return true;
        }
        return false;
    }
    public ArrayList<String> eraseList() {
        list.clear();
        if(list.equals(null));
            return null;
    }

    public String printList() {
        String list_as_a_string = "";
        if(list.size() == 0)
            return list_as_a_string;
        for(int i = 0; i < list.size(); i++) {
            list_as_a_string += list.get(i) + " ";
        }
        return list_as_a_string.substring(0, list_as_a_string.length() - 1);
    }
}

/*6. Write a program to implement set interface which sorts the given randomly ordered names in
 *       ascending order. Convert the answer set in to an array list
 *       Input : Harry Olive Alice Bluto Eugene
 *       Output :
 *       Sorted Set : Alice Bluto Eugene Harry Olive
 *       Array list from Set : Alice Bluto Eugene Harry Olive*/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortStrings {
    public String[] sortArray(String[] input) {
        int index = 0;
        Set<String> set_of_strings = new HashSet<String>();
        for(String str : input) {
            set_of_strings.add(str);
        }
        String[] answer = new String[set_of_strings.size()];
        Set<String> sorted_set = new TreeSet<String>(set_of_strings);

        for(String s : sorted_set) {
            answer[index++] = s;
        }
//        Arrays.sort(answer);
        //instead of storing the unsorted list in an array and sorting the array, I have made use of the fact that
        //the tree implementation of set interface stores elements in sorted order
        return answer;
    }
}

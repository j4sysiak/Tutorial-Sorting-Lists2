import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;


public class Test {

    public static void main(String[] args) {
    	
        List<Person> list = new ArrayList<Person>();
        SortedSet<Person> set = new TreeSet<Person>();
         
        addElements(list);
        addElements(set);
         
        Collections.sort(list);
         
        showElements(list);
        System.out.println();
        showElements(set);
    }
     
    private static void addElements(Collection<Person> col) {
        col.add(new Person("Joewwwwwwwwwwwww"));
        col.add(new Person("Sueww"));
        col.add(new Person("Juliet"));
        col.add(new Person("Clarewwww"));
        col.add(new Person("Mike"));
    }
     
    private static void showElements(Collection<Person> col) {
        for(Person element: col) {
            System.out.println(element);
        }
    }

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Test {

	public static void main(String[] args) {

		
		//////////////////////  sorting STRING ////////////////////////////
		List<String> animals = new ArrayList<String>();
		
		animals.add("fasdfasd");
		animals.add("sadfsadf");
		animals.add("vrtvrtvret");
		animals.add("ytnnyunytn");
		animals.add("ertyreyerty");
		animals.add("hjlklhkljh");
		
		System.out.println("-------------StringLengthComparator---------------");
		Collections.sort(animals, new StringLengthComparator());
		
		for(String animal : animals){
			System.out.println(animal);
		}
		
		System.out.println("-------------AlphabeticalComparator---------------");
		Collections.sort(animals, new AlphabeticalComparator());
		
		for(String animal : animals){
			System.out.println(animal);
		}
		
		
		//////////////////////sorting NUMBERS ////////////////////////////
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(44);
		numbers.add(32);
		numbers.add(77);
		numbers.add(3);
		numbers.add(8876);
		
		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		
		for(Integer number : numbers){
			System.out.println(number);
		}
		
		
		//////////////////////sorting OBJECT ////////////////////////////
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person(1, "Joe"));
		people.add(new Person(3, "Sue"));
		people.add(new Person(2, "Juliet"));
		people.add(new Person(8, "Clare"));
		people.add(new Person(5, "Mike"));
		
		System.out.println("-------------Comparing by ID---------------");
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				if(o1.getId()>o2.getId()){
					return 1;
				} 
				else if(o1.getId()<o2.getId()){
					return -1;
				}
				return 0;
			}
			
		});
		
		for(Person person : people){
			System.out.println(person);
		}
		
		
		System.out.println("-------------Comparing by NAME---------------");
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		for(Person person : people){
			System.out.println(person);
		}
		
	}

}

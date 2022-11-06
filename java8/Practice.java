import java.util.*;
import java.util.stream.Collectors;


class Practice{
	public static void main(String[] args) {


		List<Integer> intList = new ArrayList<>(Arrays.asList(4, 7, 65, 34, 12));
		Collections.sort(intList);
		System.out.println(intList);
		Collections.reverse(intList);
		System.out.println(intList);

		intList = new ArrayList<>(Arrays.asList(4, 7, 65, 34, 12));
		List<Integer> sortedList = intList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		List<Integer> reverseList = intList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseList);


		
		
		
    	List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(108, "siva", 11, 8000));
		empList.add(new Employee(102, "hiva2", 33, 56000));
		empList.add(new Employee(105, "aiva3", 11, 1000));
		empList.add(new Employee(101, "diva5", 44, 2000));
		empList.add(new Employee(103, "riva5", 44, 27000));

		empList.forEach(System.out::println);
		System.out.println();

		Collections.sort( empList, (e1, e2) -> e1.getId() - e2.getId()  );
		empList.forEach(System.out::println);
		
		System.out.println();

		empList.stream().sorted(Comparator.comparing(e -> e.getName())).forEach(System.out::println);

	

	

		Map<Integer, String> map = new HashMap<>();
		map.put(8, "abc");
		map.put(4, "hut");
		map.put(3, "cbfg");	

		List<Map.Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());
		Collections.sort(entryList, (e1, e2) -> e1.getValue().compareTo(e2.getValue()));
		entryList.forEach(System.out::println);

		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		map = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
  }
}
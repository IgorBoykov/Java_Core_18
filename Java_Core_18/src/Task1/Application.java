package Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Application {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add("Java".length()); // можемо передати довжину(або інше значення х) String
		list1.add(3);

		System.out.println(list1);

		// Використовуючи Object
		List<Object> list2 = new ArrayList<>();
		list2.add(1);
		list2.add("hello");
		list2.add(3);

		System.out.println(list2);

		// Використовуючи MAP
		Map<Integer, String> newMap = new HashMap<Integer, String>();
		newMap.put(1, "auto");
		newMap.put(2, "moto");
		Iterator<Entry<Integer, String>> iterator = newMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			System.out.println(next.getKey().toString() + " " + next.getValue().toString());
		}
	}

}

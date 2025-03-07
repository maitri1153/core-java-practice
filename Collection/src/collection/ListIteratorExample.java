package collection;

import java.util.*;

public class ListIteratorExample {
	public static void main(String[] args) {

		List<String> names = new LinkedList<>();
		names.add("Hello");
		names.add("List");
		names.add("Iterator");

		ListIterator<String> listIterator = names.listIterator();

		// Traversing elements
		System.out.println("Forward Direction Iteration:");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		// Traversing elements, the iterator is at the end at this point
		System.out.println("Backward Direction Iteration:");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}

}

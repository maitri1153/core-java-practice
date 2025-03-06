package controlstatements;

import java.util.*;

public class DeepOrShallow {

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		List<Integer> list1 = new ArrayList<>(list);
		list.add(5);
		System.out.print(list1);

	}

}

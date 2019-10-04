package collectionsListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List1 {
	public static void main(String[] args) {
		// using the concrete class instance for Interface reference
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		l1.add(6);
		l1.add(2);
		l1.add(7);
		l1.add(1);
		// allows duplicates
		l1.add(3);
		System.out.println(l1);
		Iterator<Integer> it = l1.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
		}
		System.out.println("element at index one :" + l1.get(1));
		System.out.println("index of element 7 :" + l1.indexOf(7));
		System.out.println("contains 3 :" + l1.contains(3));
		System.out.println("size of arraylist :" + l1.size());
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(31);
		l2.add(62);
		l2.add(23);
		l2.add(74);
		l2.add(16);
		System.out.println("printing elements of l2 :" + l2);
		System.out.println("printing elements of l1:" + l1);
		// adding a new arraylist at index 2
		l1.addAll(2, l2);
		System.out.println("after adding an arraylist at index 2:" + l1);
	}
}

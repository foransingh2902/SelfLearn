package collectionsListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingComparators2 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("a");
		l1.add("n");
		l1.add("c");
		l1.add("k");
		l1.add("d");
		System.out.println(l1);
		Collections.sort(l1, new SwapStrings());
		System.out.println(l1);
	}

}

class SwapStrings implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// will sort ascending order
		// return o1.compareTo(o2);
		// descending order
		return o2.compareTo(o1);
	}

}
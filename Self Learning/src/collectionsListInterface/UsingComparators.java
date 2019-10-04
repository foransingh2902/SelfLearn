package collectionsListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingComparators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(6);
		l1.add(3);
		l1.add(2);
		l1.add(7);
		l1.add(1);
		System.out.println(l1);
		Collections.sort(l1, new SwapValues());
		System.out.println(l1);
	}

}

class SwapValues implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// will sort ascending order
		// return o1 - o2;
		// this will give an descending order
		return o2 - o1;
		// this will return ascending order
		// return o1.compareTo(o2);
	}

}

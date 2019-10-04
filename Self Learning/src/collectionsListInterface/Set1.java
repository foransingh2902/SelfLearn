package collectionsListInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
	public static void main(String[] args) {
		// won't preserve insertion order
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(2);
		// won't give an error, but won't add duplicate values
		s1.add(2);
		s1.add(5);
		s1.add(7);
		s1.add(9);
		// can add null values, but as no duplication, therefore only one null value
		s1.add(null);
		System.out.println(s1);
		// insertion order preserved
		Set<Integer> s2 = new LinkedHashSet<Integer>();
		s2.add(5);
		s2.add(3);
		s2.add(2);
		s2.add(2);
		s2.add(7);
		// same as in the case of HashSet
		s2.add(null);
		System.out.println(s2);
		// elements are inserted in sorted order by default or sorted based on an
		// comparator
		Set<Integer> s3 = new TreeSet<Integer>();
		s3.add(5);
		s3.add(3);
		s3.add(2);
		s3.add(2);
		s3.add(7);
		// s3.add(null); won't allow insertion of null value. NullPointerException
		System.out.println(s3);
	}
}

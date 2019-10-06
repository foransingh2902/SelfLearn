package com.servletCodingMVC2;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	public static List<Student> getStudents() {
		// create an empty list
		List<Student> students = new ArrayList<Student>();
		// add sample data
		students.add(new Student("foran", "singh", "foran.singh2902@gmail.com"));
		students.add(new Student("gaurav", "mittal", "mittal2902@gmail.com"));
		students.add(new Student("kamaljeet", "singh", "kamal2902@gmail.com"));
		// return the list
		return students;
	}
}

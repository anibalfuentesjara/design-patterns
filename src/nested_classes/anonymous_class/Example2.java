package nested_classes.anonymous_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<Student> studentsList = new ArrayList<Student>();
		studentsList.add(new Student(12500));
		studentsList.add(new Student(10600));
		studentsList.add(new Student(21500));

		Collections.sort(studentsList, new Comparator<Student>() { // anonymous class
			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o1.getRut(), o2.getRut());
			}
		});

		for (Student student : studentsList) {
			System.out.println(student.toString());
		}

	}

	public static class Student {
		private int rut;

		public Student(int rut) {
			this.rut = rut;
		}

		public int getRut() {
			return rut;
		}

		public String toString() {
			return "Student with rut: " + rut;
		}
	}

}

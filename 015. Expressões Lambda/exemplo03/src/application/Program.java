package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();

		list.add(new Person("Rosa", 65));
		list.add(new Person("Joao", 78));
		list.add(new Person("Jorge", 60));
		list.add(new Person("Maria", 90));

		Comparator<Person> person = (p1, p2) -> p1.getAge().compareTo(p2.getAge());

		list.sort(person);

		for (Person p : list) {
			System.out.println(p);
		}
	}
}
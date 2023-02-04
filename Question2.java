import java.util.*;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name + " " + Integer.toString(this.salary);
	}

}

public class Question2 {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(10001, "argha", 40000),
				new Employee(10011, "argha2", 40000), new Employee(10111, "argha3", 40000),
				new Employee(11111, "argha4", 40000));

		List<Employee> output = employees.stream().map(n -> {
			Employee res = new Employee(n.id, n.name, (n.salary * 110) / 100);
			return res;
		}).collect(Collectors.toList());
		System.out.println(output);

	}

}
import java.util.ArrayList;
import java.util.List;

public class BankDataBase {
	
	static List<Employee> list = new ArrayList<Employee>(10);
	
	public BankDataBase() {
		Employee e1 = new Employee(1, 1111, 30000, 0, 0);
		Employee e2 = new Employee(2, 2222, 30000, 0, 0);
		Employee e3 = new Employee(3, 3333, 30000, 0, 0);
		Employee e4 = new Employee(4, 4444, 30000, 0, 0);
		Employee e5 = new Employee(5, 5555, 30000, 0, 0);
		Employee e6 = new Employee(6, 6666, 30000, 0, 0);
		Employee e7 = new Employee(7, 7777, 30000, 0, 0);
		Employee e8 = new Employee(8, 8888, 30000, 0, 0);
		Employee e9 = new Employee(9, 9999, 30000, 0, 0);
		Employee e10 = new Employee(10, 0000, 30000, 0, 0);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		list.add(e9);
		list.add(e10);
	}
	
	public Employee getEmployeeById(int id) {
		for(Employee e: list) {
			if(e.getId() == id) {
				return e;
			}
		}
		return null;
	}
}

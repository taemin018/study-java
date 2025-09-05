package steamTestMy;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeTest {
	public static void main(String[] args) {
		
		
		Employee[] arEmployee = {
			    new Employee("손흥민", 3500),
			    new Employee("이강인", 4000),
			    new Employee("이재성", 2800),
			    new Employee("김민재", 5000)
				
		};
		
//		연봉이 3000 이상인 직원만 필터링한다.
//		해당 직원의 이름과 연봉을 10% 인상한 금액을 출력한다.
		
		ArrayList<Employee> employees = new ArrayList<Employee>(Arrays.asList(arEmployee));
		
		employees.stream().filter(employee -> employee.getSalary() >= 3000)
		.forEach(employee -> {int raisedSalary = (int) (employee.getSalary() * 1.1);
		System.out.println(employee.getName() + "의 인상된 연봉: " + raisedSalary + "만원");});
		
		
		
		
		
		
		
		
	}

}

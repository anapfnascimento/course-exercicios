package exerciciosSecao05.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exerciciosSecao05.entities.Employee;

public class ProgramList {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
						
			list.add( new Employee(id, name, salary));
		}		
		
		System.out.println();
		System.out.print("Enter employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		// filtrar lista de employee para obter a primeira ocorr�ncia x onde id da lista deve 
		// ser igual ao id informado ou retornar "null" caso n�o encontre
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if(emp == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
			
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
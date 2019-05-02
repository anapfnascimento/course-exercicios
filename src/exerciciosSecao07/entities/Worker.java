package exerciciosSecao07.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import exerciciosSecao07.entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
	}

	public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());  					// Peguei a data do contrato e defini com  
			                          					// sendo a data do calend�rio
														// ou seja, Data Calendar = Data do Contrato
			int c_year = cal.get(Calendar.YEAR); 		// Obt�m o ano do contrato 
			int c_month = 1 + cal.get(Calendar.MONTH); 	// Obt�m o m�s do contrato
			                                           	// Obs.: Somar 1 pq o m�s come�a com 0
			if(year == c_year && month == c_month) {
				sum += c.totalValue();
			}
			
		}
		return sum;
	}
}

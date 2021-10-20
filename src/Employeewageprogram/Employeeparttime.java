package Employeewageprogram;

public class Employeeparttime {
	public static void main(String[] args)
	 {
		int Emp_wage_per_hrs = 20;
		int Emp_work_hrs = 0;
		int Full_time = 2;
		int Part_time = 1;
		double empcheck = Math.floor(Math.random()*10)%3;
		if (empcheck == Full_time) 
		{
			Emp_work_hrs = 8;
		System.out.println("Employee is present");
		}
		else if (empcheck == Part_time) 
		{
			Emp_work_hrs = 4;
		System.out.println("Employee is present half day");
		}
		else
		{
			Emp_work_hrs = 0;
		System.out.println("Employee is absent");
		}
		int emp_wage = Emp_work_hrs * Emp_wage_per_hrs;
		System.out.println("Employee Wage : "+emp_wage);
	 }
}

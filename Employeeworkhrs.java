package Employeewageprogram;

public class Employeeworkhrs {
public static void main(String[] args)
 {
	int Emp_wage_per_hrs = 20;
	int Emp_work_hrs = 8;
	int Full_time = 1;
	double empcheck = Math.floor(Math.random()*10)%2;
	if (empcheck == Full_time) 
	{
		Emp_work_hrs = 8;
	int emp_wage1 = Emp_work_hrs * Emp_wage_per_hrs;
	System.out.println("Employee daily wage : "+emp_wage1);
	System.out.print("Employee is present");
	}
	else
	{
		Emp_work_hrs = 0;
	int emp_wage2 = Emp_work_hrs * Emp_wage_per_hrs;
	System.out.println("Employee daily wage : "+emp_wage2);
	System.out.print("Employee is absent");
	}
 }
}

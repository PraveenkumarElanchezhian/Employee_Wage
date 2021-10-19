package Employeewageprogram;

public class Employeetotalworkinghrs {

	public static final int Emp_wage_per_hrs = 20;
	public static final int Part_time = 1;
	public static final int Full_time = 2;
	public static final int Month_Working_days = 20;
	public static final int Total_Working_hrs = 100;
		
 public static void main(String[] args)
 {
	    int Emp_work_hrs = 0;
		int empcheck = (int)((Math.random())*10)%3;
		switch (empcheck)
		{
			case Full_time:
			Emp_work_hrs = 8;
			break;
			case Part_time:
			Emp_work_hrs = 4;
			break;
			default:
			Emp_work_hrs = 0;
			break;
		}
		int emp_wage = Emp_work_hrs * Emp_wage_per_hrs * Month_Working_days;
		System.out.println("Employee Wage : "+emp_wage);
 }
}
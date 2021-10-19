package Employeewageprogram;

public class Employeewage {
	public static void main(String[] args)
	{
	int full_time = 1;
	double empcheck = Math.floor(Math.random()*10)%2;
	if (empcheck == full_time)
	System.out.print("Employee is Present");
	else
	System.out.print("Employee is Absent");
	}

}

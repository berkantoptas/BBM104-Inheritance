package package1;

public class ptemployee extends employee {

	public int hourOfWork;
	public double salary;
	
	
	/**
	 * calculateSalary(int, int, int, int) for ptemployee class
	 */
	public double calculateSalary(int week1, int week2, int week3, int week4)
	{
		salary =0;
		hourOfWork = week1;
		if (hourOfWork<=20 && hourOfWork>=10)
			salary += hourOfWork*12;
		if (hourOfWork>20)
			salary += 20*12;
		hourOfWork = week2;
		if (hourOfWork<=20 && hourOfWork>=10)
			salary += hourOfWork*12;
		if (hourOfWork>20)
			salary += 20*12;
		hourOfWork = week3;
		if (hourOfWork<=20 && hourOfWork>=10)
			salary += hourOfWork*12;
		if (hourOfWork>20)
			salary += 20*12;
		hourOfWork = week4;
		if (hourOfWork<=20 && hourOfWork>=10)
			salary += hourOfWork*12;
		if (hourOfWork>20)
			salary += 20*12;
		
		return salary;
	}
}

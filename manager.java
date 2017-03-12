package package1;

public class manager extends personnel {

	public double baseSalary = 1800.00;
	public double ssBenefits = baseSalary*135/100;
	public double severancePay;
	public double overWorkSalary;
	public double salary;
	
	/**
	 * calculateSalary(int, int, int, int) for manager class
	 */
	public double calculateSalary(int week1, int week2, int week3, int week4)
	{
		severancePay = (2016-startyear)*20*0.8;
		overWorkSalary=0;
		if(week1-40<=8)
			overWorkSalary += (double) (week1-40) * 5;
		else
			overWorkSalary += 40.00;
		if(week2-40<=8)
			overWorkSalary += (double) (week2-40) * 5;
		else
			overWorkSalary += 40.00;
		if(week3-40<=8)
			overWorkSalary += (double) (week3-40) * 5;
		else
			overWorkSalary += 40.00;
		if(week4-40<=8)
			overWorkSalary += (double) (week4-40) * 5;
		else
			overWorkSalary += 40.00;
		salary = baseSalary + ssBenefits + severancePay + overWorkSalary;
		return salary;
	}
	
	
}

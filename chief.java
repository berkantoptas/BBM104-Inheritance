package package1;

public class chief extends ftemployee {

	public double overWorkSalary;
	public double severancePay;
	public double salary;
	
	
	/**
	 * calculateSalary(int, int, int, int) for chief class
	 */
	public double calculateSalary(int week1, int week2, int week3, int week4)
	{
		severancePay = (2016-startyear)*20*0.8;
		salary = 84*5*4;
		overWorkSalary=0;
		if(week1-40<=8)
			overWorkSalary += (double) (week1-40)*5;
		else
			overWorkSalary += 40.00;
		if(week2-40<=8)
			overWorkSalary += (double) (week2-40)*5;
		else
			overWorkSalary += 40.00;
		if(week3-40<=8)
			overWorkSalary += (double) (week3-40)*5;
		else
			overWorkSalary += 40.00;
		if(week4-40<=8)
			overWorkSalary += (double) (week4-40)*5;
		else
			overWorkSalary += 40.00;
		return salary + overWorkSalary + severancePay;
	}
	
}

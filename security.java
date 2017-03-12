package package1;

public class security extends personnel {

	public int hourOfWork;
	public double severancePay;
	public double transMoney = 4*6*4;
	public double foodMoney = 4*6*5;
	public double salary;
	
	/**
	 * calculateSalary(int, int, int, int) for security class	
	 */
	public double calculateSalary(int week1, int week2, int week3, int week4)
	{
		severancePay = (2016-startyear)*20*0.8;
		salary=0;
		hourOfWork=week1;
		if (hourOfWork<=54 && hourOfWork>=30)
		{
			salary += hourOfWork*6.5;
		}
		if (hourOfWork>54)
			salary += 54*6.5;
		hourOfWork=week2;
		if (hourOfWork<=54 && hourOfWork>=30)
		{
			salary += hourOfWork*6.5;
		}
		if (hourOfWork>54)
			salary += 54*6.5;
		hourOfWork=week3;
		if (hourOfWork<=54 && hourOfWork>=30)
		{
			salary += hourOfWork*6.5;
		}
		if (hourOfWork>54)
			salary += 54*6.5;
		hourOfWork=week4;
		if (hourOfWork<=54 && hourOfWork>=30)
		{
			salary += hourOfWork*6.5;
		}
		if (hourOfWork>54)
			salary += 54*6.5;
		
		return salary + severancePay + transMoney + foodMoney;
	}
}

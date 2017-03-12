package package1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
	/**
	 * 
	 * @param path
	 * 
	 * @return
	 * This is my readFile function.
	 * It reads the Personnel.txt and Monitoring.txt in my program.
	 */
	public static String[] readFile (String path)
	{
		try{
			int i=0;
			int length = Files.readAllLines(Paths.get(path)).size();
			String[] results = new String [length];
			for (String line : Files.readAllLines(Paths.get(path)))
				results[i++]=line;
			return results;
		}catch (IOException e)	{
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 
	 * @param args
	 * 
	 * @throws IOException
	 * My main function takes two arguments.(args[0]=Personnel.txt and args[1]=Monitoring.txt)
	 */
	public static void main(String[] args) throws IOException
	{
		String[] lines = readFile(args[0]);
		List<personnel> personnelList = new ArrayList<personnel>();
		
		/**
		 * Splitting Personnel.txt and adding variables to personnelList.
		 */
		for (String line : lines)
		{
			String[] parts;
			parts=line.split("\t");
			if (parts[2].equals("MANAGER"))
			{
				manager mng = new manager();
				mng.name=parts[0];
				mng.registnum=parts[1];
				mng.position=parts[2];
				mng.startyear=Integer.parseInt(parts[3]);
				personnelList.add(mng);
			}
			if (parts[2].equals("OFFICER"))
			{
				officer ofc = new officer();
				ofc.name=parts[0];
				ofc.registnum=parts[1];
				ofc.position=parts[2];
				ofc.startyear=Integer.parseInt(parts[3]);
				personnelList.add(ofc);
			}
			if (parts[2].equals("SECURITY"))
			{
				security scr = new security();
				scr.name=parts[0];
				scr.registnum=parts[1];
				scr.position=parts[2];
				scr.startyear=Integer.parseInt(parts[3]);
				personnelList.add(scr);
			}
			if (parts[2].equals("PARTTIME_EMPLOYEE"))
			{
				ptemployee ptemp = new ptemployee();
				ptemp.name=parts[0];
				ptemp.registnum=parts[1];
				ptemp.position=parts[2];
				ptemp.startyear=Integer.parseInt(parts[3]);
				personnelList.add(ptemp);
			}
			if (parts[2].equals("WORKER"))
			{
				worker wrk = new worker();
				wrk.name=parts[0];
				wrk.registnum=parts[1];
				wrk.position=parts[2];
				wrk.startyear=Integer.parseInt(parts[3]);
				personnelList.add(wrk);
			}
			if (parts[2].equals("CHIEF"))
			{
				chief chf = new chief();
				chf.name=parts[0];
				chf.registnum=parts[1];
				chf.position=parts[2];
				chf.startyear=Integer.parseInt(parts[3]);
				personnelList.add(chf);
			}
				

		}
		
		String[] lines2 = readFile(args[1]);
		List<monitoring> monitoringList = new ArrayList<monitoring>();
		
		/**
		 * Splitting Monitoring.txt and adding variables to monitoringList.
		 */
		for (String line2 : lines2)
		{
			String[] parts2;
			parts2=line2.split("\t");
			monitoring temp2 = new monitoring();
			temp2.registnum = parts2[0];
			temp2.week1 = Integer.parseInt(parts2[1]);
			temp2.week2 = Integer.parseInt(parts2[2]);
			temp2.week3 = Integer.parseInt(parts2[3]);
			temp2.week4 = Integer.parseInt(parts2[4]);
			monitoringList.add(temp2);
		}
		
		
		/**
		 * There are two for array loops.
		 * First one is traversing the personnelList and the second one is traversing monitoringList.
		 * When personnelList member's registnum matches with monitoringList member's registnum FileWriter writes that member's specifies to files.
		 */
		for(int i=0;i<personnelList.size();i++)
		{
			for(int j=0;j<monitoringList.size();j++)
			{
			if(personnelList.get(i).registnum.equals(monitoringList.get(j).registnum))
					{				
						String[] parts3;
						parts3=personnelList.get(i).name.split(" ");		
				
						FileWriter fw = new FileWriter(personnelList.get(i).registnum + ".txt");
						
						fw.write("Name : " + parts3[0]);
						fw.write(String.format("%n"));
						fw.write("Surname : " + parts3[1]);
						fw.write(String.format("%n"));
						fw.write("Registiration Number : " + personnelList.get(i).registnum);
						fw.write(String.format("%n"));
						fw.write("Position : " + personnelList.get(i).position);
						fw.write(String.format("%n"));
						fw.write("Year of Start : " + personnelList.get(i).startyear);
						fw.write(String.format("%n"));
						fw.write("Total Salary : " + personnelList.get(i).calculateSalary(monitoringList.get(j).week1,monitoringList.get(j).week2,monitoringList.get(j).week3,monitoringList.get(j).week4) + " TL");
						
				
						fw.close();
					}
			}
		}	
		
	}
	
	
}

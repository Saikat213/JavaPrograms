package introPrograms;

public class EmployeeWage {

	private final static int wagePerHour=20, WorkingDaysPerMonth=20, partTime=1, fullTime=2, maxHrsMonth=100; 
	
	private int empWage() {
		
		int totalWage=0, totalWorkingDays=0, totalHrs=0, empWorkingHrs=0;
		while(totalHrs <= maxHrsMonth && totalWorkingDays < WorkingDaysPerMonth) {
			totalWorkingDays++;
			
			int empCheck=(int)Math.floor(Math.random() * 10) % 3;
			
			switch(empCheck) {
			case fullTime:
				empWorkingHrs=8;
				break;
				
			case partTime:
				empWorkingHrs=6;
				break;
				
			default:
				empWorkingHrs=0;
			}
			
			totalHrs+=empWorkingHrs;
			int dailyWage=empWorkingHrs*wagePerHour;
			totalWage+=dailyWage;
			System.out.println("Daily Wage: "+dailyWage);
		}
		return totalWage;
	}
	
	public static void main(String[] args) {
			
		EmployeeWage ew = new EmployeeWage();
		System.out.println("Total Wage: "+ew.empWage());
	}
}

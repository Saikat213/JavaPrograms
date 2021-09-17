package introPrograms;

public class EmplWageCompanySpecified {

	private final static int partTime=1, fullTime=2;
	
	private final String company;
	private final int wagePerHour;
	private final int WorkingDaysPerMonth;
	private final int maxHrsMonth;
	
	public EmplWageCompanySpecified(String company, int wagePerHour, int WorkingDaysPerMonth, int maxHrsMonth) {
		this.company=company;
		this.wagePerHour=wagePerHour;
		this.WorkingDaysPerMonth=WorkingDaysPerMonth;
		this.maxHrsMonth=maxHrsMonth;
	}
	
	private int empWage() {
		
		int totalWorkingDays=0, totalHrs=0, empWorkingHrs=0;
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
			System.out.println("Day "+totalWorkingDays+" Empl Hours: "+empWorkingHrs);
		}
		return totalHrs*wagePerHour;
	}
	
	public static void main(String[] args) {
		
		EmplWageCompanySpecified bajaj = new EmplWageCompanySpecified("Bajaj", 20, 15, 12);
		EmplWageCompanySpecified telco = new EmplWageCompanySpecified("Telco", 30, 25, 40);
		
		System.out.println("Total Employee Wage for "+bajaj.company+" is : "+bajaj.empWage());
		System.out.println("Total Employee Wage for "+telco.company+" is : "+telco.empWage());
	}
}

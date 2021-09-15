package introPrograms;

import java.util.Scanner;
public class Stopwatch {

	private long elapsedTime() {
		
		long startTimer, stopTimer;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1 to start stopwatch: ");
		int start=s.nextInt();
		startTimer=System.currentTimeMillis();
		
		System.out.println("Enter 2 to stop: ");
		int stop=s.nextInt();
		s.close();
		stopTimer=System.currentTimeMillis();
		
		long elapseTime=stopTimer-startTimer;
		System.out.println("start: "+startTimer+" stop: "+stopTimer);
		return elapseTime;
	}
	
	public static void main(String[] args) {
		
		Stopwatch sw = new Stopwatch();
		 long timer=sw.elapsedTime();
		 
		System.out.print("Elapsed time is : "+timer/1000+" seconds");	
	}

}

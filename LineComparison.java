package introPrograms;

import java.util.Scanner;

public class LineComparison {
	private void comparison(double length1, double length2) {
		if (length1 == length2) {
			System.out.println("Length is Equal: ");
		} else if (length1 > length2) {
			System.out.println("Line1 is Greater: ");
		} else {
			System.out.println("Line2 is Greater");
		}
		System.out.println("Length of line1: "+length1+"\nLength of"
				+ " Line2: "+length2);
	}

	private double findLength(int x1, int y1, int x2, int y2) {
		double length = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		return length;
	}

	public static void main(String[] args) {
		double length1, length2;
		LineComparison lineCompare = new LineComparison();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Co-ordinates for Line 1:");
		System.out.println("Enter x1 Coordinate :");
		int x1 = scanner.nextInt();
		System.out.println("y1 Coordinate :");
		int y1 = scanner.nextInt();
		System.out.println("x2 Coordinate :");
		int x2 = scanner.nextInt();
		System.out.println("y2 Coordinate :");
		int y2 = scanner.nextInt();
		length1 = lineCompare.findLength(x1, y1, x2, y2);

		System.out.println("Enter Co-ordinates for Line 2 :");
		System.out.println("Enter x2 Coordinate :");
		int x3 = scanner.nextInt();
		System.out.println("y2 Coordinate :");
		int y3 = scanner.nextInt();
		System.out.println("x2 Coordinate :");
		int x4 = scanner.nextInt();
		System.out.println("y2 Coordinate :");
		int y4 = scanner.nextInt();
		scanner.close();

		length2 = lineCompare.findLength(x3, y3, x4, y4);
		lineCompare.comparison(length1, length2);
	}
}
package introPrograms;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CouponNumbers {

	private void generateCoupons(int n) {
		
		int[] coupons = new int[n];
		int i, j, genCoupons, flag=0;
		
		for(i=0;i<n;i++) {
			genCoupons=ThreadLocalRandom.current().nextInt(1000, 2000 + 1);
			for(j=0;j<n;j++) {
				if(coupons[j]==genCoupons) {
					flag=1;
					break;
				}
			}
			
			if(flag==0) {
				coupons[i]=genCoupons;
			}
			else {
				i--;
			}
		}
		System.out.println("Distinct Coupon Numbers: ");
		for(i=0;i<n;i++) {
			System.out.println(coupons[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
			int n;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter number of coupons to generate: ");
			n=s.nextInt();
			s.close();
			
			CouponNumbers cn = new CouponNumbers();
			cn.generateCoupons(n);
	}

}

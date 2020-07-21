package Task4.Cleancode;

import java.util.Scanner;
public class HouseConstruction {

	private Scanner s;

	public void cost() {
		s = new Scanner (System.in);
		System.out.format("%s","Menu");
		System.out.format("%s","standard materals");
		System.out.format("%s","above standard materials");
		System.out.format("%s","high standard materials");
		System.out.format("%s","high standard materials and automated home");
		int[] mc= {1200,1500,1800,2500};
		int c;
		double a,p;
		System.out.format("%s","enter your choice ");
		c=s.nextInt();
		System.out.format("%s","enter total area of house");
		a=s.nextDouble();
		p=mc[c-1]*a;
		System.out.format("the cost is %2f",p);
}
}
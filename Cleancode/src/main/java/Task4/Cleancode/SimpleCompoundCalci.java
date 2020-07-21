package Task4.Cleancode;

import java.util.Scanner;
public class SimpleCompoundCalci {

    private static Scanner sc;

	static
{
    double pr, rate, t, sim,com;
    sc = new Scanner (System. in);
    System.out.format("Enter the amount:");
    pr=sc.nextDouble();
    System. out. format("Enter the No.of years:");
    t=sc.nextDouble();
    System. out. format("Enter the Rate of  interest");
    rate=sc.nextDouble();
    sim=(pr * t * rate)/100;
    com=pr * Math.pow(1.0+rate/100.0,t) - pr;
    System.out.format("Simple Interest="+sim);
    System.out. format("Compound Interest="+com);
   }
}
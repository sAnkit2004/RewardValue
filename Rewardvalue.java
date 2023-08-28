package main.java;
import java.util.Scanner;
public class REwardValue {
	Scanner sc=new Scanner(System.in);
	

	REwardValue() // construtor  to accept value in cash
	{
	double cash=0;

	}
	REwardValue( double miles) //constructor to accept value in miles //
	{
		double x=miles;
	}
	public  double getMilesValue()  // method to return the cash value //
	{
		System.out.println("WELCOME TO CREDIT CARD REWARD CONVERTER");
		System.out.print("PLEASE ENTER A CASH VALUE TO CONVERT TO AIRLINE MILES- ");
		double miles=sc.nextDouble();
	 return miles;
		
	}
	public double getCashValue()  //method to return  how many miles // 
	{
				
		double cash=getMilesValue()*0.0035;
	 return cash;
	}
	
	public static void main(String[] args) {  // converting the miles into the cash //
		//TODO Auto-generated method stub
		REwardValue obj=new REwardValue();
		double input_value=obj.getMilesValue();
		 double p=obj.getCashValue();
		
		System.out.println("$"+ p + " is worth "+ input_value + "  miles");;
		
		
		
				
				
		

	}

}

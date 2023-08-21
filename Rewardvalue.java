package java.main;
import java.util.Scanner;
 class RewardValue {
    Scanner sc=new Scanner(System.in);


    RewardValue() // construtor  to accept value in cash
    {
        double cash=0;

    }
    RewardValue( double miles) //constructor to accept value in miles //
    {
        double x=miles;
    }
    public  double getCashValue()  // method to return the cash value //
    {
        System.out.println("enter  value in cash");
        double cash=sc.nextDouble();
        return cash;

    }
    public double getMilesValue()  //method to return  how many miles //
    {
        System.out.println("enter  how many miles the REwardValue is worth");
        double miles=sc.nextDouble();
        return miles;
    }

    public static void main(String[] args) {  // converting the miles into the cash //
        // TODO Auto-generated method stub
        RewardValue obj=new RewardValue();
        obj.getCashValue();
        double p=obj.getMilesValue();

        System.out.println("converting miles value to cash value"+p*0.0035);;







    }

}
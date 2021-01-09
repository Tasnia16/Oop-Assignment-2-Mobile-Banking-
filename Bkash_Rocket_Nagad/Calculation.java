package Bkash_Rocket_Nagad;

public class Calculation {
	String name,phone;
	double balance,charge;
	int pin;
	public Calculation(String t,String p,int pin,double c,double b)
	{
		this.name=t;
		this.phone=p;
		this.pin=pin;
		this.charge=c;
		this.balance=b;
	}
	public String toString()
	{
		return "Name: "+name+" ;"+"Phone number: "+phone+" ;"+"Charge per thousand:"+charge+" ;"+"Balance:"+balance;
	}
	void add_money(int pin,int amount)
	{
		if(pin!=this.pin)
			System.out.println("Wrong pin! Please insert the correct pin");
		else
		{
			balance+=amount;
			System.out.println("Balance after add money is :"+balance);
		}
	}
	void add_money(int amount)
	{
		this.pin=0;
		if(this.pin==0)
		{
			System.out.println("You have not given pin! Update or give the previous one");
			pin_update(this.pin);
		}
			
	}
	void pin_update(int pin)
	{
		if(pin==0)
			this.pin=2343;
		System.out.println("Pin is updated sucessfully! New pin :"+ this.pin);
	}
	void cash_out(int pin,int amount)
	{
		if(pin!=this.pin)
			System.out.println("Wrong pin! Please insert the correct pin");
		else
		{
			double x=amount+amount*charge/1000;
			if(x<=balance)
			{
				balance-=x;
				System.out.println("Succesful cash out tk :"+amount+"!"+" Current balance after cash out:"+balance);
			}
			else
			{
				System.out.println("Sorry! You don not have sufficient balance");
			}
		}
	}

}

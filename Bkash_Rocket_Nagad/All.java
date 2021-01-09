package Bkash_Rocket_Nagad;

public class All {
	public void info()
	{
		Bkash money_1=new Bkash("Khondaker Tasnia Hoque","01978763452",1205,18,5000);
		System.out.print("This is for Bkash: \n");
		System.out.println(money_1);
		money_1.add_money(1205,1000);//for correct pin
		money_1.add_money(1200,1000);//for wrong pin
		money_1.add_money(500);// method overloading
		money_1.cash_out(1205,2000);
	    Rocket money_2=new Rocket("Khondaker Tasnia Hoque","01978763452",1943,18,3000);
	    System.out.print("\n\nThis is for Rocket:\n ");
	    System.out.println(money_2);
	    money_2.add_money(1943,500);//for correct pin
	    money_2.cash_out(1205,1000);//for wrong pin
	    money_2.cash_out(1943,1500);
        Nagad money_3=new Nagad("Khondaker Tasnia Hoque","01978763452",1234,9.99,2000);
        System.out.print("\n\nThis is for Nagad:\n ");
        System.out.println(money_3);
        money_3.add_money(1234,1200);//for correct pin
        money_3.cash_out(1234,500);//for correct pin
        money_3.cash_out(1234,5000);//for insufficient balance
	}

}

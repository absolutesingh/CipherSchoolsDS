package primitiveDT;
abstract class Account{
	int balance;
	Account(int balance)
	{
		this.balance=balance;
	}
	void showBalance(){
		System.out.println(this.balance);
	}
	abstract void calculate();
}
class SavingsAccount extends Account
{
	double rate = 5;
	SavingsAccount(int balance)
	{
		super(balance);
	}
	void calculate(){
		System.out.println(balance*rate/100);
	}
}
class CurrentAccount extends Account
{
	CurrentAccount(int balance)
	{
		super(balance);
	}
	double rate = 0;
	void calculate(){
		System.out.println("0");
	}
}
public class banks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sa = new SavingsAccount(5000);
		CurrentAccount ca = new CurrentAccount(3000);
		sa.showBalance();
		sa.calculate();
		ca.showBalance();
		ca.calculate();
	}

}

class Account{
	private String accNo;
	private String name;
	private double balance;

	Account(String accNo, String name, double balance){
		this.accNo = accNo;
		this.name = name;
		if (balance>=0){
			this.balance = balance;
		} else {
			this.balance = 0;
		}
	}

	public void deposit(double amt){
		if (amt > 0){
			balance += amt;
			System.out.println(amt+" has been deposited");
		} else {
			System.out.println("Can't deposit negative amount");
		}
	}

	public void withdraw(double amt){
		if (amt > 0 && amt<=balance){
			balance -= amt;
			System.out.println(amt+" has been withdrawn");
		} else if (amt<=0) {
			System.out.println("Can't withdraw negative amount");
		} else {
			System.out.println("Insuffecient balance");
		}

	}
	
	public String getAccno(){
		return accNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void display(){
		System.out.println("----Account Details----");
        	System.out.println("Account No: " + accNo);
        	System.out.println("Name: " + name);
        	System.out.println("Balance: " + balance);
        	System.out.println("------------------------");
	}

}

public class Main3 {
	public static void main(String[] args) {
		Account a = new Account("12345","alex",4500);
		Account b = new Account("223344","alexa",8900);

		a.deposit(8500);
		a.getBalance();
		b.display();
		
		System.out.println(a.getAccno());
		System.out.println(b.getName());
	}

}
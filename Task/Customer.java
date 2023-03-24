package Task;

public class Customer {

		
		private int id;
		private String name;
		private char gender;
		
		public void  Customer(int id, String name, char gender) {
			this.id = id;
			this.name = name;
			this.gender = gender;
		}

		public String toString() {
			System.out.println("Customer [id=" + id + ", name=" + name + ", gender=" + gender + "]");
			return name;
		}
		public static void main(String[]args) {
			Customer cus=new Customer();
			Account1 acc1=new Account1();
			cus.Customer(17,"SDC",'M');
			cus.toString();
			acc1.account(10,cus,25000);
			acc1.credit(25000);
			acc1.debit(26000);
			acc1.transfer(null,25000);
			acc1.toString();
		}
}

	class Account1  {
		
		private int id;
		private Customer customer;
		private int balance;
		
		public void account(int id, Customer customer, int balance) {
			this.id = id;
			this.customer = customer;
			this.balance = balance;
		}
		
		public int credit(int amount){
			this.balance=this.balance+amount;
			return this.balance;
		}
		
		public int debit(int amount){
			if(amount<=this.balance){
				this.balance=this.balance-amount;
			}else{
				System.out.println("Amount exceeded balance");
			}
			return this.balance;		
		}
		public int transfer(Account a2,int amount){
			if(amount<=this.balance){
				this.balance=this.balance-amount;
				a2.credit(amount);
			}else{
				System.out.println("Amount exceeded balance");
			}
			return this.balance;		
		}

		
		public String toString() {
			 System.out.println("Account [id=" + id + ", customer=" + customer + ", balance=" + balance + "]");
			 return null;
		}

	}


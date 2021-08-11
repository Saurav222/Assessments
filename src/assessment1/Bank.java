package assessment1;

public class Bank {
  public static void main(String[] args) {
	  createAccount();
	  System.out.println("\n");
	  createSavingAccount();
	  System.out.println("\n");
	  createCurrentAccount();
}

public static void createAccount() {
	Account a1 = new Account(12345678, "Abc", "12-7-21");	
	System.out.println("Balance: " + a1.getBalance());
	System.out.println("Owner Name: " +a1.getOwnerName());
	System.out.println("Create Date: " + a1.getCreateDate());
}

public static void createSavingAccount() {
	SavingsAccount a2 = new SavingsAccount(12345678, "Abc", "12-7-21");
	System.out.println("Balance: " + a2.getBalance());
	System.out.println("Owner Name: " + a2.getOwnerName());
	System.out.println("Create Date: " + a2.getCreateDate());
	System.out.println("Type: " + a2.getType());
}

public static void createCurrentAccount() {
	CurrentAccount a3 = new CurrentAccount(12345678, "Abc", "12-7-21");	
	System.out.println("Balance: " + a3.getBalance());
	System.out.println("Owner Name: " + a3.getOwnerName());
	System.out.println("Create Date: " + a3.getCreateDate());
	System.out.println("Type: " + a3.getType());
	System.out.println("Overdraft Balance: " + a3.getOverdraftBalance());
}
}

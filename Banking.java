package projectwork;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Account
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	public Account(int accountNumber, String accountHolderName) {
		super();  // it refers to parent class or parent class constructors in java
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance =0.0;
	}
	//getters and setters
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
class Bank
{
	private List<Account>accounts;
	
	public Bank()
	{
		this.accounts=new ArrayList<>();
	}
	
	// add a new account to the bank
	
	public void addAccount(Account account)
	{
		accounts.add(account);
	}
	
	//get a account by account number
	public Account getAccountByNumber(int accountNumber)
	{
		for(Account account : accounts)
		{
			if(account.getAccountNumber()==accountNumber)
			{
				return account;
			}
		}
		return null;
	}
	
	// deposit money into the account
	public void deposit(int accountNumber,double amount)
	{
		Account account=getAccountByNumber(accountNumber);
			if(account!=null)
			{
				account.setBalance(account.getBalance() + amount);
				System.out.println("Deposit successful.Current balance : " + account.getBalance());
			}
			else {
				System.out.println("account not found");
			}
		}
	
		
		
		//withdraw money from an account
		public void withdraw(int accountNumber,double amount)
		{
			Account account=getAccountByNumber(accountNumber);
			if(account!=null)
				if(account.getBalance()>= amount)
				{
					account.setBalance(account.getBalance()  - amount);
					System.out.println("with draw successful.Current balance : " + account.getBalance());
				}
				else if(account.getBalance()<=amount)
				{
					System.out.println("in sufficient account balance.");
				}
				else
				{
					System.out.println("account not found.");
				}
			}
		
		// Transfer money from one account to another
        public void transfer(int fromAccountNumber, int toAccountNumber, double amount) {
            Account fromAccount = getAccountByNumber(fromAccountNumber);
            Account toAccount = getAccountByNumber(toAccountNumber);

            if (fromAccount != null && toAccount != null) {
                if (fromAccount.getBalance() >= amount) {
                    fromAccount.setBalance(fromAccount.getBalance() - amount);
                    toAccount.setBalance(toAccount.getBalance() + amount);
                    System.out.println("Transfer successful. Transferred amount: " + amount);
                    System.out.println("From account balance: " + fromAccount.getBalance());
                    System.out.println("To account balance: " + toAccount.getBalance());
                } else {
                    System.out.println("Insufficient balance in the source account.");
                }
            } else {
                System.out.println("One or both accounts not found.");
            }
        }
			//Display accountBalance
			public void displayBalance(int accountNumber)
			{
				Account account = getAccountByNumber(accountNumber);
				if(account!=null)
				{
					System.out.println("account Number :" + account.getAccountNumber());
					System.out.println("account Holder :" + account.getAccountHolderName());
					System.out.println("current Balance :" + account.getBalance());
				}
				else
				{
					System.out.println(" account not found");
				}
		}
	}


public class BankManagementSystem 
{
   public static void main(String[]  args)
   {
	   Bank bank=new Bank();
	   // bank accounts 
	   bank.addAccount(new Account(2001, "shanmukh"));
       bank.addAccount(new Account(2002, "hari"));
       bank.addAccount(new Account(2003, " mukesh"));
       bank.addAccount(new Account(2004, "Abhiram "));
	   
	   Scanner scanner=new Scanner(System.in);
	   
	   System.out.println(" welcome to online Banking Management System ");
	   int accountNumber;
	   int choice;
	   
	   do
	   {
		   System.out.println("\n1.Deposit Money");
		   System.out.println("2.withdraw Money");
		   System.out.println("3.check account balance");
		   System.out.println("4.Trasnfer ammount");
		   System.out.println("5. create new bank account");
		   System.out.println("0.exit");
		   System.out.println("enter your choice");
		   choice=scanner.nextInt();
		   
		   
		   int fromAccountNumber;
		int toAccountNumber;
		double transferAmount;
		switch(choice)
		   {
		   case 1:
			   System.out.println(" enter your account number :");
			   accountNumber=scanner.nextInt();
			  
			   
			   if(accountNumber==2001)
			   {
				   System.out.println(" account holder name=shanmukh");
				   System.out.println(" enter the amount to deposit");
				   double depositAmount=scanner.nextDouble();
				   bank.deposit(accountNumber,depositAmount);
			   }
			   else if(accountNumber==2002)
			   {
				   System.out.println(" account holder name=hari");
				   System.out.println(" enter the amount to deposit");
				   double depositAmount=scanner.nextDouble();
				   bank.deposit(accountNumber,depositAmount);
			   }
			   else if(accountNumber==2003)
			   {
				   System.out.println(" account holder name=mukesh");
				   System.out.println(" enter the amount to deposit");
				   double depositAmount=scanner.nextDouble();
				   bank.deposit(accountNumber,depositAmount);
			   }
			   else if(accountNumber==2004)
			   {
				   System.out.println(" account holder name=Abhi Ram");
				   System.out.println(" enter the amount to deposit");
				   double depositAmount=scanner.nextDouble();
				   bank.deposit(accountNumber,depositAmount);
			   }
			   else
			   {
				   System.out.println(" account holder name=prabhas");
				   System.out.println(" enter the amount to deposit");
				   double depositAmount=scanner.nextDouble();
				   bank.deposit(accountNumber,depositAmount);
			   }
			   break;
		   case 2:
			   System.out.println(" enter your account number :");
			   accountNumber=scanner.nextInt();
			   
			   
			   if(accountNumber==2001)
			   {
				   System.out.println(" account holder name=shanmukh");
				   System.out.println(" enter the amount to withdraw");
				   double withdrawAmount=scanner.nextDouble();
				   bank.withdraw(accountNumber,withdrawAmount);
			   }
			   else if(accountNumber==2002)
			   {
				   System.out.println(" account holder name=hari");
				   System.out.println(" enter the amount to withdraw");
				   double withdrawAmount=scanner.nextDouble();
				   bank.deposit(accountNumber,withdrawAmount);
			   }
			   else if(accountNumber==2003)
			   {
				   System.out.println(" account holder name=mukesh");
				   System.out.println(" enter the amount to withdraw");
				   double withdrawAmount=scanner.nextDouble();
				   bank.withdraw(accountNumber,withdrawAmount);
			   }
			   else if(accountNumber==2004)
			   {
				   System.out.println(" account holder name=Abhi Ram");
				   System.out.println(" enter the amount to deposit");
				   double withdrawAmount=scanner.nextDouble();
				   bank.withdraw(accountNumber,withdrawAmount);
			   }
			   else
			   {
				   System.out.println(" account holder name=prabhas");
				   System.out.println(" enter the amount to deposit");
				   double withdrawAmount=scanner.nextDouble();
				   bank.withdraw(accountNumber,withdrawAmount);
			   }
			   break;
		   case 3:
			   System.out.println(" enter your account number");
			   accountNumber=scanner.nextInt();
			   bank.displayBalance(accountNumber);
			   break;
			   
		   case 4:
               System.out.println("Enter your account number:");    // we created three local variables 
               fromAccountNumber = scanner.nextInt();
               System.out.println("Enter the recipient's account number:");
               toAccountNumber = scanner.nextInt();
               System.out.println("Enter the amount to transfer:");
               transferAmount = scanner.nextDouble();
               bank.transfer(fromAccountNumber, toAccountNumber, transferAmount);
               break;
               
		   case 5:
               System.out.println("Enter account number:");
               int newAccountNumber = scanner.nextInt();
               System.out.println("Enter account holder name:");
               String newAccountHolderName = scanner.next();
               bank.addAccount(new Account(newAccountNumber, newAccountHolderName));
               System.out.println("Account created successfully.");
               break;
               
		   case 0:
			   System.out.println(" thank you for using online banking management.GoodBye");
			   break;
			   default:
				   System.out.println("invalid choice.please try again");
		   }
	   }
	   while(choice!=0);
	   
	   scanner.close();
   }
}

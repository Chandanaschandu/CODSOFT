
import java.util.Scanner;
class ATM{
    
    private BankAccount account;
    //constructor
    public ATM(BankAccount account){
        this.account=account;
    }
    // displaying 4 option for user.
    public void displayoptions(){
        System.out.println("Welcome to ATM machine ");
        System.out.println("1.Check balance");
        System.out.println("2.withdraw ammount");
        System.out.println("3.Deposit amount");
        System.out.println("4.Cancel");
        
    }
    public void start(){
        Scanner input=new Scanner(System.in);
        while(true){
            displayoptions();
            System.out.println("Enter your option(1-4)");
            int choice=input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Your balance is "+account.getbalance());
                    break;
                case 2:
                    System.out.println("Enter the withdrawal amount");
                    double withdrawalAmount=input.nextDouble();
                    if(account.withdraw(withdrawalAmount)){
                        System.out.println("withdrawn"+withdrawalAmount);
                    }
                    else{
                        System.out.println("Insufficient balance for withdrawal");
                    }
                    break;
                case 3:
                    System.out.println("Enter deposit amount");
                    double depositAmount=input.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposited amount is"+depositAmount);
                    break;
                case 4:
                    System.out.println("Sucessfull transactions,Thanks for using Atm ");
                    return;
                default:
                    System.out.println("Invalid choice.Please choose between 1 to 4");
            }
        }
    }
}
class BankAccount{
    private double balance;
    BankAccount(double balance){
        this.balance=balance;
        }
    public double getbalance(){
        return balance;
        }
    public void deposit(double amount){
        balance=balance+amount;
        }
    public boolean withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
            return true;
            }
        return false;
        }
    }
public class ATMmachine {

    public static void main(String[] args) {
        
        BankAccount userAccount=new BankAccount(10000);
        ATM atm=new ATM(userAccount);
        atm.start();
        
    }
    
}

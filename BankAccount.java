/*You are tasked with creating a java program that simulates a bank transaction for a customer.Your program should handle exceptions related to different types of transacations and account balances using nested try and catch.
1. define a class BankAccount with following attributes.
   - accountNo(int)
   - balance(double) 
2. Implement constructor to initialize both.
   - A member function withdraw(double amount).If withdrawal exceeds current balance,then it should throw Runtime exception.*/

import java.util.*;

// User-defined exception class
class InsufficientBalanceException extends Exception 
{
    public InsufficientBalanceException(String message) 
{
        super(message);
    }
}

class BankAccount 
{
    private int accountNo;
    private double balance;

    // Constructor
    public BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientBalanceException 
{
        if (amount > balance) 
{
            throw new InsufficientBalanceException("Insufficient Balance!");
        } 
else 
{
            balance -= amount;
            System.out.println("Withdrawal successful! New Balance: " + balance);
        }
    }

    public double getBalance() 
{
        return balance;
    }

    public static void main(String args[]) 
{
        Scanner scanner = new Scanner(System.in);

        try 
{
            System.out.print("Enter Account Number: ");
            int accountNumber = scanner.nextInt();

            System.out.print("Enter Initial Balance: ");
            double initialBalance = scanner.nextDouble();

            BankAccount account = new BankAccount(accountNumber, initialBalance);

            char choice;
            do 
{
                System.out.print("\nEnter amount to withdraw: ");
                double amount = scanner.nextDouble();

                try 
{
                    account.withdraw(amount);
                } catch (InsufficientBalanceException e) 
{
                    System.out.println("Transaction Failed: " + e.getMessage());
                }

                System.out.print("Do you want to perform another transaction? (Y/N): ");
                choice = scanner.next().charAt(0);

            } 
while (choice == 'Y' || choice == 'y');

        } 
catch (Exception e) 
{
            System.out.println("Unexpected Error: " + e.getMessage());
        } 
finally 
{
            System.out.println("Transaction process completed.");
        }
    }
}
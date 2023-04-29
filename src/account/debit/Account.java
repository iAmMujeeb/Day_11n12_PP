package account.debit;

import java.util.Scanner;

public class Account {
    int accountBalance = 1000;

    public Integer debit(Integer amount){
        if(amount <= accountBalance) {
            accountBalance = accountBalance - amount;
            System.out.println("Amount Debited => " + amount);
        }else if (amount > accountBalance) {
            System.out.println("Debit amount exceeded account balance");
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int transactionStatus;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Amount To Be Debited => ");
        Integer amount = scanner.nextInt();
        Account amountDebit = new Account();
        transactionStatus = amountDebit.debit(amount);
        if(transactionStatus == 1)
            System.out.println("Transaction Was Successful");
        else
            System.out.println("Transaction Failed");
        System.out.println("Remaining Balance In Account => "+amountDebit.accountBalance);
    }
}

import java.util.Scanner;

class BankAccount{
    private double userbalance;
    public BankAccount(double initialBalance) {
        userbalance = initialBalance;
    }

    public void getBalance() {
        //return userbalance;
        System.out.println("\nUser Current Balance is:"+userbalance +"\n");
    }
    public void depositAmount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount to be Deposit:");
        double amountToBeDeposited = sc.nextDouble();
        this.userbalance +=  amountToBeDeposited;


    }
    public void WithDraw(){
        double amountToWithdraw = 0;
        System.out.println("Enter The amount to be withdraw:");
        Scanner sc = new Scanner(System.in);
        amountToWithdraw = sc.nextDouble();
        if(userbalance >= amountToWithdraw)
        {
            userbalance = userbalance - amountToWithdraw;
        }
        else
        {
            System.out.println("Not Enough Balance in your Bank Account");
        }
    }

    public void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit\n");
    }


}

public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(1000);


        while (true) {
            b.displayMenu();
            System.out.println("Enter your Choice:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    b.getBalance();
                    break;

                case 2:
                    b.depositAmount();
                    break;

                case 3:
                    b.WithDraw();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");

            }
        }
    }
}


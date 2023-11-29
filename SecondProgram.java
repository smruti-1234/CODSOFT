import java.util.*;
public class SecondProgram {
    public static void main(String[] args) {
        int balance=200000, withdraw, deposit;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Automated teller machine");
            System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 for deposit");
            System.out.println("Choose 3 for checkbalance");
            System.out.println("choose 4 for exit");
            System.out.println("Choose the operation you want to performe");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Enter money to be withdrawn");
                withdraw=sc.nextInt();
                if(balance>=withdraw)
                {
                    balance=balance-withdraw;
                    System.out.println("Please collect money");
                }
                else
                {
                    System.out.println("insufficient funds");
                }
                System.out.println(" ");
                    break;
            case 2:
            System.out.println("Enter money to be deposited");
            deposit=sc.nextInt();
            balance=balance+deposit;
            System.out.println("your money has been deposited successfully");
            System.out.println(" ");
            break;
            case 3:
            System.out.println("Balance:"+balance);
            System.out.println(" ");
            break;
            case 4:
            System.exit(0);
            default:
            System.out.println("Invalid");
            }
        }
    }
}

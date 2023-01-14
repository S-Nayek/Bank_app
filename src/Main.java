import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter your name ,password, balance to create an accout");

        // create user

        String name =sc.nextLine();
        String password = sc.nextLine();
        double balance = sc.nextDouble();
        SBIUser user = new SBIUser(name,balance,password);
        System.out.println("the account number is: "+user.getAccountNo());

        // add money
        String message = user.addMoney(100000);
        System.out.println(message);

        //check balance
        double newBalance = user.checkBalance();
        System.out.println("balance: "+newBalance);

        // withdraw money
        System.out.println("Enter amount you want to withdraw");
        double money = sc.nextDouble();
        System.out.println("enter your password");
        String pass =sc.next();
        System.out.println(user.withdrawMoney(money,pass));


        // rate of interest
        System.out.println("the interest is : "+user.calculateInterest(10));
    }
}
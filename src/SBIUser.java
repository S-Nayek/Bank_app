import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface {
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private double rateOfInterest;


    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        // bank is initialise
        this.rateOfInterest = 6.2;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }
    public String getAccountNo(){
        return accountNo;
    }
    public String getName(){
        return name;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance =balance+amount;
        return "your new balance is :"+balance;
    }

    @Override
    public String withdrawMoney(double amount, String enteredPassword) {
        if(Objects.equals(enteredPassword,password)){
            if(amount>balance){
                return "insufficient balance";
            }
            else{
                balance=balance-amount;
                System.out.println(balance);
                return "lots of money";
            }

        }
        else{
            return "wrong password";
        }

    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*rateOfInterest)/100;
    }


}

public interface BankInterface {

    double checkBalance();
    String addMoney(int amount);
   String withdrawMoney(double amount,String password);
   double calculateInterest(int years);
}

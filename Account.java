import java.util.Scanner;
class Account{
    double balance;
    void deposite(double amount){
        if(amount>0){
            balance=balance + amount;
            System.out .println("Amount deposite sucessfully");
            }else{
                System.out.println("Invalid deposite amount");
            }
    }
    void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid deposite amount");
        }
        else if(amount > balance){
            System.out.println("Insufficient balance.");
        }else{
            balance=balance-amount;
            System.out.println("Amount withdrawn sucessfully");
        }
    }
    void displayBalance(){
        System.out.println("Current balance:Rs."+ balance);
    }
}
public class Account1{
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the amount");
         Account account =new Account();
         System.out.println("Enter deposite amount");
         double depositeAmount =input.nextDouble();
         account.deposite(depositeAmount);
         account.displayBalance();
         System.out.println("Enter withdraw amount");
         double withdrawAmount= input.nextDouble();
         account.withdraw(withdrawAmount);
         account.displayBalance();
  }
}
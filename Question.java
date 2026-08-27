import java.util.Scanner;
class Account {
    double balance;
    void deposite(double amount){
        if(amount>0) {
        balance = balance + amount;
        System.out.println("Amount deposite sucessfully.");
    }else{
        System.out.println("Invalid deposite amount");
    }
        
    }

void withdraw(double amount){
    if(amount <= 0){
        
    System.out.println("Invalid withdraw amount.");
    } else if(amount > balance) {
    System.out.println("Insufficent balance.");
} else{
    balance = balance - amount;
    System.out.println("Amount withdraw sucessfully.");
}
}
void displayBalance(){
    System.out.println("current balance:Rs" + balance);
}
}
public class Question {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account();       

        System.out.println("Enter a deposite amount");
        double depositeAmount = input.nextDouble();

        account.deposite(depositeAmount);
        account.displayBalance();

        System.out.println("Enter a withdraw amount");
        double withdrawAmount = input.nextDouble();

        account.withdraw(withdrawAmount);
        account.displayBalance();

        input.close();
    }       
}
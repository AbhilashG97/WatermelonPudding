import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            
            BankFactory bankFactory = new BankFactory();
            Bank bank = bankFactory.getBank(scanner.nextLine());
            System.out.println(bank.getBankName());
            
            LoanFactory loanFactory = new LoanFactory();
            Loan loan = loanFactory.getLoan(scanner.nextLine());
            System.out.println("Loan Approval -> "+ loan.getLoan(scanner.nextInt()));
        }
    }
}
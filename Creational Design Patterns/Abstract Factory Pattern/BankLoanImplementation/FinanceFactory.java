public interface FinanceFactory {

    Bank getBank(String bankName);
    Loan getLoan(String loanType);
} 
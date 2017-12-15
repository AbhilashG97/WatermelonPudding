public class LoanFactory implements FinanceFactory {
    
    public Bank getBank(String bankName){
        return null;
    }

    public Loan getLoan(String loanType){

        loanType = loanType.replaceAll("\\s+", "");    

        if(loanType.equalsIgnoreCase("HomeLoan")){
            return new HomeLoan();
        }else if(loanType.equalsIgnoreCase("EducationLoan")){
            return new EducationLoan();
        }else {
            return new BusinessLoan();
        }
    }    
}
public class BankFactory implements FinanceFactory {

    public Bank getBank(String bankName){

        bankName = bankName.replaceAll("\\s+", "");

        if(bankName.equalsIgnoreCase("MelonBank")){
            return new MelonBank();
        }else if(bankName.equalsIgnoreCase("OrangeBank")){
            return new OrangeBank();
        }else{
            return new CustardAppleBank();
        }
    }

    public Loan getLoan(String loanType){
        return null;
    }
}
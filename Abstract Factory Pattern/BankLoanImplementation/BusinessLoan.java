public class BusinessLoan implements Loan {

    public boolean getLoan(int income){
        if(income > 100){
            return true;
        }else{
            return false;
        }
    }
}
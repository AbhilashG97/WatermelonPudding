public class EducationLoan implements Loan {

    public boolean getLoan(int income){
        if(income > 100){
            return true;
        }else{
            return false;
        }
    }
}
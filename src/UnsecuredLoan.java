public class UnsecuredLoan extends  LoanAccount{
    // constructor
    UnsecuredLoan(double principle,double annualInterestRate,int months){
        super(principle, annualInterestRate, months);
    }
    //toString method used
    @Override
    public String toString() {
        return "\n\nUnsecured Loan with:" +
                "\n" + super.toString() + "\n";
    }
}
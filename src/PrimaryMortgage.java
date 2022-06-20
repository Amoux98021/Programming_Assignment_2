public class PrimaryMortgage extends LoanAccount{

    double PMIMonthlyAmount;
    Address address;

    // constructor
    PrimaryMortgage(double principle,double annualInterestRate,int months,double PMIMonthlyAmount,Address address){
        super(principle, annualInterestRate, months);
        this.PMIMonthlyAmount=PMIMonthlyAmount;
        this.address=address;
    }

    // toString method used
    @Override
    public String toString() {
        return "\nPrimary Mortgage Loan with:" +
                "\n"+super.toString()+
                "\nPMI Monthly Amount: "+PMIMonthlyAmount+
                "\n"+address.toString();
    }
}



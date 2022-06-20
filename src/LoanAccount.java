public class LoanAccount {

    double principle,annualInterestRate;
    int months;

    // constructor
    LoanAccount(double principle,double annualInterestRate,int months){
        this.principle=principle;
        this.annualInterestRate=annualInterestRate;
        this.months=months;
    }

    // Method from assignment 1, to calculate Monthly Payments (GIVEN)
    public double calculateMonthlyPayment() {
        double monthlyInterest = annualInterestRate/12;
        double monthlyPayment = principle * ((monthlyInterest/100) / (1 - Math.pow(1 + (monthlyInterest/100),-months)));

        return monthlyPayment;
    }

    // getter
    public double getPrinciple() {
        return principle;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getMonths() {
        return months;
    }

    //toString method used
    @Override
    public String toString() {
        return "Principle: $"+getPrinciple()
                +"\nAnnual Interest Rate: "+getAnnualInterestRate()+"%"
                +"\nTerm of Loan in months: "+getMonths()
                +"\nMonthly Payment: $"+String.format("%.2f",calculateMonthlyPayment());

    }
}
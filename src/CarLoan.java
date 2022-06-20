public class CarLoan extends LoanAccount{

    String vehicleVIN;

    // constructor
    CarLoan(double principle,double annualInterestRate,int months,String vehicleVIN){
        super(principle, annualInterestRate, months);
        this.vehicleVIN=vehicleVIN;
    }

    //toString method used
    @Override
    public String toString() {
        return "Car Loan with:" +
                "\n"+super.toString()+"\n"+"Vehicle VIN:"+vehicleVIN+"\n";
    }

}



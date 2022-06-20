import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Create three different loan objects, one of each type. (GIVEN)
        //CarLoan carLoan = new CarLoan(25000.00, 4.25, 72, "IRQ3458977");
        // Create different loan objects, at least one of each type. (GIVEN)
        CarLoan carLoan1 = new CarLoan(25000.00, 4.9, 72, "IRQ3458977");
        CarLoan carLoan2 = new CarLoan(12000.00, 5, 60, "NXK6767876");

        Address propertyAddress1 = new Address("321 Main Street", "State College", "PA", "16801");
        PrimaryMortgage propertyLoan1 = new PrimaryMortgage(250000.00, 3.75, 360, 35.12, propertyAddress1);
        Address propertyAddress2 = new Address("783 Maple Lane", "State College", "PA", "16801");
        PrimaryMortgage propertyLoan2 = new PrimaryMortgage(375000.00, 2.5, 360, 53.12, propertyAddress2);

        UnsecuredLoan unsecuredLoan = new UnsecuredLoan(5000.00, 10.75, 48);

        // create customers (GIVEN)
        Customer customerA = new Customer("Tony", "Stark", "111-22-3333");
        Customer customerB = new Customer("Gal", "Gadot", "444-55-6666");

        // add loans for the customers. (GIVEN)
        customerA.addLoanAccount(carLoan1);
        customerA.addLoanAccount(propertyLoan1);
        customerA.addLoanAccount(unsecuredLoan);

        customerB.addLoanAccount(carLoan2);
        customerB.addLoanAccount(propertyLoan2);

        // add the customers to an arraylist of customers. (GIVEN)
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customerA);
        customers.add(customerB);

        //Print out the loan information for each customer polymorhically. (GIVEN)
        System.out.println("Monthly Report of Customers by Loan Account\n");
        for (Customer customer:customers)
        {
            System.out.println(customer.printMonthlyReport());
        }

        //Address propertyAddress = new Address("321 Main Street", "State College", "PA", "16801");
        //PrimaryMortgage propertyLoan = new PrimaryMortgage(250000.00, 3.1, 360, 35.12, propertyAddress);

        //UnsecuredLoan unsecuredLoan = new UnsecuredLoan(5000.00, 10.75, 48);

        //Print out the load information for each loan using the toString() method.(GIVEN)
        //System.out.format("%n%s%s%s%n", carLoan, propertyLoan, unsecuredLoan);

    }
}
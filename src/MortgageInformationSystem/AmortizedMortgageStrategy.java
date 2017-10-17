package MortgageInformationSystem;

import java.time.LocalDate;

import static MortgageInformationSystem.Mortgage.relativeMonths;

/**
 * Created by matthias on 10/15/17.
 */
public class AmortizedMortgageStrategy implements MortgageStrategy {

    int payPerMonth;
    public AmortizedMortgageStrategy(int payPerMonth){
        this.payPerMonth = payPerMonth;
    }
    @Override
    public Payment calculatePayment(Mortgage mortgage,LocalDate date){
       // System.out.println(mortgage.getCurrentLoan()*relativeMonths(date,mortgage.getLastPaymentDate())*mortgage.getInterestPoints()/1200);
        return new Payment(date,
                this.payPerMonth - mortgage.getCurrentLoan()*relativeMonths(date,mortgage.getLastPaymentDate())*mortgage.getInterestPoints()/1200,
                mortgage.getCurrentLoan()*relativeMonths(date,mortgage.getLastPaymentDate())*mortgage.getInterestPoints()/1200);
    }

    public void setPayPerMonth(int payPerMonth) {
        this.payPerMonth = payPerMonth;
    }
}

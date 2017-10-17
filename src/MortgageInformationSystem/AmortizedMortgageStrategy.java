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
        return new Payment(date,
                this.payPerMonth - mortgage.getCurrentLoan()*relativeMonths(mortgage.getLastPaymentDate(),date)*mortgage.getInterestPoints()/100,
                mortgage.getCurrentLoan()*relativeMonths(mortgage.getLastPaymentDate(),date)*mortgage.getInterestPoints()/100);
    }

    public void setPayPerMonth(int payPerMonth) {
        this.payPerMonth = payPerMonth;
    }
}

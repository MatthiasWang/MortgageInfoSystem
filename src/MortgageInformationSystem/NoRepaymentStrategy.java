package MortgageInformationSystem;

import java.time.LocalDate;

import static MortgageInformationSystem.Mortgage.relativeMonths;

/**
 * Created by matthias on 10/15/17.
 */
public class NoRepaymentStrategy implements MortgageStrategy {
    @Override
    public Payment calculatePayment(Mortgage mortgage,LocalDate date){
        System.out.println(mortgage.getInitialLoan()*relativeMonths(date,mortgage.getLastPaymentDate())*mortgage.getInterestPoints()/1200);

        if(relativeMonths(date,mortgage.getStartDate())-relativeMonths(mortgage.getEndDate(),mortgage.getStartDate())<0){
            return new Payment(date,0,
                    mortgage.getInitialLoan()*relativeMonths(date,mortgage.getLastPaymentDate())*mortgage.getInterestPoints()/1200);
        }else{
            return new Payment(date,mortgage.getInitialLoan(),
                    mortgage.getInitialLoan()*relativeMonths(date,mortgage.getLastPaymentDate())*mortgage.getInterestPoints()/1200);
        }

    }
}

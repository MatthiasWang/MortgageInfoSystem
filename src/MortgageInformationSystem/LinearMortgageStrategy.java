package MortgageInformationSystem;

import java.time.LocalDate;

import static MortgageInformationSystem.Mortgage.relativeMonths;

/**
 * Created by matthias on 10/15/17.
 */
public class LinearMortgageStrategy implements MortgageStrategy {
    @Override
    public Payment calculatePayment(Mortgage mortgage, LocalDate date){
        int totalMonths = relativeMonths(mortgage.getEndDate(),mortgage.getStartDate());
      //  int relativeMonths = relativeMonths(date,mortgage.getStartDate());

//        int totalMonths = mortgage.getEndDate().getMonth().getValue()
//                - mortgage.getStartDate().getMonth().getValue()
//                +12*(mortgage.getEndDate().getYear() -mortgage.getStartDate().getYear());
//        int relativeMonths = date.getMonth().getValue()-mortgage.getStartDate().getMonth().getValue()
//                + 12*(date.getYear()-mortgage.getStartDate().getYear());
        return new Payment(date,
        /*liner: relativeMonths*moneyPieces*/
        mortgage.getInitialLoan()/totalMonths
                ,
        /*currentLoan*date*interestPoint*/
        mortgage.getCurrentLoan()*mortgage.getInterestPoints()*totalMonths/1200
);
}
}

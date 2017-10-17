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
        int relativeMonths = relativeMonths(date,mortgage.getLastPaymentDate());
      //  int relativeMonths = relativeMonths(date,mortgage.getStartDate());

//        int totalMonths = mortgage.getEndDate().getMonth().getValue()
//                - mortgage.getStartDate().getMonth().getValue()
//                +12*(mortgage.getEndDate().getYear() -mortgage.getStartDate().getYear());
//        int relativeMonths = date.getMonth().getValue()-mortgage.getStartDate().getMonth().getValue()
//                + 12*(date.getYear()-mortgage.getStartDate().getYear());
//        System.out.println(date);
//        System.out.println(relativeMonths);
//        System.out.println(mortgage.getInitialLoan()/totalMonths*relativeMonths);
//        System.out.println(mortgage.getCurrentLoan()*mortgage.getInterestPoints()*relativeMonths/1200);

        return new Payment(date,
        /*liner: relativeMonths*moneyPieces*/
        mortgage.getInitialLoan()/totalMonths*relativeMonths
                ,
        /*currentLoan*date*interestPoint*/
        mortgage.getCurrentLoan()*mortgage.getInterestPoints()*relativeMonths/1200
);
}
}

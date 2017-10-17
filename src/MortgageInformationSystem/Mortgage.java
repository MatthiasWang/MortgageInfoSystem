package MortgageInformationSystem;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by matthias on 10/15/17.
 */
public class Mortgage {
    private int initialLoan;
    private int currentLoan;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate lastPaymentDate;
    private int interestPoints;//points per year
    private Map<LocalDate,Payment> payments;
    private MortgageStrategy ms;

    public Mortgage(int initialLoan,LocalDate startDate, LocalDate endDate, int interestPoints) {
        this.initialLoan = initialLoan;
        this.currentLoan = initialLoan;
        this.startDate = startDate;
        this.lastPaymentDate = startDate;
        this.endDate = endDate;
        this.interestPoints = interestPoints;
        this.payments = new HashMap<>();
    }

    public Payment getRequiredPayment(LocalDate date){


        return ms.calculatePayment(this,date);
    }


    public void makePayment(Payment p){
        this.currentLoan = this.currentLoan - p.getRedemption();
    }

    public void setMortgageStrategy(MortgageStrategy ms){
        this.ms = ms;
    }

    public int getInitialLoan() {
        return initialLoan;
    }

    public int getCurrentLoan() {
        return currentLoan;
    }

    public int getInterestPoints() {
        return interestPoints;
    }
    public String toString(){
        return null;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public MortgageStrategy getMs() {
        return ms;
    }

    public LocalDate getLastPaymentDate() {
        return lastPaymentDate;
    }

    public static int relativeMonths(LocalDate endDate, LocalDate startDate){
        return 12*(endDate.getYear()-startDate.getYear())
                +(endDate.getMonth().getValue()-startDate.getMonth().getValue());
    }
}

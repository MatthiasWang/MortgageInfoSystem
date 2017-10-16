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
    private int interestPoints;
    private Map<LocalDate,Payment> payments;
    private MortgageStrategy ms;

    public Mortgage(int initialLoan, int currentLoan, LocalDate startDate, LocalDate endDate, int interestPoints) {
        this.initialLoan = initialLoan;
        this.currentLoan = currentLoan;
        this.startDate = startDate;
        this.endDate = endDate;
        this.interestPoints = interestPoints;
        this.payments = new HashMap<>();
    }

    public Payment getRequiredPayment(LocalDate date){

        return null;
    }


    public void makePayment(Payment p){

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

}

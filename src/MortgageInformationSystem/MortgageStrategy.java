package MortgageInformationSystem;

import java.time.LocalDate;

/**
 * Created by matthias on 10/15/17.
 */
public interface MortgageStrategy {
    public Payment calculatePayment(Mortgage mortgage);
}

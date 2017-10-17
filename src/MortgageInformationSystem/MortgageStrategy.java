package MortgageInformationSystem;

import java.time.LocalDate;

/**
 * Created by matthias on 10/15/17.
 */
public interface MortgageStrategy {
     Payment calculatePayment(Mortgage mortgage,LocalDate date);
}

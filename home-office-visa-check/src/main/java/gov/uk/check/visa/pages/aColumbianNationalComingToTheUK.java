package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class aColumbianNationalComingToTheUK extends Utility {
    private static final Logger log = LogManager.getLogger(AnAustralianCominToUKForTourism.class);
    public aColumbianNationalComingToTheUK() {
        PageFactory.initElements(driver, this);
    }

}

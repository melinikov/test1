package tests_flights;

import driver.Driver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.PageFlights;

public class TestFindTicketWhenFieldToIsEmpty {
    private PageFlights pageFlights = new PageFlights();

    @BeforeClass
    public static void openDriver() {
        Driver.getDriver().get("https://www.britishairways.com/en-us/flights-and-holidays/flights");
    }
    @Test
    public void findTicketWhenFieldToIsEmpty() {
        pageFlights.clickButtonContinue();
        pageFlights.clearInputTo();
        pageFlights.clickRadioButtonOneWay();
    }
    @AfterClass
    public static void closeDriver() {
        Driver.closeDriver();
    }
}

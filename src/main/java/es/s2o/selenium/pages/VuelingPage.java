package es.s2o.selenium.pages;

import es.s2o.selenium.domain.FlightSearchDTO;
import es.s2o.selenium.domain.ReservationDTO;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.time.Duration;


public class VuelingPage extends PageObjectBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    // Form
    @FindBy(id = "txtName")
    private WebElementFacade txtName;

    // With Selenium PageObject a WebElement without a @FindBy is like findById,
    // where the id is the name of the field
    private WebElementFacade flight_origin1;
    private WebElementFacade flight_destiny1;
    private WebElementFacade flight_round_date1;
    private WebElementFacade flight_return_date1;
    @FindBy(id = "ticketops-seeker-button")
    private WebElementFacade ticketops_seeker_button;
    @FindBy(xpath = "//*[@id='ticketops-seeker-menu']/*[2]")
    private WebElementFacade one_way;
    private WebElementFacade buttonSubmit1;

    public void registerFlight(FlightSearchDTO flightSearchDTO) {
        LOGGER.debug("registerFlight starts, flightSearchDTO: [{}]", flightSearchDTO);

        typeInto(flight_origin1, flightSearchDTO.getOrigin());
        typeInto(flight_destiny1, flightSearchDTO.getDestination());
        ticketops_seeker_button.click();
        one_way.click();
        typeInto(flight_round_date1, flightSearchDTO.getDate());
        buttonSubmit1.click();
    }

    private String getHiddenValue(){
        return getDocument().getElementById("hiddenField").attr("value");
    }
}



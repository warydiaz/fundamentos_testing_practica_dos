package es.s2o.selenium.stepsdefs.vueling;

import es.s2o.selenium.domain.FlightSearchDTO;
import es.s2o.selenium.pages.VuelingListPage;
import es.s2o.selenium.pages.VuelingPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class VuelingStepdefs {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private VuelingPage vuelingPage;
    private VuelingListPage vuelingListPage;

    private static final String WEB_ROOT = "WEB_ROOT";
    private static final String HOME = "reservationList.html";

    @Before
    public void beforeScenario() {
        LOGGER.debug("beforeScenario starts");
    }

    @After
    public void afterScenario() {
        LOGGER.debug("afterScenario starts");
    }

    @Given("I am on the Vueling homepage")
    public void i_am_on_the_vueling_homepage() {
        LOGGER.debug("I am on the Vueling homepage");
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
        String baseUrl = variables.getProperty("WEB_ROOT");
        vuelingPage.openAt(baseUrl);
    }

    @When("I search for a flight with the following details:")
    public void i_search_for_a_flight_with_the_following_details(List<FlightSearchDTO> flightSearchDTOS) throws Throwable {
        LOGGER.debug("i_search_for_a_flight_with_the_following_details");
        flightSearchDTOS.forEach(
                flightSearch -> vuelingListPage.addFlight(flightSearch)
        );

        throw new io.cucumber.java.PendingException();
    }

    @Then("I see available flights in the search results")
    public void i_see_available_flights_in_the_search_results() throws Throwable {
        LOGGER.debug("i_see_available_flights_in_the_search_results starts");

        throw new io.cucumber.java.PendingException();

    }
}

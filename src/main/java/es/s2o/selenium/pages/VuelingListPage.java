package es.s2o.selenium.pages;

import es.s2o.selenium.domain.FlightSearchDTO;
import es.s2o.selenium.domain.ReservationDTO;
import net.serenitybdd.core.pages.WebElementFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static net.thucydides.core.pages.components.HtmlTable.inTable;
import org.openqa.selenium.support.FindBy;


public class VuelingListPage extends PageObjectBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    private VuelingPage vuelingPage;
    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElementFacade oneTrustBtn;
    private WebElementFacade btnAdd;

    public void addFlight(FlightSearchDTO flightSearchDTO) {
        oneTrustBtn.click();
        vuelingPage.registerFlight(flightSearchDTO);
    }

    public List<FlightSearchDTO> getFlightList() {
        LOGGER.debug("getFlightList starts");

//        List<Map<Object, String>> rows = inTable(tblList).getRows();
//        List<FlightSearchDTO> reservations = rows.stream().map(this::mapReservation).collect(Collectors.toList());
//        return reservations;

        return null;
    }

    private FlightSearchDTO mapReservation(Map<Object, String> rowMap) {
        FlightSearchDTO flight = new FlightSearchDTO();
//        reservation.setName(rowMap.get("Name"));
//        reservation.setPhone(rowMap.get("Phone"));
//        reservation.setEmail(rowMap.get("Email"));
//        reservation.setDate(rowMap.get("Date"));
//        reservation.setNumber(rowMap.get("Number"));
//        reservation.setTime(rowMap.get("Time"));
//        reservation.setColor(rowMap.get("Table"));
        return flight;
    }
}

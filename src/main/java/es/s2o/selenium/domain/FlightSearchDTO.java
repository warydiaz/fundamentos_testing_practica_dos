package es.s2o.selenium.domain;

public class FlightSearchDTO {

    private String origin;
    private String destination;
    private String date;
    private String tripType;
    private int passengers;

    public FlightSearchDTO() {
        // Constructor vacío necesario para la deserialización
    }

    public FlightSearchDTO(String origin, String destination, String date, String tripType, int passengers) {
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.tripType = tripType;
        this.passengers = passengers;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "FlightSearchDTO{" +
                "origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", date='" + date + '\'' +
                ", tripType='" + tripType + '\'' +
                ", passengers=" + passengers +
                '}';
    }
}

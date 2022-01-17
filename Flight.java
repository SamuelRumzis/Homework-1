package org.depaul.se350.classdesignexample;

import org.depaul.se350.classdesignexample.exception.BadParameterException;
import org.depaul.se350.classdesignexample.exception.NullParameterException;

import java.util.Objects;

public class Flight {
//    public enum ProductType {
//        PRINT, FOOD, HEALTH, GENERAL
//    }

    private String flightTime;
    private String startDest;
    private String endDest;
    private boolean delayed;

    public Flight(String airportName, String city, String country, boolean delayed)
            throws NullParameterException, BadParameterException {
        this.flightTime = airportName;
        this.startDest = city;
        this.endDest = country;
        this.delayed = delayed;
    }

    // Get functions for 3 basic variables
    public String getFlightTime() {
        return flightTime;
    }

    public String getStartDest() {
        return startDest;
    }

    public String getEndDest() {
        return endDest;
    }

    public boolean getDelayed() {
        return delayed;
    }

    public String toString() {
        return "Flight: " + flightTime + "\n" + "Start Destination: " + startDest + "\n" + "End Destination: " + endDest + "\n" + "Delayed: " + delayed;
    }



    public boolean equals(Object obj) {
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        final Flight other = (Flight) obj;
        if (!flightTime.equals(other.flightTime)) {
            return false;
        }
        if (startDest != other.startDest) {
            return false;
        }
        if (endDest != other.endDest) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
       return Objects.hash(flightTime, startDest, endDest, delayed);
    }
}

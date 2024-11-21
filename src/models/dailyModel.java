/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Administrator
 */
public class dailyModel {

    /**
     * @return the busNo
     */
    public int getBusNo() {
        return busNo;
    }

    /**
     * @param busNo the busNo to set
     */
    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    /**
     * @return the seats
     */
    public int getSeats() {
        return seats;
    }

    /**
     * @param seats the seats to set
     */
    public void setSeats(int seats) {
        this.seats = seats;
    }

    /**
     * @return the route
     */
    public String getRoute() {
        return route;
    }

    /**
     * @param route the route to set
     */
    public void setRoute(String route) {
        this.route = route;
    }

    /**
     * @return the timeSched
     */
    public String getTimeSched() {
        return timeSched;
    }

    /**
     * @param timeSched the timeSched to set
     */
    public void setTimeSched(String timeSched) {
        this.timeSched = timeSched;
    }

    /**
     * @return the driver
     */
    public String getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * @return the conductor
     */
    public String getConductor() {
        return conductor;
    }

    /**
     * @param conductor the conductor to set
     */
    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public dailyModel(int busNo, int seats, String route, String timeSched, String driver, String conductor) {
        this.busNo = busNo;
        this.seats = seats;
        this.route = route;
        this.timeSched = timeSched;
        this.driver = driver;
        this.conductor = conductor;
    }
    
    private int busNo;
    private int seats;
    private String route;
    private String timeSched;
    private String driver;
    private String conductor;
}

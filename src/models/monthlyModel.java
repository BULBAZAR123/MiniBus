/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Administrator
 */
public class monthlyModel {

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
     * @return the estimatedtime
     */
    public String getEstimatedtime() {
        return estimatedtime;
    }

    /**
     * @param estimatedtime the estimatedtime to set
     */
    public void setEstimatedtime(String estimatedtime) {
        this.estimatedtime = estimatedtime;
    }

    public monthlyModel(String route, String estimatedtime) {
        this.route = route;
        this.estimatedtime = estimatedtime;
    }

    public monthlyModel() {
    }
    private String route;
    private String estimatedtime;
}

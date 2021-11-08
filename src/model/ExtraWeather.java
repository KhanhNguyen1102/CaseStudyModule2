package model;

import java.util.ArrayList;

public class ExtraWeather extends BasicWeather {
    private ArrayList<String> cloud;
    private ArrayList<String> airPressure;
    private ArrayList<String> vision;
    private ArrayList<String> dayTime;

    public ExtraWeather(ArrayList<String> dayTime, ArrayList<String> temperature, ArrayList<String> outdoorWeather, ArrayList<String> humidity, ArrayList<String> wind, ArrayList<String> cloud, ArrayList<String> airPressure, ArrayList<String> vision) {
        super(temperature, outdoorWeather, humidity, wind);
        this.cloud = cloud;
        this.airPressure = airPressure;
        this.vision = vision;
        this.dayTime = dayTime;
    }

    public ExtraWeather(ArrayList<String> dayTime, ArrayList<String> cloud, ArrayList<String> airPressure, ArrayList<String> vision) {
        this.cloud = cloud;
        this.airPressure = airPressure;
        this.vision = vision;
        this.dayTime = dayTime;
    }

    public ExtraWeather() {
    }

    public ArrayList<String> getDayTime() {
        return dayTime;
    }

    public void setDayTime(ArrayList<String> dayTime) {
        this.dayTime = dayTime;
    }

    public ArrayList<String> getCloud() {
        return cloud;
    }

    public void setCloud(ArrayList<String> cloud) {
        this.cloud = cloud;
    }

    public ArrayList<String> getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(ArrayList<String> airPressure) {
        this.airPressure = airPressure;
    }

    public ArrayList<String> getVision() {
        return vision;
    }

    public void setVision(ArrayList<String> vision) {
        this.vision = vision;
    }

    @Override
    public String toString() {
        return "ExtraWeather{" +
                " dayTime=" + dayTime +
                ", outdoorWeather=" + this.getOutdoorWeather() +
                "temperature=" + this.getTemperature() +
                ", humidity=" + this.getHumidity() +
                ", wind=" + this.getWind() +
                "cloud=" + cloud +
                ", airPressure=" + airPressure +
                ", vision=" + vision +

                '}';
    }
}

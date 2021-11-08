package model;

import java.util.ArrayList;

public class BasicWeather {
    private ArrayList<String> temperature;
    private ArrayList<String> outdoorWeather;
    private ArrayList<String> humidity;
    private ArrayList<String> wind;


    public BasicWeather(ArrayList<String> temperature, ArrayList<String> outdoorWeather, ArrayList<String> humidity, ArrayList<String> wind) {
        this.temperature = temperature;
        this.outdoorWeather = outdoorWeather;
        this.humidity = humidity;
        this.wind = wind;
    }

    public BasicWeather() {
    }

    public ArrayList<String> getTemperature() {
        return temperature;
    }

    public void setTemperature(ArrayList<String> temperature) {
        this.temperature = temperature;
    }

    public ArrayList<String> getOutdoorWeather() {
        return outdoorWeather;
    }

    public void setOutdoorWeather(ArrayList<String> outdoorWeather) {
        this.outdoorWeather = outdoorWeather;
    }

    public ArrayList<String> getHumidity() {
        return humidity;
    }

    public void setHumidity(ArrayList<String> humidity) {
        this.humidity = humidity;
    }

    public ArrayList<String> getWind() {
        return wind;
    }

    public void setWind(ArrayList<String> wind) {
        this.wind = wind;
    }

    @Override
    public String toString() {
        return "BasicWeather{" +
                "temperature=" + temperature +
                ", outdoorWeather=" + outdoorWeather +
                ", humidity=" + humidity +
                ", wind=" + wind +
                '}';
    }
}

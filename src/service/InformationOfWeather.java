package service;

import model.ExtraWeather;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static model.Validate.*;

public class InformationOfWeather {
    private static String weatherNow;
    private static String theNext10DaysWeatherInformation;
    private static ArrayList<String> listDays ;
    private static ArrayList<ExtraWeather> theNext10DaysWeather;

    public static String getTheNext10DaysWeatherInformation() {
        return theNext10DaysWeatherInformation;
    }

    public static void setTheNext10DaysWeatherInformation(String theNext10DaysWeatherInformation) {
        InformationOfWeather.theNext10DaysWeatherInformation = theNext10DaysWeatherInformation;
    }


    private InformationOfWeather() {
    }

    public String getWeatherNow() {
        return weatherNow;
    }

    public void setWeatherNow(String weatherNow) {
        this.weatherNow = weatherNow;
    }

    public static ArrayList<ExtraWeather> getTheNext10DaysWeather() {
        return theNext10DaysWeather;
    }

    public void setTheNext10DaysWeather(ArrayList<ExtraWeather> theNext10DaysWeather) {
        this.theNext10DaysWeather = theNext10DaysWeather;
    }

    public static ArrayList<String> getListDays() {
        return listDays;
    }

    public static void setListDays(ArrayList<String> listDays) {
        InformationOfWeather.listDays = listDays;
    }
    public static InformationOfWeather getInstance(){
        return InformationOfWeather.SingletonHelper1.INSTANCE;
    }
    private static class SingletonHelper1{
        private static final InformationOfWeather INSTANCE = new InformationOfWeather();
    }
    public static void getWeatherNowByLocation(String location){
        try {
            URL url= new URL("https://nchmf.gov.vn/Kttvsite/vi-VN/1/ha-noi-"+location+".html");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            weatherNow = scanner.next();
            scanner.close();
            weatherNow = weatherNow.replaceAll("\\n+", "");
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void getTheNext10DaysWeatherByLocation(String location){
        try {
            URL url= new URL("https://vi.meteotrend.com/forecast/vn/"+location+"/");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            theNext10DaysWeatherInformation = scanner.next();
            scanner.close();
            theNext10DaysWeatherInformation = theNext10DaysWeatherInformation.replaceAll("\\n+", "");
            Pattern p = Pattern.compile(REGEX_INFORMATION_OF_DAY);
            Matcher m = p.matcher(theNext10DaysWeatherInformation);
            listDays =new ArrayList<>();
            while (m.find()) {
                listDays.add(m.group());
            }
            ArrayList<ExtraWeather> theNext10DaysWeather = new ArrayList<>();
            for (int i = 0; i < listDays.size(); i++) {
                theNext10DaysWeather.add(createDayWeather(InformationOfWeather.getListDays().get(i)));
            }
            InformationOfWeather.getInstance().setTheNext10DaysWeather(theNext10DaysWeather);
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ExtraWeather createDayWeather(String information){
        ArrayList<String> dayTime = new ArrayList<>();
        ArrayList<String> outdoorWeather = new ArrayList<>();
        ArrayList<String> temperature = new ArrayList<>();
        ArrayList<String> wind = new ArrayList<>();
        ArrayList<String> humidity = new ArrayList<>();
        ArrayList<String> cloud = new ArrayList<>();
        ArrayList<String> airPressure = new ArrayList<>();
        ArrayList<String> vision = new ArrayList<>();

        Pattern p1 = Pattern.compile(REGEX_DAY_TIME);
        Matcher m1 = p1.matcher(information);
        while (m1.find()){
            dayTime.add(m1.group().substring(15).replaceAll("</b><i>",""));
        }

        Pattern p2 = Pattern.compile(REGEX_OUTDOOR_WEATHER);
        Matcher m2 = p2.matcher(information);
        while (m2.find()){
            int a = m2.group().indexOf("alt=\"");
            outdoorWeather.add(m2.group().substring(a+5).replaceAll("\" class=\"wcim\"",""));
        }
        Pattern p3 = Pattern.compile(REGEX_TEMPERATURE);
        Matcher m3 = p3.matcher(information);
        while (m3.find()){
            if (m3.group().length()> 38){
                temperature.add(m3.group().substring(12,15)+ "-"+ m3.group().substring(38,44));
            }else {
                temperature.add(m3.group().substring(12,18));
            }
        }
        Pattern p4 = Pattern.compile(REGEX_WIND);
        Matcher m4 = p4.matcher(information);
        while (m4.find()){
            wind.add("Gió :"+  m4.group().substring(41).replaceAll("</b></span>",""));
        }
        Pattern p5 = Pattern.compile(REGEX_HUMIDITY);
        Matcher m5 = p5.matcher(information);
        while (m5.find()){
            humidity.add("Độ ẩm tương đối" + m5.group().substring(20,26));
        }
        Pattern p6 = Pattern.compile(REGEX_CLOUD);
        Matcher m6 = p6.matcher(information);
        while (m6.find()){
            cloud.add("Mây :" + m6.group().substring(7).replaceAll("</b>",""));
        }
        Pattern p7 = Pattern.compile(REGEX_AIR_PRESSURE);
        Matcher m7 = p7.matcher(information);
        while (m7.find()){
            airPressure.add(m7.group().replaceAll("<b>","").replaceAll("<i","")+"hPa");
        }
        Pattern p8 = Pattern.compile(REGEX_VISION);
        Matcher m8 = p8.matcher(information);
        while (m8.find()){
            vision.add(m8.group().replaceAll("<b>","").replaceAll("</b>",""));
        }
        return new ExtraWeather(dayTime,temperature,outdoorWeather,humidity,wind,cloud,airPressure,vision);
    }

}

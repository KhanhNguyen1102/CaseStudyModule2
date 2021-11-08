package service;

import model.ExtraWeather;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static model.Validate.*;

public class WeatherService {
    public static void showWeatherNow(String location) {
        InformationOfWeather.getWeatherNowByLocation(location);
        ArrayList<String> toDayStatus = new ArrayList<>();
        Pattern p = Pattern.compile(REGEX_INFORMATION_NOW);
        Matcher m = p.matcher(InformationOfWeather.getInstance().getWeatherNow());
        for (int i = 0; i < 4; i++) {
            if (m.find()) {
                toDayStatus.add(m.group(1).replace("uk-width-3-4\">: ","").replace("</div>",""));
            }
        }
        for (String str:toDayStatus) {
            System.out.println(str);
        }
    }
    public static void showWeatherByDay(String location,int day){
        int index =getIndex(day);
        InformationOfWeather.getTheNext10DaysWeatherByLocation(location);
        System.out.println(InformationOfWeather.getTheNext10DaysWeather().get(index));
    }
    public static void showTheNext10DaysWeather(String location){
        InformationOfWeather.getTheNext10DaysWeatherByLocation(location);
        for (ExtraWeather weather:InformationOfWeather.getTheNext10DaysWeather()) {
            System.out.println(weather);
        }
    }
    public static int getIndex(int day){
        int toDay= LocalDateTime.now().getDayOfMonth();
        switch (LocalDateTime.now().getMonthValue()){
            case 1,3,5,7,8,10,12 -> {
                if (day-toDay < 0){
                    day = day + 31;
                }
                return day - toDay;
            }
            case 4,6,9,11 -> {
                if(day - toDay <0){
                    day = day + 30 ;
                }
                return day-toDay;
            }
            case 2 ->{
                if (day-toDay < 0){
                    day = day+ 28;
                }
                return day - toDay;
            }
        }
        return -1;
    }
}

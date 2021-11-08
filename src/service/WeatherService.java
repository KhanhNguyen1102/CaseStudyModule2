package service;


import model.ExtraWeather;

import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.Locale;
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
                toDayStatus.add(m.group(1).replace("uk-width-3-4\">: ", "").replace("</div>", ""));
            }
        }
        System.out.printf("%30s%-80s", " ", "(>♥˘◡˘♥)> Thời gian hiện tại :" + LocalDateTime.now().format(REGEX_TIME));
        System.out.println();
        System.out.printf("%30s%-80s", " ", "(>♥˘◡˘♥)> Nhiệt độ " + toDayStatus.get(0).substring(0, 2) + toDayStatus.get(0).substring(2, 4) + "°C");
        System.out.println();
        System.out.printf("%30s%-80s", " ", "(>♥˘◡˘♥)> Thời tiết ngoài trời " + toDayStatus.get(1));
        System.out.println();
        System.out.printf("%30s%-80s", " ", "(>♥˘◡˘♥)> Độ ẩm " + toDayStatus.get(2));
        System.out.println();
        System.out.printf("%30s%-80s", " ", "(>♥˘◡˘♥)> Hướng gió " + toDayStatus.get(3));
        System.out.println();
    }

    public static void showWeatherByDay(String location, int day) {
        int index = getIndex(day);
        InformationOfWeather.getTheNext10DaysWeatherByLocation(location);
        ExtraWeather weather = InformationOfWeather.getTheNext10DaysWeather().get(index);
        System.out.println("✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩");
        System.out.printf("%-10s%-10s%-25s%-15s%-10s%-25s%-10s%-20s%-12s%1s", "✩Ngày", "|Thời gian", "|Thời tiết", "|Nhiệt độ", "|Độ ẩm", "|Gió", "|Mây", "|Áp suất không khí", "|Tầm nhìn", "✩");
        System.out.println();
        System.out.print("✩----------------------------------------------------------------------------------------------------------------------------------------✩");
        System.out.println();
        for (int i = 0; i < weather.getDayTime().size(); i++) {
            for (int j = 0; j < 10; j++) {
                if (LocalDateTime.now().plusDays(j).getDayOfMonth() == day) {
                    System.out.printf("%-10s%-10s%-25s%-15s%-10s%-25s%-10s%-20s%-12s%1s", "✩" + day + "/" + LocalDateTime.now().plusDays(j).getMonthValue(), "|" + weather.getDayTime().get(i), "|" + weather.getOutdoorWeather().get(i).toLowerCase(Locale.ROOT), "|" + weather.getTemperature().get(i), "|" + weather.getHumidity().get(i).substring(15), "|" + weather.getWind().get(i).substring(5).toLowerCase(Locale.ROOT), "|" + weather.getCloud().get(i).substring(5), "|" + weather.getAirPressure().get(i).substring(18), "|" + weather.getVision().get(i).substring(18), "✩");
                    System.out.println();
                    System.out.print("✩----------------------------------------------------------------------------------------------------------------------------------------✩");
                    System.out.println();
                }
            }
        }
    }

    public static void showTheNext10DaysWeather(String location) {
        InformationOfWeather.getTheNext10DaysWeatherByLocation(location);
        System.out.println("✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩✩");
        System.out.printf("%-10s%-10s%-25s%-15s%-10s%-25s%-10s%-20s%-12s%1s", "✩Ngày", "|Thời gian", "|Thời tiết", "|Nhiệt độ", "|Độ ẩm", "|Gió", "|Mây", "|Áp suất không khí", "|Tầm nhìn", "✩");
        System.out.println();
        System.out.print("✩----------------------------------------------------------------------------------------------------------------------------------------✩");
        System.out.println();
        for (int i = 1; i < 4; i++) {
            ExtraWeather weather = InformationOfWeather.getTheNext10DaysWeather().get(i);
            for (int j = 0; j < weather.getDayTime().size(); j++) {
                System.out.printf("%-10s%-10s%-25s%-15s%-10s%-25s%-10s%-20s%-12s%1s", "✩" + LocalDateTime.now().plusDays(i).getDayOfMonth() + "/" + LocalDateTime.now().plusDays(i).getMonthValue(), "|" + weather.getDayTime().get(j), "|" + weather.getOutdoorWeather().get(j).toLowerCase(Locale.ROOT), "|" + weather.getTemperature().get(j), "|" + weather.getHumidity().get(j).substring(15), "|" + weather.getWind().get(j).substring(5).toLowerCase(Locale.ROOT), "|" + weather.getCloud().get(j).substring(5), "|" + weather.getAirPressure().get(j).substring(18), "|" + weather.getVision().get(j).substring(18), "✩");
                System.out.println();
                System.out.print("✩----------------------------------------------------------------------------------------------------------------------------------------✩");
                System.out.println();
            }
        }
    }

    public static int getIndex(int day) {
        int toDay = LocalDateTime.now().getDayOfMonth();
        switch (LocalDateTime.now().getMonthValue()) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (day - toDay < 0) {
                    day = day + 31;
                }
                return day - toDay;
            }
            case 4, 6, 9, 11 -> {
                if (day - toDay < 0) {
                    day = day + 30;
                }
                return day - toDay;
            }
            case 2 -> {
                if (day - toDay < 0) {
                    day = day + 28;
                }
                return day - toDay;
            }
        }
        return -1;
    }
}

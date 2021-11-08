package model;


import java.time.format.DateTimeFormatter;

public class Validate {
    public static DateTimeFormatter REGEX_TIME = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public static String REGEX_INFORMATION_NOW = "uk-width-3-4\">(.*?)</div>";
    public static String REGEX_INFORMATION_OF_DAY = "name=\"weather(.*?)class=\"foreca\">";
    public static String REGEX_DAY_TIME = "class=\"dtm\"><b>(.*?)</b><i>";
    public static String REGEX_OUTDOOR_WEATHER = "class=\"t0\"><img src=(.*?)\" class=\"wcim\"";
    public static String REGEX_TEMPERATURE = "wcim(.*?)class=\"wda\">";
    public static String REGEX_WIND = "Gió: <span class=\"fde_hint(.*?)</b></span>";
    public static String REGEX_HUMIDITY = "Độ ẩm tương đối: <b>(.*?)</b>";
    public static String REGEX_CLOUD = "Mây: <b>(.*?)</b>";
    public static String REGEX_AIR_PRESSURE = "Áp suất không khí: <b>(.*?)<i ";
    public static String REGEX_VISION = "Khả năng hiển thị:(.*?)</b>";

}

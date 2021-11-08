package controller;


import model.Cities;
import service.WeatherService;


import java.util.Scanner;
import java.util.TreeMap;

public class Menu {
    public static void app() {
        int choice = -1;
        showMenu();
        do {
            Scanner input = new Scanner(System.in);
            try {
                choice = input.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập lại số đi");
                input.nextLine();
                choice = -1;
            } finally {
                doChoice(choice);
                showMenu();
            }
        } while (true);
    }

    public static void doChoice(int choice) {
        switch (choice) {
            case 1 -> {
                String checkedLocation = checkInputLocation(Cities.cities1);
                WeatherService.showWeatherNow(checkedLocation);
            }
            case 2 -> {
                String checkedLocation1 = checkInputLocation(Cities.cities2);
                int day = checkInputDay();
                WeatherService.showWeatherByDay(checkedLocation1, day);
            }
            case 3 -> {
                String checkedLocation2 = checkInputLocation(Cities.cities2);
                WeatherService.showTheNext10DaysWeather(checkedLocation2);
            }
            case 4 -> {
                System.out.printf("%30s%-80s", " ", "(▰˘◡˘▰) Bye Bye!!!");
                System.exit(0);
            }
            default -> {
                System.err.printf("%30s%-80s", " ", "o(╥﹏╥)o Có 4 lựa chọn thôi má!");
                System.out.println();
                System.out.println();
            }
        }
    }

    public static void showMenu() {
        System.out.printf("%30s%-80s%30s", " ", "✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩", " ");
        System.out.println();
        System.out.printf("%30s%40s%41s%30s", "✩", "Menu", "✩", " ");
        System.out.println();
        System.out.printf("%30s%20s%-60s%-20s%-30s", "✩", " ", "1. Xem thời tiết hiện tại ", "✩", " ");
        System.out.println();
        System.out.printf("%30s%20s%-60s%-20s%-30s", "✩", " ", "2. Xem thời tiết 1 ngày trong 10 ngày tới", "✩", " ");
        System.out.println();
        System.out.printf("%30s%20s%-60s%-20s%-30s", "✩", " ", "3. Xem thời tiết 3 ngày tới", "✩", " ");
        System.out.println();
        System.out.printf("%30s%20s%-60s%-20s%-30s", "✩", " ", "4. Thoát", "✩", " ");
        System.out.println();
        System.out.printf("%30s%-80s%30s", " ", "✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩✰✩", " ");
        System.out.println();
    }

    public static String checkInputLocation(TreeMap<String, String> cities) {
        Scanner input = new Scanner(System.in);
        String checkedLocation = "fail";
        while (checkedLocation.equals("fail")) {
            System.out.printf("%30s%-80s", " ", "(>♥˘◡˘♥)> Điền tên thành phố muốn xem (ví dụ :Hội An) :");
            System.out.println();
            String location = input.nextLine();
            checkedLocation = Cities.getCity(location, cities);
            if (checkedLocation.equals("fail")) {
                System.err.printf("%30s%-80s", " ", "o(╥﹏╥)o Điền lại đúng định dạng nhé");
                System.out.println();
                System.out.println();
            }
        }
        return checkedLocation;
    }

    public static int checkInputDay() {
        Scanner input = new Scanner(System.in);
        int day;
        do {
            System.out.printf("%30s%-80s", " ", "(>♥˘◡˘♥)> Điền ngày muốn xem (phạm vi 10 ngày tới thôi nhé vd:24)");
            System.out.println();
            System.out.println();
            try {
                day = input.nextInt();
                if (WeatherService.getIndex(day) > 10) {
                    System.err.printf("%30s%-80s", " ", "o(╥﹏╥)o Ngày này ko đoán đượcccc");
                    System.out.println();
                    System.out.println();
                    day = -1;
                }
            } catch (Exception e) {
                System.err.printf("%30s%-80s", " ", "o(╥﹏╥)o Nhập số ! Số ấy !!!");
                System.out.println();
                System.out.println();
                input.nextLine();
                day = -1;
            }
        } while (day == -1);
        return day;
    }


}

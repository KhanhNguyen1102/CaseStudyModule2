package controller;


import model.Cities;
import service.WeatherService;


import java.util.Scanner;
import java.util.TreeMap;

public class Menu {
   public static void app(){
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
   public static void doChoice(int choice){
      Scanner input = new Scanner(System.in);
      switch (choice) {
         case 1 -> {
            String checkedLocation = checkInputLocation(Cities.cities1);
             WeatherService.showWeatherNow(checkedLocation);
         }
         case 2 -> {
            String checkedLocation1 = checkInputLocation(Cities.cities2);
            int day =checkInputDay() ;
            System.out.println(checkedLocation1);
            System.out.println(day);
            WeatherService.showWeatherByDay(checkedLocation1,day);
         }
         case 3 -> {
            String checkedLocation2 = checkInputLocation(Cities.cities2);
            WeatherService.showTheNext10DaysWeather(checkedLocation2);
         }
         case 4 -> System.exit(0);
         default -> System.out.println("Invalid choice");
      }
   }
   public static void showMenu() {
      System.out.println("Menu");
      System.out.println("1. Xem thời tiết hiện tại ");
      System.out.println("2. Xem thời tiết 1 ngày trong 10 ngày tới");
      System.out.println("3. Xem thời tiết 3 ngày tới");
      System.out.println("4. Thoát");
   }
   public static String checkInputLocation(TreeMap<String,String> cities){
      Scanner input = new Scanner(System.in);
      String checkedLocation ="fail";
      while (checkedLocation.equals("fail")){
         System.out.println("Điền tên thành phố muốn xem (ví dụ :Hội An) :");
         String location = input.nextLine();
         checkedLocation= Cities.getCity(location,cities);
         if (checkedLocation.equals("fail")){
            System.out.println("Điền lại đúng định dạng nhé");
         }
      }
      return checkedLocation;
   }
   public static int checkInputDay(){
      Scanner input =new Scanner(System.in);
      int day;
      do {
         System.out.println("Điền ngày muốn xem trong 10 ngày tới (ví dụ :hôm này mùng 1 có thể xem đến ngày 11) :");
         try {
            day = input.nextInt();
            if (WeatherService.getIndex(day)>10){
               System.out.println("Ngày này ko đoán đượcccc");
               day =-1;
            }
         } catch (Exception e) {
            System.out.println("Nhập lại 1 số đi");
            input.nextLine();
            day = -1;
         }
      } while (day == -1);
      return day;
   }


}

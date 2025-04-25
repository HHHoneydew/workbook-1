package week3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateExercises {
    public static void main(String[] args) {
        // exercise 1
        LocalDate ld1 = LocalDate.now();
        System.out.println("Today's date is: " + ld1);

        // exercise 2
        LocalDate ld2 = LocalDate.of(2025, 12,25);
        System.out.println(ld2);

        // exercise 3
        LocalDate ld3 = LocalDate.of(2005,10,12);
        int year = ld3.getYear();
        int month = ld3.getMonthValue();
        int day = ld3.getDayOfMonth();
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);

        // exercise 4
        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        // exercise 5
        LocalTime time2 = LocalTime.of(15,30);
        int hour1 = time2.getHour();
        int min1 = time2.getMinute();
        System.out.println(hour1);
        System.out.println(min1);

        // exercise 6
        LocalTime time3 = LocalTime.of(5,30);
        int hour = time3.getHour();
        int min = time3.getMinute();
        System.out.println("The hour is: " + hour);
        System.out.println("The minute is: " + min);

        // exercise 7
        LocalDate ld4 = LocalDate.of(2015, 10, 18);
        LocalTime lt1 = LocalTime.of (4, 30);
        LocalDateTime ld = ld4.atTime(lt1);
        System.out.println(ld);

        // exercise 8
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // exercise 9
        LocalDate ld5 = ld4.plusWeeks(1);
        System.out.println(ld5);

        //exercise 10
        LocalDate ld6 = ld3.minusDays(3);
        System.out.println(ld6);

        //exercise 11
        LocalTime localTime = LocalTime.now();
        LocalTime localT1 = localTime.plusHours(2).plusMinutes(15);
        System.out.println(localT1);

        //exercise 12
        LocalDateTime pre1Day = LocalDateTime.now();
        LocalDateTime plus1Day = pre1Day.plusDays(1);
        System.out.println(plus1Day);

        //exercise 13
        String birthDate = "03-04-1974";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate momBDay = LocalDate.parse(birthDate, dtf);
        System.out.println(momBDay);

        //exercise 14
        String birthTime = "4:30";
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("H:mm");
        LocalTime samBirthTime = LocalTime.parse(birthTime, dtf2);
        System.out.println(samBirthTime);


        //exercise 15
        String stringDate = "09:30 2025-04-01";
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm yyyy-MM-dd");
        LocalDateTime ldt1 = LocalDateTime.parse(stringDate, dtf3);
        System.out.println(ldt1);

        //exercise 16
        LocalDate bDay = LocalDate.of(2000,04,16);
        DateTimeFormatter dt4 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println(bDay);

        //exercise 17
        LocalTime heeHee = LocalTime.of(12,30);
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(heeHee);

        //exercise 18
        LocalDateTime moMo = LocalDateTime.now();








    }


}

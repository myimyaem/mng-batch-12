package JavaB12.Chapter3;
import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LDates {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        System.out.println(date1);
        System.out.println(date2);

        LocalTime time1 = LocalTime.of(23, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // +nanoseconds
        System.out.println(time1);

        LocalDateTime dateTime1 = LocalDateTime.of(2015,Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime2);

        // Manipulating Dates and Times
        //Dates plus&minus - Days,Weeks,Months,Years
        LocalDate date = LocalDate.of(2023, 12, 15);
        System.out.println(date.plusDays(10));
        System.out.println(date);
        System.out.println(date.minusMonths(1).minusDays(5));
        System.out.println(date);
        //Times plus&minus - Hours,Minutes,Seconds,Nanos
        LocalTime time = LocalTime.of(23, 30, 30,1000);
        System.out.println(time.minusMinutes(15));
        System.out.println(time);
        // LocalDateTime plus&minus - Days,Weeks,Months,Years / Hours,Minutes,Seconds,Nanos
        LocalDateTime localdatetime = LocalDateTime.of(date,time);
        System.out.println(localdatetime);
        System.out.println(localdatetime.plusDays(10).minusMinutes(15));
        System.out.println(localdatetime);
        // Formating Dates and Time
        //dates
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth()); 
        System.out.println(date.getYear()); 
        System.out.println(date.getDayOfYear()); 
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(dateTime.format(shortDateTime));
        /*
         * MMMM M represents the month. The more Ms you have, the more verbose the Java output.
            For example, M outputs 1, MM outputs 01, MMM outputs Jan, and MMMM outputs January.
            
            dd d represents the date in the month. As with month, the more ds you have, the more
            verbose the Java output. dd means to include the leading zero for a single-digit month.
            
            , Use , if you want to output a comma (this also appears after the year).
           
            yyyy y represents the year. yy outputs a two-digit year and yyyy outputs a four-digit year.
            
            hh h represents the hour. Use hh to include the leading zero if you’re outputting a singledigit
            hour.
            
            : Use : if you want to output a colon.
            
            mm m represents the minute.
         * 
         */
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, YYYY");
        System.out.println(dateTime.format(f));

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date3 = LocalDate.parse("01 02 2015", f2);
        LocalTime time4 = LocalTime.parse("11:22");
        System.out.println(date3); 
        System.out.println(time4); 
    }
}

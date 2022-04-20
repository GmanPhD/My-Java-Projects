import java.util.Date;

/*
1. Implement the isDateOdd(String date) method so that it returns true if the number of days since the beginning of the year is odd, and otherwise returns false
2. String date is passed in the form: FEBRUARY 1 2013
Don't forget to account for the first day of the year.

Example:
JANUARY 1 2000 = true
JANUARY 2 2020 = false

*/

public class Main {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date dd = new Date(date);
        Date dd2 = new Date(date);
        dd2.setDate(1);
        dd2.setMonth(0);
        long time = dd.getTime() - dd2.getTime();
        long days = time / 24 / 60 / 60000 + 1;
        return days % 2 == 1;
    }
}

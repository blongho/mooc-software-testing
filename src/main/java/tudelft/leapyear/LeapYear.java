package tudelft.leapyear;

public class LeapYear {

    public boolean isLeapYear(final int year) {
        if(year < 0) return false;
        return ((year % 400 == 0 || year % 100 != 0) && (year % 4 == 0));
    }
}

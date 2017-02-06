package week02;

/**
 * Created by awo on 06/02/17.
 */
public class CPR {
    private int day;
    private int month;
    private int year;
    private int lastFour;

    public CPR(int day, int month, int year, int lastFour) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.lastFour = lastFour;
    }

    @Override
    public String toString() {
        return "" + day + "" + month + "" + year + "-" + lastFour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CPR cpr = (CPR) o;

        if (day != cpr.day) return false;
        if (month != cpr.month) return false;
        if (year != cpr.year) return false;
        return lastFour == cpr.lastFour;
    }

    public static CPR stringToCPR(String str) {
        int day = Integer.parseInt(str.substring(0, 2));
        int month = Integer.parseInt(str.substring(2, 4));
        int year = Integer.parseInt(str.substring(4, 6));
        int lastFour = Integer.parseInt(str.substring(7));
        return new CPR(day, month, year, lastFour);
    }
}

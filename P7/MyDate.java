package P7;

public class MyDate {
    private int year;
    private int month;
    private int day;
    private String[] months= {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul","Aug", "Sep", "Oct", "Nov", "Dec"};
    private String[] days={"Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday"};
    private int[] daysInMonths= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean isLeapYear(int year) {
        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            return  true;
        }
        return false;
    }

    public boolean isValidDate(int year, int month, int day) {
        if(year > 0 && year <= 9999 && month > 0 && month <= 12 ) {
            if(months[month - 1] == "Feb" && isLeapYear(year) && day <= 29) {
                return true;
            } else if(daysInMonths[month - 1] >= day && day > 0) {
                return true;
            }
        }
        return false;
    }

    public int getDayOfWeek(int year, int month, int day) {
        int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] leapYearMonthNumbers    = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

        int firstTwoDigits = year / 100;
        int centuryNumber = 6 - 2 * (firstTwoDigits % 4);

        int lastTwoDigits = year % 100;

        int yearNumber = lastTwoDigits / 4;

        int monthNumber =  isLeapYear(year) ? leapYearMonthNumbers[month-1] : nonLeapYearMonthNumbers[month-1];

        int dayOfWeek = (centuryNumber + lastTwoDigits + yearNumber + monthNumber + day) % 7;

        return dayOfWeek;
    }

    public void throwError() {
        throw  new IllegalArgumentException("Invalid year, month or day");
    }

    public void setDate(int year, int month, int day) {

        if(isValidDate(year, month, day)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year, month or day!");
        }
    }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month > 0 && month <= 12) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if( year > 0 && year <= 9999) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        int checkMonth = getMonth();
        int dayMax = daysInMonths[checkMonth - 1];
        if(day <= dayMax && day > 0) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day!");
        }
    }

    public String toString() {
        int weekDay = getDayOfWeek(year, month, day);
        return String.format("%s %d %s %d", days[weekDay], day, months[month - 1], year);
    }

    public MyDate nextDay() {
        try {
            setDate(year, month, ++day);
            return this;
        } catch (Exception e){}

        day = 1;
        return nextMonth();
    }

    public MyDate nextMonth() {
        try {
            setDate(year, ++month, day);
            return this;
        } catch(Exception e){}

        month = 1;
        return nextYear();
    }


    public MyDate nextYear(){
        try {
            setDate(++year, month, day);
            return this;

        } catch (IllegalArgumentException e) { }

        int dayMax = 0;
        if (month != 2){
            dayMax = daysInMonths[month-2];
        } else {
            dayMax = isLeapYear(year) ? 29 : 28;
        }
        setDate(year, month, dayMax);
        return this;
    }

    public MyDate previousDay() {
        try {
            setDate(year, month, --day);
            return this;
        } catch (Exception e){}

        day = daysInMonths[month - 2];
        return previousMonth();
    }

    public MyDate previousMonth() {
        try {
            setDate(year, --month, day);
            return this;
        } catch (Exception e){}

        month = 12;
        return previousYear();
    }

    public  MyDate previousYear() {
        try {
            setDate(--year, month, day);
            return this;
        } catch (Exception e){}

        int dayMax = 0;
        if (month != 2){
            dayMax = daysInMonths[month-2];
        } else {
            dayMax = isLeapYear(year) ? 29 : 28;
        }
        setDate(year, month, dayMax);
        return this;
    }
}

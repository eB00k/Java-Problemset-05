package P7;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    MyTime() {}

    MyTime(int hour, int minute, int second) {
        if(hour < 0 || hour > 23 || minute < 0 || minute > 60 || second < 0 || second > 60) {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        } else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public void setTime(int hour, int minute, int second) {
        if(hour < 0 || hour > 23 || minute < 0 || minute > 60 || second < 0 || second > 60) {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        } else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        int xSec = getSecond();
        int xMin = getMinute();
        int xHour = getHour();
        if(xSec > 58) {
            xSec = 0;
            ++xMin;
            if(xMin > 59) {
                xMin = 0;
                ++xHour;
                if(xHour > 23) xHour = 0;
            }
        }
        return new MyTime(xHour, xMin, xSec);
    }

    public MyTime nextMinute() {
        int xMin = getMinute();
        int xHour = getHour();
        if(xMin > 59) {
            xMin = 0;
            ++xHour;
            if(xHour > 23) xHour = 0;
        }
        return new MyTime(xHour, xMin, getSecond());
    }

    public MyTime nextHour() {
        return new MyTime(getHour()+1, getMinute(), getSecond());
    }

    public MyTime previousSecond(){
        int checkSec = getSecond();
        int checkHour=getHour();
        int checkMin=getMinute();
        if (checkSec == 0){
            checkSec=59;
            checkMin--;
            if (checkMin<0){
                checkMin=59;
                checkHour--;
                if (checkHour<0){
                    checkHour=23;
                }
            }
        }else {
            checkSec--;
        }

        return new MyTime(checkHour, checkMin, checkSec);
    }

    public MyTime previousMinute(){
        int checkHour=getHour();
        int checkMin=getMinute();
        if (checkMin == 0){
            checkMin=59;
            checkHour--;
            if (checkHour<0){
                checkHour=23;
            }
        }else {
            checkMin--;
        }

        return new MyTime(checkHour, checkMin, getSecond());
    }

    public MyTime previousHour(){
        int checkHour=getHour();
        if (checkHour==0){
            checkHour=23;
        }else {
            checkHour--;
        }
        return new MyTime(checkHour, getMinute(), getSecond());
    }
}
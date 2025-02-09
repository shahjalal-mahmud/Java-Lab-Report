import java.util.Scanner;

class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Clock(int secondsSinceMidnight) {
        setClock(secondsSinceMidnight);
    }

    public void setClock(int secondsSinceMidnight) {
        this.hours = (secondsSinceMidnight / 3600) % 24;
        this.minutes = (secondsSinceMidnight % 3600) / 60;
        this.seconds = secondsSinceMidnight % 60;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) this.seconds = seconds;
    }

    // Increment time by one second
    public void tick() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours = (hours + 1) % 24;
            }
        }
    }

    // Decrement time by one second
    public void tickDown() {
        seconds--;
        if (seconds < 0) {
            seconds = 59;
            minutes--;
            if (minutes < 0) {
                minutes = 59;
                hours = (hours - 1 + 24) % 24;
            }
        }
    }

    // Add another clock's time
    public void addClock(Clock other) {
        int totalSeconds = (this.hours * 3600 + this.minutes * 60 + this.seconds) +
                           (other.hours * 3600 + other.minutes * 60 + other.seconds);
        setClock(totalSeconds);
    }

    // Subtract another clock's time
    public Clock subtractClock(Clock other) {
        int thisTotal = this.hours * 3600 + this.minutes * 60 + this.seconds;
        int otherTotal = other.hours * 3600 + other.minutes * 60 + other.seconds;
        int diffSeconds = Math.abs(thisTotal - otherTotal);
        return new Clock(diffSeconds);
    }

    @Override
    public String toString() {
        return String.format("(%02d:%02d:%02d)", hours, minutes, seconds);
    }
}

public class Question04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter seconds since midnight for firstClock: ");
        int secondsSinceMidnight = scanner.nextInt();
        Clock firstClock = new Clock(secondsSinceMidnight);
        
        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.println("firstClock: " + firstClock);
        }
        
        System.out.print("Enter hours for secondClock: ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes for secondClock: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter seconds for secondClock: ");
        int seconds = scanner.nextInt();
        
        Clock secondClock = new Clock(hours, minutes, seconds);
        
        for (int i = 0; i < 10; i++) {
            secondClock.tick();
            System.out.println("secondClock: " + secondClock);
        }
        
        firstClock.addClock(secondClock);
        
        System.out.println("After adding secondClock to firstClock:");
        System.out.println("firstClock: " + firstClock);
        System.out.println("secondClock: " + secondClock);
        
        Clock thirdClock = firstClock.subtractClock(secondClock);
        System.out.println("thirdClock (difference): " + thirdClock);
        
        scanner.close();
    }
}
package converters.time;

public class TimeConverter {
    
    // Convert hours to minutes
    public double hoursToMinutes(double hours) {
        return hours * 60;
    }
    
    // Convert minutes to hours
    public double minutesToHours(double minutes) {
        return minutes / 60;
    }
    
    // Convert hours to seconds
    public double hoursToSeconds(double hours) {
        return hours * 3600;
    }
    
    // Convert seconds to hours
    public double secondsToHours(double seconds) {
        return seconds / 3600;
    }
}

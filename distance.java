package converters.distance;



public class DistanceConverter {
    
    // Convert meters to kilometers
    public double metersToKilometers(double meters) {
        return meters / 1000;
    }
    
    // Convert kilometers to meters
    public double kilometersToMeters(double kilometers) {
        return kilometers * 1000;
    }
    
    // Convert miles to kilometers
    public double milesToKilometers(double miles) {
        return miles * 1.60934;
    }
    
    // Convert kilometers to miles
    public double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
}

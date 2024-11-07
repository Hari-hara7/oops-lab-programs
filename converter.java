package main;

import converters.distance.DistanceConverter;
import converters.time.TimeConverter;
import java.util.Scanner;

public class ConverterApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Instantiate the converters
        DistanceConverter distanceConverter = new DistanceConverter();
        TimeConverter timeConverter = new TimeConverter();
        
        // Distance Conversion Example
        System.out.println("Enter distance in meters:");
        double meters = scanner.nextDouble();
        System.out.println(meters + " meters = " + distanceConverter.metersToKilometers(meters) + " kilometers");
        
        System.out.println("Enter distance in miles:");
        double miles = scanner.nextDouble();
        System.out.println(miles + " miles = " + distanceConverter.milesToKilometers(miles) + " kilometers");
        
        // Time Conversion Example
        System.out.println("Enter time in hours:");
        double hours = scanner.nextDouble();
        System.out.println(hours + " hours = " + timeConverter.hoursToMinutes(hours) + " minutes");
        System.out.println(hours + " hours = " + timeConverter.hoursToSeconds(hours) + " seconds");
        
        scanner.close();
    }
}

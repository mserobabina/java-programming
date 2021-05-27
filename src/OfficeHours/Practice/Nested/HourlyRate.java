package OfficeHours.Practice.Nested;

public class HourlyRate {
    public static void main(String[] args) {
        int hourlyRate = 10;
        int weeklyHours = 40;
        int numberOfWeeks = 52;

        boolean hourlyRateIsValid = hourlyRate>0;
        boolean weeklyHoursAreValid = weeklyHours>0 && weeklyHours<=65;
        boolean numberOfWeeksAreValid = numberOfWeeks>0 && numberOfWeeks<=52;

    }
}

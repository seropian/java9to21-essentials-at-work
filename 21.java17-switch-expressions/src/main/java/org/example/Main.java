package org.example;

public class Main {
    public static void main(String[] args) {
        String day = "MONDAY";
        //the switch expression returns a value
        String typeOfDay = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> {
                //this is new feature
                //it returns a value from the switch expression instead of throwing an exception
                yield "Invalid day";
            }
        };
        System.out.println(typeOfDay); ;
    }

    private boolean isWeekDay(String day) {
        boolean weekDay;
        switch (day) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                weekDay = true;
                break;
            case "SATURDAY":
            case "SUNDAY":
                weekDay = false;
            default:
                throw new IllegalStateException("A new day was added in my week: " + day);
        }
        return weekDay;
    }
}
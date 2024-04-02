package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NewDateInterface dateAdapter = new CalendarToNewDateAdapter();

        // Set date to January 1, 2023
        dateAdapter.setYear(2023);
        dateAdapter.setMonth(1); // January
        dateAdapter.setDay(1);

        System.out.println("Original date: " + dateAdapter.getDay() + "/" + dateAdapter.getMonth() + "/" + dateAdapter.getYear());

        // Advance the date by 10 days
        dateAdapter.advanceDays(10);

        System.out.println("New date after advancing 10 days: " + dateAdapter.getDay() + "/" + dateAdapter.getMonth() + "/" + dateAdapter.getYear());
    }
}

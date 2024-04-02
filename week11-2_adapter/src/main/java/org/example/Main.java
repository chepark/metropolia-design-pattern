package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NewDateInterface dateAdapter = new CalendarToNewDateAdapter();

        dateAdapter.setYear(2024);
        dateAdapter.setMonth(4);
        dateAdapter.setDay(2);

        System.out.println("Original date: " + dateAdapter.getDay() + "/" + dateAdapter.getMonth() + "/" + dateAdapter.getYear());

        // Advance the date by 10 days
        dateAdapter.advanceDays(10);

        System.out.println("New date after advancing 10 days: " + dateAdapter.getDay() + "/" + dateAdapter.getMonth() + "/" + dateAdapter.getYear());
    }
}

package org.example;

public interface NewDateInterface {
    void setDay(int day);
    void setMonth(int month); // Note: Months are indexed from 0 in Calendar
    void setYear(int year);
    int getDay();
    int getMonth(); // Adjusts the month value for external use (1-12 instead of 0-11)
    int getYear();
    void advanceDays(int days);
}

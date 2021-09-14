package com.target.assignment.day1;

public class program1 {
    static int max_value = 9999;
    static int min_value = 1800;

    // Returns true if
    // given year is valid.
    static boolean isLeap(int year)
    {

        return (((year % 4 == 0) &&
                (year % 100 != 0)) ||
                (year % 400 == 0));
    }

    static boolean isValidDate(int year,int month,int date)
    {
        if (year > max_value ||
                year < min_value)
            return false;
        if (month < 1 || month > 12)
            return false;
        if (date < 1 || date > 31)
            return false;
        if (month == 2)
        {
            if (isLeap(year))
                return (date <= 29);
            else
                return (date <= 28);
        }

        if (month == 4 || month == 6 ||
                month == 9 || month == 11)
            return (date <= 30);

        return true;
    }
    public static void main(String args[])
    {
        if (isValidDate(2000, 12, 20))
            System.out.println("true");
        else
            System.out.println("false");

        if (isValidDate(3021, 11, 40))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

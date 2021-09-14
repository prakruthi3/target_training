package com.target.assignment.day2.assign;

import com.target.assignment.day2.model.Person;
import com.target.assignment.day2.model.Staff;
import com.target.assignment.day2.model.Student;

public class program13 {
    public program13() {
    }

    public static void main(String[] args) {
        Person[] people = new Person[]{new Student("Shyam", "Bangalore, Karnataka", "Java fundamentals", 2010, 4500.0D), new Staff("Anand", "Bangalore, Karnataka", "Delhi Public school", 35000.0D), new Staff("Umesh", "Bangalore, Karnataka", "National Public school", 42000.0D), new Student("Suresh", "Hassan, Karnataka", "Java fundamentals", 2012, 4750.0D), new Student("Kiran", "Vasco, Goa", "Reactjs", 2017, 12500.0D)};
        Person[] var2 = people;
        int var3 = people.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Person person = var2[var4];
            System.out.println(person);
        }

    }
}

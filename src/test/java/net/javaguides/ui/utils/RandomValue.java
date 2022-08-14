package net.javaguides.ui.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomValue {
    public  static  String newFirstName = RandomValue.setStudentFirstName();
    public static String newLastName = RandomValue.setStudentLastName();
    public static String newEmail = RandomValue.setStudentEmail();


    public static String setStudentFirstName() {
        String firstName = RandomStringUtils.randomAlphabetic(3,12);
        return firstName;
    }
    public static String setStudentLastName() {
        String lastName = RandomStringUtils.randomAlphabetic(3,12);
        return lastName;
    }
    public static String setStudentEmail() {
        String email = RandomStringUtils.randomAlphabetic(3,12) + "@gmail.com";
        return email;
    }


}
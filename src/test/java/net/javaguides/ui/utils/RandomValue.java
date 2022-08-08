package net.javaguides.ui.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomValue {
public final static  String firstName=RandomStringUtils.randomAlphabetic(3,12);
    public final static    String lastName=RandomStringUtils.randomAlphabetic(3,12);
    public final static   String email = RandomStringUtils.randomAlphabetic(3,12) + "@gmail.com";

   }
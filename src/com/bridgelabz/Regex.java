package com.bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
public interface Regex {
    public boolean validate(String pattern,String userInput);
}

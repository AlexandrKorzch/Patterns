package com.alex.patterns.strategy.java;

public class FirstAlgorithmJava implements AlgorithmJava {

    private String key = "q";

    @Override
    public String crypt(String text) {
        String returnText = "";
        for (int i = 0; i < text.length(); ++i) {
            returnText = returnText + text.charAt(i) + key;
        }
        return returnText;
    }
}
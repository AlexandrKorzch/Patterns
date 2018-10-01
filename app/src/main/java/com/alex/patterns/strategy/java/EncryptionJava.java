package com.alex.patterns.strategy.java;

public class EncryptionJava {

    AlgorithmJava mAlgorithm = new FirstAlgorithmJava();

    public String crypt(String text) {
       return mAlgorithm.crypt(text);
    }

    public void setAlgorithm(AlgorithmJava algorithm) {
        mAlgorithm = algorithm;
    }
}
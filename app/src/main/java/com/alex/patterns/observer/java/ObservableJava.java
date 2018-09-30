package com.alex.patterns.observer.java;

public interface ObservableJava {
    void addOrRemoveObservable(ObserverJava observer);
    void notifyObservers(String message);
}
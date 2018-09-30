package com.alex.patterns.observer.java;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObservableJava implements ObservableJava {

    private List<ObserverJava> mObservers = new ArrayList<>();

    @Override
    public void addOrRemoveObservable(ObserverJava observer) {
        if (mObservers.contains(observer)){
            mObservers.remove(observer);
        }else{
            mObservers.add(observer);
        }
    }

    @Override
    public void notifyObservers(String message) {
        for (ObserverJava observer: mObservers) {
            observer.handleEvent(message);
        }
    }
}
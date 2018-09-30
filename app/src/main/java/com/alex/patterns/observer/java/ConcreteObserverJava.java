package com.alex.patterns.observer.java;

public class ConcreteObserverJava implements ObserverJava {

    private NotifyWithMessage mNotify;

    public ConcreteObserverJava(NotifyWithMessage notify) {
        mNotify = notify;
    }

    @Override
    public void handleEvent(String message) {
        mNotify.message(message);
    }

    public interface NotifyWithMessage{
        void message(String message);
    }
}
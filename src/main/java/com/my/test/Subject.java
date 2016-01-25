package com.my.test;

import java.util.List;

import com.google.common.collect.Lists;

public abstract class Subject {
	
	private List<Observer> observers = Lists.newArrayList();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObserver() {
		for(Observer observer : observers) {
			observer.updateState();
		}
	}
}

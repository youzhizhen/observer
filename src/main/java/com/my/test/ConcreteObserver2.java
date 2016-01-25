package com.my.test;

public class ConcreteObserver2 extends Observer {
	
	private String observerState;
	private String name;
	private ConcreteSubject subject;

	public ConcreteObserver2(String name, ConcreteSubject subject) {
		this.name = name;
		this.subject = subject;
	}
	
	@Override
	public void updateState() {
		observerState = subject.getSubjectState();
		System.out.println(name + ":" + observerState);
	}

	public String getObserverState() {
		return observerState;
	}

	public String getName() {
		return name;
	}

	public ConcreteSubject getSubject() {
		return subject;
	}
}
